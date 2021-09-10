package database;

import model.Room;

import java.util.ArrayList;
import java.util.List;

public class BookedRoomDetails {
   static List<Room> rooms = new ArrayList<>();

   public static void saveBookedRooms(Room room) {
      rooms.add(room);
   }

   public static List<Room> getBookedRooms() {
      return rooms;
   }
}
