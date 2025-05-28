package Guias.Guia6.ej9;

import java.util.Objects;

public class ItemTime <T>{
    private final T name;
    private final int hours;
    private final int minutes;

    public ItemTime(T name, int hours, int minutes) {
        if(hours > 24 || hours < 0 || minutes > 60 || minutes < 0)
            throw new IllegalArgumentException();
        this.name = name;
        this.hours = hours;
        this.minutes = minutes;
    }

    public T getName() {
        return name;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public boolean isBetween(int hour1, int minutes1, int hour2, int minutes2){
        return (hours > hour1 || (hours == hour1 && minutes >= minutes1)) && (hours < hour2 || (hours == hour2 && minutes <= minutes2));
    }

    @Override
    public int hashCode(){
        return Objects.hashCode(name);
    }

    @Override
    public boolean equals(Object o){
        return (this == o || (o instanceof ItemTime<?> aux) && aux.name.equals(name));
    }
}
