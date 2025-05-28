package Guias.Guia3.ej7;

public abstract class BankAccount {
    private final int id;
    protected double balance;

    public BankAccount(int id){
        this.id = id;
    }

    public void deposit(double amount){
        this.balance += amount;
    }
    public void extract(double amount){
        if(canExtract(amount))
            balance -= amount;
    }
    protected boolean canExtract(double amount){
        return balance >= amount;
    }
    @Override
    public String toString(){
        return "Cuenta %d con saldo %.2f".formatted(id, balance);
    }

}
