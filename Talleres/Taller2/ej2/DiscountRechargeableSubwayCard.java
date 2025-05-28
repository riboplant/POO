package Talleres.Taller2.ej2;

public class DiscountRechargeableSubwayCard extends RechargeableSubwayCard {

    private double discountPercentage;

    public DiscountRechargeableSubwayCard(SubwayCentral subwayCentral, double discountPercentage) {
        super(subwayCentral);
        this.discountPercentage = discountPercentage;
    }

    @Override
    protected double rideCost() {
        return super.rideCost() * (1 - discountPercentage);
    }

}
