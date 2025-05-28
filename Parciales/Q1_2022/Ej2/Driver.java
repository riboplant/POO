package Parciales.Q1_2022.Ej2;



import java.time.LocalDate;
import java.util.*;

public class Driver {
    private final String name;
    private int points;
    private final SortedMap<LocalDate, Infraction> history;

    public Driver(String name, int points){
        this.name = name;
        this.points = points;
        this.history = new TreeMap<>();
    }

    public void addInfraction(LocalDate date, Infraction infraction){
        if(date.equals(history.lastKey())){
            throw new IllegalArgumentException("Infraction already exists for driver and date");
        }
        history.put(date, infraction);
        points -= infraction.getPoints();
    }

    public int getPoints(){
        return points;
    }

    public Set<LocalDate> getInfractionDates(){
        return history.keySet();
    }

    public Collection<Infraction> getInfractionTypes(){
        List<Infraction> toReturn = new ArrayList<>();
        for(LocalDate key : getInfractionDates()){
            toReturn.add(history.get(key));
        }
        return toReturn;
    }

    public void setPoints(int points){
        this.points = points;
    }

    //Innecesario bot

    @Override
    public boolean equals(Object o){
        if(this == o)
            return true;
        if(o instanceof Driver a){
            return name.equals(a.name);
        }return false;
    }

    @Override
    public int hashCode(){
        return Objects.hash(name,points,history);
    }

}
