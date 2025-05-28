package Talleres.Taller3.ej1;

public class RechargeableSubwayCard extends SubwayCard {

    private double balance;

    public RechargeableSubwayCard(SubwayCentral subwayCentral) {
        super(subwayCentral);
    }

    protected double rideCost() {
        return subwayCentral.getRideCost();
    }

    @Override
    protected boolean canRide() {
        return rideCost() <= balance;
    }

    @Override
    public void applyCost() {
        balance -= rideCost();
    }

    public void recharge(double amount) {
        if(amount < 0) {
            System.out.println("Cannot recharge a negative amount");
        }
        balance += amount;
    }

}