package Parciales.Q1_2022.Ej2;


import java.time.LocalDate;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DriverLicenseCentral {
    private final Map<String, Driver> system;

    public DriverLicenseCentral(){
        system = new HashMap<>();
    }

    public void register(String name, int points){
        if(!system.containsKey(name)){
            system.put(name, new Driver(name, points));
        }
        else
            system.get(name).setPoints(points);
    }

    private void checkDriver(String name){
        if(!system.containsKey(name))
            throw new IllegalArgumentException("Driver does not exists");
    }

    public int points(String name){
        checkDriver(name);
        return system.get(name).getPoints();
    }

    public void infraction(String name, LocalDate date, Infraction infraction){
        checkDriver(name);
        system.get(name).addInfraction(date, infraction);
    }

    public Set<LocalDate> getInfractionDates(String name){
        checkDriver(name);
        return system.get(name).getInfractionDates();
    }

    public Collection<Infraction> getInfractionTypes(String name){
        checkDriver(name);
        return system.get(name).getInfractionTypes();
    }

}
