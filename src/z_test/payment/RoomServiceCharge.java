package z_test.payment;

import z_test.interfaces.BaseRoomCharge;

public class RoomServiceCharge implements BaseRoomCharge {

   double cost;
   RoomCharge roomCharge;


   @Override
   public Double getCost() {
      roomCharge.setCost(roomCharge.getCost() + cost);
      return roomCharge.getCost();
   }

   public RoomServiceCharge(double cost, RoomCharge roomCharge) {
      this.cost = cost;
      this.roomCharge = roomCharge;
   }

   public RoomServiceCharge() {
   }
}
