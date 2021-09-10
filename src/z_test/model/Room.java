package z_test.model;

import z_test.enums.RoomStatus;
import z_test.enums.RoomStyle;

import java.util.List;

public class Room {

   String roomNumber;
   RoomStyle roomStyle;
   RoomStatus roomStatus;
   Double bookingPrice;
   List<RoomKey> roomKeys;
   List<HouseKeepingLog> houseKeepingLogs;


   public Room(String roomNumber, RoomStyle roomStyle, RoomStatus roomStatus, Double bookingPrice) {
      this.roomNumber = roomNumber;
      this.roomStyle = roomStyle;
      this.roomStatus = roomStatus;
      this.bookingPrice = bookingPrice;
   }

   public Room() {
   }

   public Room(String roomNumber, RoomStyle roomStyle, RoomStatus roomStatus, Double bookingPrice, List<RoomKey> roomKeys, List<HouseKeepingLog> houseKeepingLogs) {
      this.roomNumber = roomNumber;
      this.roomStyle = roomStyle;
      this.roomStatus = roomStatus;
      this.bookingPrice = bookingPrice;
      this.roomKeys = roomKeys;
      this.houseKeepingLogs = houseKeepingLogs;
   }
}
