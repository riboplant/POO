package Guias.Guia4.ej5;

public class BoldText implements HTMLText {

    public static final String start = "<b>";
    public static final String end = "</b>";
    private HTMLText text;

    @Override
    public String source() {
        return start + text.source() + end;
    }

    public BoldText(HTMLText text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return source();
    }
}
