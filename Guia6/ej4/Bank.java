package Guias.Guia6.ej4;

import Guias.Guia4.ej9.BankAccount;
import Talleres.Taller4.List;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Bank {

    private final Set<BankAccount> set = new HashSet<>();


    public void addAccount(BankAccount account) {
        set.add(account);
    }

    public int accountSize() {
        return set.size();
    }

    public double totalAmount() {
        double toReturn = 0;
        for(BankAccount a : set){
            toReturn += a.getBalance();
        }
    return toReturn;
    }

    public void removeAccount(BankAccount account) {
        set.remove(account);
    }
}
