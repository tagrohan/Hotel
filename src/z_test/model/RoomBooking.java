package z_test.model;


import z_test.enums.BookingStatus;
import z_test.interfaces.BaseRoomCharge;

import java.util.Date;
import java.util.List;

public class RoomBooking {

   String bookingId;
   Date startDate;
   int durationInDays;
   BookingStatus bookingStatus;
   Guest guest;
   List<Room> roomInfo;
   BaseRoomCharge totalRoomCharges;

   public RoomBooking() {
   }

   public RoomBooking(String bookingId, Date startDate, int durationInDays, BookingStatus bookingStatus, Guest guest, List<Room> roomInfo, BaseRoomCharge totalRoomCharges) {
      this.bookingId = bookingId;
      this.startDate = startDate;
      this.durationInDays = durationInDays;
      this.bookingStatus = bookingStatus;
      this.guest = guest;
      this.roomInfo = roomInfo;
      this.totalRoomCharges = totalRoomCharges;
   }
}