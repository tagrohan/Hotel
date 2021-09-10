package z_test.payment;

import z_test.interfaces.BaseRoomCharge;

public class RoomCharge implements BaseRoomCharge {


   double cost;

   @Override
   public Double getCost() {
      return cost;
   }

   void setCost(double cost) {
      this.cost = cost;
   }

   public RoomCharge(double cost) {
      this.cost = cost;
   }

   public RoomCharge() {
   }
}