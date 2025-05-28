package Guias.Guia4.ej12;

public class List implements LinearList {
    private Object[] l;
    private int length;

    public List(){
        this.l = new Object[0];
        this.length = 0;
    }
    @Override
    public void add(Object obj) {
        Object[] n = new Object[length + 1];
        System.arraycopy(l, 0, n, 0, l.length + 1);
        l = n;
        length++;
    }

    @Override
    public Object get(int i) throws IndexOutOfBoundsException{
        if(i>=length)
            throw new IndexOutOfBoundsException();
        return l[i-1];
    }

    @Override
    public void set(int i, Object obj) throws IndexOutOfBoundsException{
        if(i>=length)
            throw new IndexOutOfBoundsException();
        l[i] = obj;
    }

    @Override
    public void remove(int i) throws IndexOutOfBoundsException{
        if(i>=length)
            throw new IndexOutOfBoundsException();
        l[i] = null;
        if (i == length-1) {
            Object[] n = new Object[length - 1];
            System.arraycopy(l,0,n,0,length - 1);
            length--;
        }
    }

    @Override
    public int indexOf(Object obj) {
        int i = 0;
        for(int j = 0; j < length; j++){
            if(l[j].equals(obj)){
                return i;
            }
        }
        return -1;
    }

    @Override
    public int size() {
        return length;
    }
}
