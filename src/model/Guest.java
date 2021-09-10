package model;

import database.SearchEngine;
import enums.RoomType;
import interfaces.Person;
import service.RoomBooking;

import java.util.List;

// todo guest
public class Guest extends Person {

   AccountOfGuest account;

   LocationOf locationOf;

   RoomBooking bookingInfo;

   public RoomBooking getBookingInfo() {
      return bookingInfo;
   }

   public void setBookingInfo(RoomBooking bookingInfo) {
      this.bookingInfo = bookingInfo;
   }

   public List<GeneratedKey> bookRoom(List<Room> rooms) {
      Receptionist receptionist = new Receptionist();
      return receptionist.checkIn(rooms, this);
   }


   public List<Room> searchRoom(RoomType roomType) {

      List<Room> rooms = SearchEngine.searchByType(roomType);
      if (rooms.isEmpty()) {
         print("Sorry No room available");
      }
      return rooms;
   }

   public List<Room> searchRoom(double priceRange) {
      return List.of();
   }

   private void print(String msg) {
      System.out.println(msg);
   }


   public Guest(String name, String contactNo, String address, boolean isOfficeGuy) {
      super(name, contactNo, address, isOfficeGuy);
   }

   public Guest(String name, String contactNo, String address, boolean isOfficeGuy, AccountOfGuest account, LocationOf locationOf) {
      super(name, contactNo, address, isOfficeGuy);
      this.account = account;
      this.locationOf = locationOf;
   }

   public AccountOfGuest getAccount() {
      return account;
   }

   public void setAccount(AccountOfGuest account) {
      this.account = account;
   }

   public LocationOf getLocationOf() {
      return locationOf;
   }

   public void setLocationOf(LocationOf locationOf) {
      this.locationOf = locationOf;
   }

   @Override
   public String toString() {
      return "Guest{" +
              "name='" + name + '\'' +
              ", contactNo='" + contactNo + '\'' +
              ", address='" + address + '\'' +
              ", bookingInfo=" + bookingInfo +
              '}';
   }
}
