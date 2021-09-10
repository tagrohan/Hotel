package z_test.payment;

import z_test.interfaces.BaseRoomCharge;

public class InRoomPurchaseCharges implements BaseRoomCharge {

   double cost;
   RoomCharge roomCharge;


   @Override
   public Double getCost() {
      roomCharge.setCost(roomCharge.getCost() + cost);
      return roomCharge.getCost();
   }
}