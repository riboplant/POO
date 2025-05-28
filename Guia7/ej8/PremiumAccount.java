package Guias.Guia7.ej8;


public class PremiumAccount extends CheckingAccount {
    private final ShopDiscountsProvider sdp;

    public PremiumAccount(int id, double descubierto, ShopDiscountsProvider sdp) {
        super(id, descubierto);
        this.sdp = sdp;
    }

    public void extract(double amount, String brand) throws RuntimeException{
        double newAmount = (1.0 - sdp.getDiscount(brand)) * amount;
        if(canExtract(newAmount)) {
            balance -= newAmount;
            movements += "\nExtract $" + Double.toString(newAmount) + " for shop " + brand;
        }
        else{
            throw new RuntimeException("Fondos Insuficientes");
        }

    }
}
