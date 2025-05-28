package Talleres.Taller7.ej1;

import java.util.Comparator;
import java.util.Objects;

public class Citizen implements Comparable<Citizen> {
	 
    private final int dni;
    private final String firstName, lastName;
 
    public Citizen(int dni, String firstName, String lastName) {
        this.dni = dni;
        this.firstName = firstName;
        this.lastName = lastName;
    }
 
    @Override
    public String toString() {
        return "Citizen{" +
                "dni='" + dni + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if(this == object)
            return true;
        if(object instanceof Citizen o){
            return dni == o.dni;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni, firstName, lastName);
    }

    @Override
    public int compareTo(Citizen o){
        return Integer.compare(dni, o.dni);
    }

    public int getDni() {
        return dni;
    }
 
    public String getFirstName() {
        return firstName;
    }
 
    public String getLastName() {
        return lastName;
    }
 
}