package Guias.Guia7.ej4;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Ranker{
    private final Set<RankedBook> set = new TreeSet<>();

    public Ranker add(Genre genre, Book book){
        set.add(new RankedBook(book, genre));
        return this;
    }

    public void rateUp(Book book){
        Iterator<RankedBook> it = set.iterator();
        boolean found = false;
        RankedBook rb;
        while(it.hasNext() && !found){
            rb = it.next();
            if (rb.book.equals(book)){
                found = true;
                it.remove();
                set.add(new RankedBook(rb));
            }
        }
        if(!found)
            set.add(new RankedBook(book));

    }

    public void printRanking(){
        for (RankedBook rb : set)
            System.out.println(rb);
    }

    public void printRanking(Genre genre){
        System.out.println("Ranking of " + genre + ": ");
        for (RankedBook rb : set){
            if(genre.equals(rb.genre))
                System.out.println(rb);
        }

    }

}
