package model;


import interfaces.Person;
import service.RoomBooking;

import java.util.Date;
import java.util.List;

// responsible for book/cancel/check in/out
public class Receptionist extends Person {

   public List<GeneratedKey> checkIn(List<Room> rooms, Guest guest) {

      RoomBooking booking = new RoomBooking("ID : 55", guest, rooms, new Date());
      return booking.createBooking();
   }

   public List<GeneratedKey> checkIn(RoomBooking roomBooking) {

      // going to call service to book a room // todo for guest search
      return List.of();
   }

}
