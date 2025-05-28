package Parciales.Q1_2023.Ej2;

public class AddressBookGroup implements Comparable<AddressBookGroup>{
    private final String name;


    public AddressBookGroup(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(AddressBookGroup o){
        return  name.compareTo(o.name);
    }

}
