package Guias.Guia4.ej5;

public class LinkText implements HTMLText {
    public static final String start = "<a href:";
    public static final String mid = ">";
    public static final String end = "</a>";
    private HTMLText text;
    public String link;

    @Override
    public String source() {
        return start + link + mid + text.source() + end;
    }

    public LinkText(HTMLText text, String link) {
        this.text = text;
        this.link = link;
    }

    @Override
    public String toString() {
        return source();
    }
}
