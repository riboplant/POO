package Guias.Guia5.ej12;

import java.util.Iterator;

public class LocalDate implements Comparable<LocalDate>{
    int y, m, d;

    protected LocalDate(int y, int m, int d){
        if(d > 30 || m > 12 || d < 0 || m < 0 || y < 0){
            throw new IllegalArgumentException();
        }
        this.y = y;
        this.m = m;
        this.d = d;
    }
    public static LocalDate of(int y, int m, int d) {
        return new LocalDate(y,m,d);
    }
    public LocalDate plusDays(int x){
        int nd = d, nm = m, ny = y;

        if(nd + x > 30){
            nd += x - 30;
            nm++;
            if(nm > 12){
                nm -= 12;
                ny++;
            }
        } else{
            nd += x;
        }

        return new LocalDate(ny,nm,nd);
    }

    public boolean isAfter(LocalDate o){
        return compareTo(o) > 0;
    }


    @Override
    public int compareTo(LocalDate o) {
        int ans = this.y - o.y;
        if(ans == 0){
            ans = this.m - o.m;
        }
        if(ans == 0){
            ans = this.m - o.m;
        }
        if(ans == 0){
            return this.d - o.d;
        }
        return ans;
    }

    public String toString(){
        return y + "-" + m + "-" + d;
    }
}
