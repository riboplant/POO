package Guias.Guia7.ej4;

import java.util.Objects;

public class Book implements Comparable<Book>{
    private final String title, author;

    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    @Override
    public int compareTo(Book o){
        int cmp = title.compareTo(o.title);
        if(cmp == 0)
            cmp = author.compareTo(o.author);
        return cmp;
    }

    @Override
    public int hashCode(){
        return Objects.hash(title, author);
    }

    @Override
    public String toString(){
        return title;
    }

    @Override
    public boolean equals(Object o){
        if(this == o)
            return true;
        if(! (o instanceof Book aux))
            return false;
        return title.equals(aux.title) && author.equals(aux.author);
    }

}
