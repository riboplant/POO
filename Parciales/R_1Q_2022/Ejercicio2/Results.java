package Parciales.R_1Q_2022.Ejercicio2;

public class Results {
    private final String airline, airport;
    private final SeatCategory seat;
    private final int stops;

    public Results(String airport, int stops, String airline, SeatCategory seat){
        this.airline = airline;
        this.airport = airport;
        this.stops = stops;
        this.seat = seat;
    }

    @Override
    public String toString(){
        return String.format("%s | %d | %s | %s", airport, stops, airline, seat);

    }

}
