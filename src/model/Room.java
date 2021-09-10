package model;

import enums.RoomStatus;
import enums.RoomType;

import java.util.Date;
import java.util.List;

public class Room {

   String roomId;

   RoomType roomType;
   RoomStatus roomStatus;
   double roomPrice;
   int noOfBeds;

   Date issuedOn;
   Date releaseOn;

   List<HouseKeeping> housekeepingTasks;

   public Room() {
   }

   public Room(String roomId, RoomType roomType, RoomStatus roomStatus, double roomPrice, int noOfBeds, Date issuedOn, Date releaseOn, List<HouseKeeping> housekeepingTasks) {
      this.roomId = roomId;
      this.roomType = roomType;
      this.roomStatus = roomStatus;
      this.roomPrice = roomPrice;
      this.noOfBeds = noOfBeds;
      this.issuedOn = issuedOn;
      this.releaseOn = releaseOn;
      this.housekeepingTasks = housekeepingTasks;
   }

   public Room(String roomId, RoomType roomType, RoomStatus roomStatus, double roomPrice, int noOfBeds, List<HouseKeeping> housekeepingTasks) {
      this.roomId = roomId;
      this.roomType = roomType;
      this.roomStatus = roomStatus;
      this.roomPrice = roomPrice;
      this.noOfBeds = noOfBeds;
      this.housekeepingTasks = housekeepingTasks;
   }

   public String getRoomId() {
      return roomId;
   }

   public void setRoomId(String roomId) {
      this.roomId = roomId;
   }

   public RoomType getRoomType() {
      return roomType;
   }

   public void setRoomType(RoomType roomType) {
      this.roomType = roomType;
   }

   public RoomStatus getRoomStatus() {
      return roomStatus;
   }

   public void setRoomStatus(RoomStatus roomStatus) {
      this.roomStatus = roomStatus;
   }

   public double getRoomPrice() {
      return roomPrice;
   }

   public void setRoomPrice(double roomPrice) {
      this.roomPrice = roomPrice;
   }

   public int getNoOfBeds() {
      return noOfBeds;
   }

   public void setNoOfBeds(int noOfBeds) {
      this.noOfBeds = noOfBeds;
   }

   public Date getIssuedOn() {
      return issuedOn;
   }

   public void setIssuedOn(Date issuedOn) {
      this.issuedOn = issuedOn;
   }

   public Date getReleaseOn() {
      return releaseOn;
   }

   public void setReleaseOn(Date releaseOn) {
      this.releaseOn = releaseOn;
   }

   public List<HouseKeeping> getHousekeepingTasks() {
      return housekeepingTasks;
   }

   public void setHousekeepingTasks(List<HouseKeeping> housekeepingTasks) {
      this.housekeepingTasks = housekeepingTasks;
   }

   @Override
   public String toString() {
      return "Room{" +
              "roomId='" + roomId + '\'' +
              ", roomType=" + roomType +
              ", roomStatus=" + roomStatus +
              ", roomPrice=" + roomPrice +
              ", noOfBeds=" + noOfBeds +
              ", issuedOn=" + issuedOn +
              ", releaseOn=" + releaseOn +
              '}';
   }
}
