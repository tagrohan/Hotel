package service;

import database.BookedRoomDetails;
import enums.BookingStatus;
import enums.RoomStatus;
import model.GeneratedKey;
import model.Guest;
import model.Room;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class RoomBooking {
   String bookingId;
   Guest guest;
   List<Room> rooms;
   Date bookedAt;
   double totalPrice;
   BookingStatus bookingStatus;


   public List<GeneratedKey> createBooking() {
      if (guest.getAccount() != null && guest.getAccount().isActive()) {
         System.out.println("account is not active or blocked");
         return new ArrayList<>();
      }
      if (guest != null && !rooms.isEmpty()) {
         for (Room room : rooms) {
            if (room.getRoomStatus() != RoomStatus.AVAILABLE) {
               print("room is not available");
               return new ArrayList<>();
            } else room.setRoomStatus(RoomStatus.BOOKED);
         }
         totalPrice += BillingService.calculateBasePrice(rooms);
         bookingStatus = BookingStatus.BOOKED;
         guest.setBookingInfo(this);
      } else {
         print("Details are wrong check again!");
      }
      // key generating time
      List<GeneratedKey> keys = new ArrayList<>();
      for (Room room : rooms) {
         keys.add(new GeneratedKey((room.getRoomId() + new Random().nextInt(100)), room.getRoomId() + new Date(),
                 new Date(), null, room, false, true));
         BookedRoomDetails.saveBookedRooms(room);
      }
      print("booking confirmed!");
      return keys;
   }

   private void print(String msg) {
      System.out.println(msg);
   }


   public RoomBooking() {
   }

   public RoomBooking(String bookingId, Guest guest, List<Room> rooms, Date bookedAt) {
      this.bookingId = bookingId;
      this.guest = guest;
      this.rooms = rooms;
      this.bookedAt = bookedAt;
      this.bookingStatus = BookingStatus.WAITING;
   }

   @Override
   public String toString() {
      return "RoomBooking{" +
              "bookingId='" + bookingId + '\'' +
              ", rooms=" + rooms +
              ", bookedAt=" + bookedAt +
              ", totalPrice=" + totalPrice +
              ", bookingStatus=" + bookingStatus +
              '}';
   }
}
