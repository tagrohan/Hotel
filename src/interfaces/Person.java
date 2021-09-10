package interfaces;

public abstract class Person {
   public String name;
   public String contactNo;
   public String address;
   boolean isOfficeGuy;

   public Person(String name, String contactNo, String address, boolean isOfficeGuy) {
      this.name = name;
      this.contactNo = contactNo;
      this.address = address;
      this.isOfficeGuy = isOfficeGuy;
   }

   public Person() {
   }
}
