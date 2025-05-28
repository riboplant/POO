package Guias.Guia4.ej9;

public abstract class BankAccount {
    private final int id;
    protected double balance;

    public BankAccount(int id){
        this.id = id;
    }
    public double getBalance(){
        return balance;
    }

    public void deposit(double amount){
        this.balance += amount;
    }
    public void extract(double amount) throws RuntimeException {
        if(canExtract(amount))
            balance -= amount;
        else{
            throw new RuntimeException("Fondos Insuficientes");
        }
    }
    protected boolean canExtract(double amount){
        return balance >= amount;
    }
    @Override
    public String toString(){
        return "Cuenta %d con saldo %.2f".formatted(id, balance);
    }

}
