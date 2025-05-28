package Talleres.Taller3.ej1;

public class SubwayCardTester {

    public static void main(String[] args) {

        SubwayCentral sc = new SubwayCentral(25);
        FixedSubwayCard fsc = new FixedSubwayCard(sc, 2);
        try {
            fsc.ride();
            fsc.ride();
            fsc.ride(); // Imprime un mensaje de error
        } catch (CannotRideException e){
            e.printStackTrace();
        }
        try {
            RechargeableSubwayCard rsc = new RechargeableSubwayCard(sc);
            rsc.recharge(50);
            rsc.ride();
            sc.setRideCost(30);
            rsc.ride(); // Imprime un mensaje de error
        } catch (CannotRideException e){
            e.printStackTrace();
        }
        try {
            DiscountRechargeableSubwayCard drsc = new DiscountRechargeableSubwayCard(sc, 0.50);
            drsc.recharge(-10);
            drsc.ride();
            drsc.ride();
            drsc.ride(); // Imprime un mensaje de error
            DiscountRechargeableSubwayCard drsc2 = new DiscountRechargeableSubwayCard(sc, 0.50);
            drsc2.recharge(-10);
            System.out.println("Fin");
        } catch (CannotRideException e){
            e.printStackTrace();
        }
    }

}