package Guias.Guia4.ej5;

public class ItalicText implements HTMLText{
    public static final String start = "<i>";
    public static final String end = "</i>";
    private HTMLText text;

    @Override
    public String source() {
        return start + text.source() + end;
    }

    public ItalicText(HTMLText text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return source();
    }
}
