package UdemyJavaCourse.Section8.ArrayListChallenge;

import java.util.ArrayList;

public class MobilePhone {

    private ArrayList<Contact> myContacts = new ArrayList<>();

    private int index;

    public boolean storeContact(Contact contact) {
        if (findContact(contact.getName()) >=0) {
            System.out.println("Contact already exists in the list of contacts!");
            return false;
        }else {
            myContacts.add(contact);
            return true;
        }
    }

    public int findContact(String name) {
        for (int i = 0; i<myContacts.size(); i++) {
            if (myContacts.get(i).getName().equals(name)){
                return i;
            }
        }
        return -1;
    }

    public void updateContact(String oldName, Contact newContact) {
        index = findContact(oldName);
        if (index >= 0) {
            myContacts.remove(index);
            myContacts.add(newContact);
        } else {
            System.out.println("Contact "+oldName+" does not exist!");
        }
    }

    public void removeContact(String name) {

        index = findContact(name);
        if (index >=0 ){

            myContacts.remove(index);
            System.out.println(""+name+" removed from contacts.");
        }else {
            System.out.println("Contact does not exist");
        }
    }

    public void queryContact(String name) {

        index = findContact(name);
        if (index >=0) {
            System.out.println("Contact found\n"+myContacts.get(index).getName()+" -> "+myContacts.get(index).getNumber());

        }else{
            System.out.println("Contact with name "+name+" does not exist in contacts.");
        }
    }

    public void printAllContacts() {
        System.out.println("-----All Contacts------");
        for (Contact contact: myContacts) {
            System.out.println(contact.getName()+" -> "+contact.getNumber());
        }
        System.out.println("-----------------------");
    }

    public void setMyContacts(ArrayList<Contact> myContacts) {
        this.myContacts = myContacts;
    }
}
