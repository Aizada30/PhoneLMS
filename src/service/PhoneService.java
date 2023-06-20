package service;

import model.Phone;

import java.util.List;
import java.util.function.Predicate;

public interface PhoneService {
    /*todo

     - String addPhone(Phone phone);

    // with stream

       - Phone getPhoneById(int phoneId);

    // with stream

      - Phone updatePhoneNameById(int phoneId, String newName);

    // with stream

      - List<Phone> getAllPhones();

    // with stream

      - List<Phone> getAllPhonesByBrand(String brand);

     - void deletePhoneById(int phoneId);*/

    //-----------------------------------------------------------------------
    String addPhone(List<Phone> phoneList);

    Phone getPhoneById(int id);

    Phone updatePhoneById(int id, String newName);

    List<Phone> getAllPhones();

    List<Phone> getAllPhonesByBrand(String brand);

    void deletePhoneById(int id);


}
