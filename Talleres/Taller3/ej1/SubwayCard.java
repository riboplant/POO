package Talleres.Taller3.ej1;

public abstract class SubwayCard {
    protected SubwayCentral subwayCentral;

    public SubwayCard(SubwayCentral subwayCentral) {
        this.subwayCentral = subwayCentral;
    }

    protected abstract boolean canRide();

    protected abstract void applyCost();

    public void ride() throws CannotRideException {
        if(!canRide()) {
            throw new CannotRideException();
        }
        applyCost();
    }
}
