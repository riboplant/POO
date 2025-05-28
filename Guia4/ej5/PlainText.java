package Guias.Guia4.ej5;

public class PlainText implements HTMLText{
    protected String text;

    public PlainText(String s) {
        text = s;
    }

    public void setText(String s){
        this.text = s;
    }

    @Override
    public String source() {
        return text;
    }

    @Override
    public String toString() {
        return source();
    }
}
