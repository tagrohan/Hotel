package z_test.model;

import z_test.enums.AccountStatus;

public class Account {

   String username;
   String password;

   AccountStatus accountStatus;

   public Account() {
   }

   public Account(String username, String password, AccountStatus accountStatus) {
      this.username = username;
      this.password = password;
      this.accountStatus = accountStatus;
   }
}
