import db.DateBase;
import model.Contact;
import model.Phone;
import service.ContactService;
import service.PhoneService;
import service.ServiceIMPL.ContactServiceIMPL;
import service.ServiceIMPL.PhoneServiceIMPL;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        List<Phone> phoneList = new ArrayList<>();


        PhoneService phoneService = new PhoneServiceIMPL(new DateBase(phoneList));
        ContactService contactService = new ContactServiceIMPL(new DateBase(phoneList));


        boolean isTrue = true;
        while (isTrue) {
            System.out.println("""
                    Enter what you need 
                    1 - to save phone 
                    2 - get all phones
                    3 - get phone by id
                    4 - get phone by brand
                    5 - to update by id
                    6 - delete phone by id
                    7 - add new contact
                    8 - add
                    9 - add new contact 
                    10 - find contact by name
                    11 - find contact by number
                    12 - sort by name 
                    13 - delete contact by name 
                    14 - stop 
                     """);
            int num = scanner.nextInt();
            switch (num) {
                case 1 : System.out.println(phoneService.addPhone(new ArrayList<>(List.of(
                        new Phone(1, "Aizada", "Sumsung")
                        , new Phone(2, "Jiro", "IPhone")
                        , new Phone(3, "Haru", "Lenova")))));
                    break;
                case 2 : System.out.println(phoneService.getAllPhones());
                    break;
                case 3 : System.out.println(phoneService.getPhoneById(2));
                    break;
                case 4 : phoneService.getAllPhonesByBrand("IPhone");
                    break;
                case 5 : phoneService.updatePhoneById(1, "AIZADA"); break;
                case 6 : phoneService.deletePhoneById(2); break;
                case 7 : contactService.addCOntactToPhone(3, new Contact("LILO", "366336")); break;
                case 8 : contactService.addCOntactToPhone(3, new Contact("Poly", "96589")); break;
                case 9 : contactService.addCOntactToPhone(3, new Contact("Kilo", "45454")); break;
                case 10 : System.out.println(contactService.findContactByName(3, "poly")); break;
                case 11 : contactService.findContactByPhoneNumber(3,"96589"); break;
                case 12 : System.out.println(contactService.sortContactByName(3)); break;
                case 13 : contactService.deleteContactByNameFromPhone(3,"Poly"); break;
                case 14 : isTrue = false; break;
            }
        }



    }
}
