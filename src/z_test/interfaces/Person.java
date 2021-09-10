package z_test.interfaces;

import z_test.model.Account;

public abstract class Person {

   public String name;
   public Account accountDetail;
   public String phone;

   public Person() {
   }

   public Person(String name, Account accountDetail, String phone) {
      this.name = name;
      this.accountDetail = accountDetail;
      this.phone = phone;
   }
}