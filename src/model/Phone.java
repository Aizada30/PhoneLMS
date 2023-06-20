package model;

import java.util.ArrayList;
import java.util.List;

public class Phone {

    private int id;
    private String name;
    private String brand;
    private List<Contact> contact;

    public Phone (){

    }

    public Phone(int id, String name, String brand) {
        this.id = id;
        this.name = name;
        this.brand = brand;
    }

    public Phone(int id, String name, String brand, List<Contact> contact) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.contact = contact;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public List<Contact> getContact() {
        return contact;
    }

    public void setContact(List<Contact> contact) {
        this.contact = contact;
    }
    public void setContacts(Contact contact){
        if (this.contact==null){
            this.contact=new ArrayList<>();
        }
        this.contact.add(contact);
    }

    @Override
    public String toString() {
        return "\n          PHONE ->  " +
                "\nID : " + id +
                "\nNAME : " + name +
                "\nBRAND : " + brand +
                "\n          CONTACT : " + contact
           ;
    }
}
