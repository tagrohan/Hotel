package database;

import enums.RoomStatus;
import enums.RoomType;
import model.Room;

import java.util.List;

public class Rooms {

   public static List<Room> getRooms() {

      return List.of(
              new Room("1", RoomType.SMALL, RoomStatus.AVAILABLE, 1999.99, 1, List.of()),
              new Room("2", RoomType.DELUXE, RoomStatus.AVAILABLE, 2999.99, 2, List.of()),
              new Room("3", RoomType.STANDARD, RoomStatus.AVAILABLE, 2599.99, 2, List.of()),
              new Room("4", RoomType.FAMILY_SIZE, RoomStatus.AVAILABLE, 3999.99, 3, List.of()),
              new Room("5", RoomType.STANDARD, RoomStatus.AVAILABLE, 2599.99, 2, List.of()),
              new Room("6", RoomType.SMALL, RoomStatus.AVAILABLE, 1999.99, 1, List.of()),

              new Room("7", RoomType.DELUXE, RoomStatus.AVAILABLE, 2999.99, 2, List.of()),
              new Room("8", RoomType.STANDARD, RoomStatus.AVAILABLE, 2599.99, 2, List.of()),
              new Room("9", RoomType.SMALL, RoomStatus.AVAILABLE, 1999.99, 1, List.of()),
              new Room("10", RoomType.FAMILY_SIZE, RoomStatus.AVAILABLE, 3999.99, 3, List.of()),
              new Room("11", RoomType.FAMILY_SIZE, RoomStatus.AVAILABLE, 3999.99, 3, List.of())
      );
   }

}
