package Talleres.Taller2.ej2;

public class SubwayCardTester {

    public static void main(String[] args) {
        SubwayCentral sc = new SubwayCentral(25);
        FixedSubwayCard fsc = new FixedSubwayCard(sc, 2);
        fsc.ride();
        fsc.ride();
        fsc.ride(); // Imprime un mensaje de error
        RechargeableSubwayCard rsc = new RechargeableSubwayCard(sc);
        rsc.recharge(50);
        rsc.ride();
        sc.setRideCost(30);
        rsc.ride(); // Imprime un mensaje de error
        DiscountRechargeableSubwayCard drsc = new DiscountRechargeableSubwayCard(sc, 0.50);
        drsc.recharge(-10);
        drsc.ride();
        drsc.ride();
        drsc.ride(); // Imprime un mensaje de error
        DiscountRechargeableSubwayCard drsc2 = new DiscountRechargeableSubwayCard(sc, 0.50);
        drsc2.recharge(-10);
        System.out.println("Fin");
    }

}