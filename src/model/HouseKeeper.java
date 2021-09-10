package model;

import z_test.interfaces.Person;
import z_test.model.Account;

import java.util.Date;

public class HouseKeeper extends Person {

   String housekeepingLog;
   Date onWhatDat;

   public HouseKeeper() {
   }

   public HouseKeeper(String name, Account accountDetail, String phone) {
      super(name, accountDetail, phone);
   }
}
