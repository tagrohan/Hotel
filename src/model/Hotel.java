package model;

import java.util.List;

public class Hotel {

   String hotelId;
   String hotelName;

   List<Room> rooms;
   LocationOf locationOf;

   public Hotel() {
   }

   public Hotel(String hotelId, String hotelName, List<Room> rooms, LocationOf locationOf) {
      this.hotelId = hotelId;
      this.hotelName = hotelName;
      this.rooms = rooms;
      this.locationOf = locationOf;
   }
}
