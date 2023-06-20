package service.ServiceIMPL;

import db.DateBase;
import model.Contact;
import model.Phone;
import service.ContactService;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.zip.CheckedInputStream;

public class ContactServiceIMPL implements ContactService {

    private DateBase dataBase;

    public ContactServiceIMPL(DateBase dataBase) {
        this.dataBase = dataBase;
    }

    public DateBase getDataBase() {
        return dataBase;
    }

    public void setDataBase(DateBase dateBase) {
        this.dataBase = dateBase;
    }


    @Override
    public String addCOntactToPhone(int id, Contact contact) {
        for (int i = 0; i < dataBase.getPhoneList().size(); i++) {
            if (dataBase.getPhoneList().get(i).getId() == id) {
                dataBase.getPhoneList().get(i).setContacts(contact);
            }
        }
        return "Contact saved successfully";
    }

    @Override
    public Contact findContactByName(int id, String contactName) {
        List<Phone> phones = dataBase.getPhoneList().stream().filter(phone -> phone.getId() == id).toList();
        List<Contact> contacts = phones.get(0).getContact().stream().filter(con -> con.getName().equalsIgnoreCase(contactName)).toList();

        return contacts.get(0);
    }

    @Override
    public Contact findContactByPhoneNumber(int id, String phoneNumber) {
        List<Phone> phones = dataBase.getPhoneList().stream().filter(phone -> phone.getId() == id).toList();
        List<Contact> contacts = phones.get(0).getContact().stream().filter(con -> con.getPhoneNumber().equalsIgnoreCase(phoneNumber)).toList();
        return contacts.get(0);
    }

    @Override
    public List<Contact> sortContactByName(int id) {

        List<Phone> phones = dataBase.getPhoneList().stream().filter(phone -> phone.getId() == id).toList();
        phones.get(0).getContact().sort(sort);
        return phones.get(0).getContact();
    }

    @Override
    public void deleteContactByNameFromPhone(int id, String contactName) {
        List<Phone> phones = dataBase.getPhoneList().stream().filter(phone -> phone.getId() == id).toList();
        phones.get(0).getContact().removeIf(contact -> contact.getName().equalsIgnoreCase(contactName));
        System.out.println(contactName + "Contact is delete ");
    }

    Comparator<Contact> sort = new Comparator<Contact>() {
        @Override
        public int compare(Contact o1, Contact o2) {
            return o1.getName().compareTo(o2.getName());
        }
    };


}
