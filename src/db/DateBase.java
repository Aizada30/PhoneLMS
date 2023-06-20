package db;

import model.Phone;

import java.util.List;

public class DateBase {

   private List<Phone> phoneList;

   public DateBase (){

   }

   public DateBase(List<Phone> phoneList) {
      this.phoneList = phoneList;
   }

   public List<Phone> getPhoneList() {
      return phoneList;
   }

   public void setPhoneList(List<Phone> phoneList) {
      this.phoneList = phoneList;
   }

   @Override
   public String toString() {
      return "DateBase -->> " +
              "phone LIST : " + phoneList
              ;
   }
}
