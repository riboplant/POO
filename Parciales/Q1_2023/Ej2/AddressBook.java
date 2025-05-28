package Parciales.Q1_2023.Ej2;

import java.util.*;

public class AddressBook {
    private final SortedMap<AddressBookGroup, SortedMap<String, Contact>> book = new TreeMap<>();

    public void addContact(AddressBookGroup group, String name, String number){
        book.putIfAbsent(group, new TreeMap<>());
        book.get(group).put(name, new Contact(name, number));
    }

    private void checkContact(AddressBookGroup group, String name){
        if(!book.getOrDefault(group, new TreeMap<>()).containsKey(name))
            throw new IllegalArgumentException("Invalid Group or name");
    }

    public Contact getContact(AddressBookGroup group, String name){
        checkContact(group,name);
        return book.get(group).get(name);
    }

    public void renameContact(AddressBookGroup group, String previousName, String newName){
        checkContact(group, previousName);
        Contact contact = book.get(group).remove(previousName);
        contact.setName(newName);
        book.get(group).put(newName, contact);
    }

    public Collection<Contact> getAllContacts(AddressBookGroup group){
        return book.getOrDefault(group, new TreeMap<>()).values();
    }

    public Collection<Contact> getAllContacts(){
        Collection<Contact> toReturn = new ArrayList<>();
        for(Map<String, Contact> map : book.values()){
            toReturn.addAll(map.values());
        }
        return toReturn;
    }


}
