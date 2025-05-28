package Guias.Guia7.ej4;

import java.util.Objects;

public class RankedBook implements Comparable<RankedBook>{
    Book book;
    Genre genre;
    private int points;

    public RankedBook(Book book){
        this.book = book;
    }

    public RankedBook(Book book, Genre genre){
        this.book = book;
        this.genre = genre;
    }

    public RankedBook(RankedBook rb){
        this.book = rb.book;
        this.genre = rb.genre;
        this.points = rb.points + 1;
    }

    @Override
    public int compareTo(RankedBook o){
        int cmp = Integer.compare(points, o.points);
        if(cmp == 0)
            cmp = book.compareTo(o.book);
        return cmp;
    }

    @Override
    public int hashCode(){
        return Objects.hash(book, genre);
    }

    @Override
    public String toString(){
        return book + " : " + points;
    }

    @Override
    public boolean equals(Object o){
        if(this == o)
            return true;
        if(!(o instanceof RankedBook aux))
            return false;
        return book.equals(aux.book) && genre.equals(aux.genre);
    }
}
