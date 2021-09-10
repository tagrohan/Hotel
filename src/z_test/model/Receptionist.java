package z_test.model;


import z_test.enums.BookingStatus;
import z_test.interfaces.Person;

// todo it's a service class
public class Receptionist extends Person {

   Search searchObj;
   Booking bookingObj;

   public void checkInGuest(Guest guest, RoomBooking bookingInfo) {
      if (guest.accountDetail.username.equals(bookingInfo.guest.accountDetail.username)) {
         // status of booking

         switch (bookingInfo.bookingStatus) {
            case BOOKED:
               printStatement("Already Booked");
               break;
            case AVAILABLE:
               printStatement("Room Booked Successfully");
               // after update status and add to database
               bookingInfo.bookingStatus = BookingStatus.BOOKED;
               break;
            case CANCELED:
               printStatement("Booking was canceled");
               break;
            case PENDING:
               printStatement("Booking is pending");
               break;
            case QUEUED:
         }

      } else {
         printStatement("Details did not matched");
      }

   }

   private void printStatement(String msg) {
      System.out.println(msg);
   }

   public void checkOutGuest(Guest guest, RoomBooking bookingInfo) {
      // todo
   }

}