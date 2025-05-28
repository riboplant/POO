package Guias.Guia4.ej9;

public class CheckingAccount extends BankAccount {
    private final double descubierto;


    public CheckingAccount(int id, double descubierto){
        super(id);
        this.descubierto = descubierto;
    }
    @Override
    protected boolean canExtract(double amount){
        return amount >= balance + descubierto;
    }
}
