package Parciales.Q1_2022.Ej2;

public enum Infraction {
    SPEED(5), RED_LIGHT(3), OTHER(10);
    private final int points;
    Infraction(int points) {
        this.points = points;
    }
    public int getPoints() {
        return points;
    }
}
