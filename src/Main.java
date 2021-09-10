import enums.RoomType;
import model.GeneratedKey;
import model.Guest;
import model.Room;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.List;

public class Main {
   public static void main(String[] args) {


      Guest guest = new Guest("Rohan", "800", "add", false);
      List<Room> rooms = guest.searchRoom(RoomType.SMALL);
      List<GeneratedKey> keys = guest.bookRoom(rooms);

      System.out.println(guest);
//
//      System.out.println(ChronoUnit.DAYS.between(LocalDateTime.now(), LocalDateTime.now()));


//      Guest guest = new Guest("Rohan", new Account("tagrohan", "password", AccountStatus.ACTIVE), "8006632019");
//
//      Room room = new Room("12", RoomStyle.DELUX, RoomStatus.AVAILABLE, 1999.99);
//      Room room2 = new Room("112", RoomStyle.FAMILY_SUITE, RoomStatus.AVAILABLE, 2999.99);
//      List<Room> rooms = List.of(room, room2);
//
//      RoomServiceCharge serviceCharge = new RoomServiceCharge(299, new RoomCharge(199.99));
//
//      RoomBooking booking = new RoomBooking(
//              "ID : 1521", new Date(), 2, BookingStatus.AVAILABLE, guest,
//              rooms, serviceCharge
//      );
//
//      Receptionist receptionist = new Receptionist();
//      receptionist.checkInGuest(guest, booking);
//      receptionist.checkInGuest(guest, booking);

   }
}

//      RoomServiceCharge serviceCharge2 = new RoomServiceCharge(1000, new RoomCharge(2999.99));
