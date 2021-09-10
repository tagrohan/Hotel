package model;

import java.util.Date;

public class GeneratedKey {

   String keyId;
   String keyCode;
   Date issuedAt;
   Date releaseAt;
   Room room;

   boolean isMaster;
   boolean isActive;

   public GeneratedKey() {
   }

   public GeneratedKey(String keyId, String keyCode, Date issuedAt, Date releaseAt, Room room, boolean isMaster, boolean isActive) {
      this.keyId = keyId;
      this.keyCode = keyCode;
      this.issuedAt = issuedAt;
      this.releaseAt = releaseAt;
      this.room = room;
      this.isMaster = isMaster;
      this.isActive = isActive;
   }

   public String getKeyId() {
      return keyId;
   }

   public void setKeyId(String keyId) {
      this.keyId = keyId;
   }

   public String getKeyCode() {
      return keyCode;
   }

   public void setKeyCode(String keyCode) {
      this.keyCode = keyCode;
   }

   public Date getIssuedAt() {
      return issuedAt;
   }

   public void setIssuedAt(Date issuedAt) {
      this.issuedAt = issuedAt;
   }

   public Date getReleaseAt() {
      return releaseAt;
   }

   public void setReleaseAt(Date releaseAt) {
      this.releaseAt = releaseAt;
   }

   public Room getRoom() {
      return room;
   }

   public void setRoom(Room room) {
      this.room = room;
   }

   public boolean isMaster() {
      return isMaster;
   }

   public void setMaster(boolean master) {
      isMaster = master;
   }

   public boolean isActive() {
      return isActive;
   }

   public void setActive(boolean active) {
      isActive = active;
   }
}
