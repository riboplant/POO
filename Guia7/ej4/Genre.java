package Guias.Guia7.ej4;

public enum Genre {
    FANTASY("Fantasy"),
    FICTION("Drama"),
    DRAMA("Drama"),
    CHILDREN("Children");

    private final String name;
    Genre(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        return name;
    }
}
