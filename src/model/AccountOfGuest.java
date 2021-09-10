package model;

public class AccountOfGuest {

   String username;
   String password;
   String email;

   boolean isActive;

   public AccountOfGuest() {
   }

   public AccountOfGuest(String username, String password, String email, boolean isActive) {
      this.username = username;
      this.password = password;
      this.email = email;
      this.isActive = isActive;
   }

   public String getUsername() {
      return username;
   }

   public void setUsername(String username) {
      this.username = username;
   }

   public String getPassword() {
      return password;
   }

   public void setPassword(String password) {
      this.password = password;
   }

   public String getEmail() {
      return email;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public boolean isActive() {
      return isActive;
   }

   public void setActive(boolean active) {
      isActive = active;
   }
}
