package Talleres.Taller2.ej1;

public class Pais {
    private String name;

    public Pais(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.valueOf(name);
    }
}
