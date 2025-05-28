package Talleres.Taller2.ej2;

public abstract class SubwayCard {
    protected SubwayCentral subwayCentral;

    public SubwayCard(SubwayCentral subwayCentral) {
        this.subwayCentral = subwayCentral;
    }

    protected abstract boolean canRide();

    protected abstract void applyCost();

    public void ride() {
        if(!canRide()) {
            System.out.println("Cannot ride");;
        }
        applyCost();
    }
}
