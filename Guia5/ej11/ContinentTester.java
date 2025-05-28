package Guias.Guia5.ej11;
import Guias.Guia4.ej14.Continent;
import java.util.Arrays;

public class ContinentTester {
    public static void main(String[] args) {
        Continent[] continents = new Continent[]{
                Continent.OCEANIA,
                Continent.AMERICA,
                Continent.EUROPE};
        Arrays.sort(continents, (o1,o2)->(int)o1.getPopulationRatio() - (int)o2.getPopulationRatio());
        for(Continent continent : continents) {
            System.out.println(continent);
        }
    }
}
