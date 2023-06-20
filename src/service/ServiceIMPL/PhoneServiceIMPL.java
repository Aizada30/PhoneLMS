package service.ServiceIMPL;

import db.DateBase;
import model.Phone;
import service.PhoneService;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PhoneServiceIMPL implements PhoneService {

    DateBase dateBase = new DateBase();

    public PhoneServiceIMPL(DateBase dateBase) {
        this.dateBase = dateBase;
    }


    @Override
    public String addPhone(List<Phone> phoneList) {
        dateBase.getPhoneList().addAll(phoneList);
        return " New group have saved ";
    }

    @Override
    public Phone getPhoneById(int id) {
        dateBase.getPhoneList().stream()
                .filter(phone -> phone.getId() == id).toList().forEach(System.out::println);

//        for (Phone p : dateBase.getPhoneList()) {
//            if(p.getId()==id){
//                System.out.println(p.toString());
//            }
        //       }
        return null;
    }

    @Override
    public Phone updatePhoneById(int id, String newName) {
        dateBase.getPhoneList().stream().filter(phone -> phone.getId() == id).forEach(phone -> phone.setName(newName));

//        for (Phone p: dateBase.getPhoneList()) {
//            if (p.getId() == id) {
//                p.setName(newName);
//            } return p;
//        }

        return null;
    }

    @Override
    public List<Phone> getAllPhones() {


//        for (Phone p:dateBase.getPhoneList()) {
//            System.out.println(p.toString());
//        }
        return dateBase.getPhoneList();
    }

    @Override
    public List<Phone> getAllPhonesByBrand(String brand) {
        dateBase.getPhoneList().stream().filter(phone -> phone.getBrand().equalsIgnoreCase(brand)).toList().forEach(System.out::println);

//        for (Phone p : dateBase.getPhoneList()) {
//            if (p.getBrand().equalsIgnoreCase(brand)) {
//                System.out.println(p.toString());
//            }
//        }
        return dateBase.getPhoneList();
    }

    @Override
    public  void deletePhoneById(int id) {
//        List<T> duplicate = new ArrayList<>(dateBase.getPhoneList().size());
//        duplicate.stream()
//                .filter(predicate::test)
//                .forEach(dateBase.getPhoneList()::remove);

//        list.stream()
//                .forEach(x -> {
//                    if (predicate.test(x)) {
//                        newList.add(x);
//                    }
//                });
//
//        list.removeAll(newList);

//        for (Phone p: dateBase.getPhoneList()) {
//            if(p.getId()==id){
//                dateBase.getPhoneList().remove(p);
//            }

//     dateBase.getPhoneList().stream().filter(p -> p.getId() == id).forEach(phone -> phone.;

        for (Phone p: dateBase.getPhoneList()) {
            if(p.getId()==id){
                dateBase.getPhoneList().remove(p);
            }
        }
    }
            }
