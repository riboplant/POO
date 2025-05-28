package Guias.Guia4.ej3;

public interface Movable {
    void moveNorth(double delta);

    void moveSouth(double delta);

    void moveWest(double delta);

    void moveEast(double delta);

    default void moveNoorthEast(double n, double e){
        moveNorth(n);
        moveEast(e);
    }

    default void moveNorthEast(double n, double w){
        moveNorth(n);
        moveWest(w);
    }

    default void moveSouthEast(double s, double e){
        moveSouth(s);
        moveEast(e);
    }

    default void moveSouthWest(double s, double w){
        moveSouth(s);
        moveWest(w);
    }
}
