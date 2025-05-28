package Guias.Guia7.ej8;

public abstract class BankAccount {
    private final int id;
    protected double balance;
    protected String movements;

    public BankAccount(int id){
        this.id = id;
        this.movements = "Movements for Account " + id;
    }
    public double getBalance(){
        return balance;
    }

    public void deposit(double amount){
        this.balance += amount;
        movements += "\nDeposit $" + amount;
    }
    public void extract(double amount) throws RuntimeException {
        if(canExtract(amount)) {
            balance -= amount;
            movements += "\nExtract $" + Double.toString(amount);
        }
        else{
            throw new RuntimeException("Fondos Insuficientes");
        }
    }


    protected boolean canExtract(double amount){
        return balance >= amount;
    }

    public void showMovements(){
        System.out.println(movements);
    }

    @Override
    public String toString(){
        return "Cuenta %d con saldo %.2f".formatted(id, balance);
    }

}
