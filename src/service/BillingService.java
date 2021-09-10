package service;

import model.Room;

import java.util.List;

public class BillingService {

   // todo on billing and refund if have time

   public static double calculateBasePrice(List<Room> rooms) {
      return 1999.0 * rooms.size();
   }
}
