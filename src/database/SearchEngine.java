package database;

import enums.RoomType;
import model.Room;

import java.util.ArrayList;
import java.util.List;

public class SearchEngine {


   public static List<Room> searchByType(RoomType type) {
      List<Room> rooms = new ArrayList<>();
      for (Room room : Rooms.getRooms()) {
         if (room.getRoomType() == type) {
            rooms.add(room);
         }
      }
      return rooms;
   }

   public static List<Room> getBookedRoom() {
      return BookedRoomDetails.getBookedRooms();
   }
}
