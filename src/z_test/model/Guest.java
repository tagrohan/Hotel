package z_test.model;

import z_test.interfaces.Person;

import java.util.List;

public class Guest extends Person {

   Search searchObj;
   Booking bookingObj;

   public List<RoomBooking> getAllRoomBookings() {
      return List.of();
   }

   public RoomBooking createBooking() {
      return new RoomBooking();
   }

   public RoomBooking cancelBooking(int bookingId) {
      return new RoomBooking();
   }

   public Guest() {
   }

   public Guest(String name, Account accountDetail, String phone) {
      super(name, accountDetail, phone);
   }


}
