package Talleres.Taller4;

public class PhoneNumber implements Comparable<PhoneNumber>{
    private int areaCode;
    private int prefix;
    private int lineNumber;

    public PhoneNumber(int areaCode, int prefix, int lineNumber) {
        this.areaCode = areaCode;
        this.prefix = prefix;
        this.lineNumber = lineNumber;
    }

        @Override
    public String toString(){
        return "+" + areaCode + " (" + prefix + ")" + lineNumber;
    }

    @Override
    public int compareTo(PhoneNumber o) {
        int cmp = Integer.compare((this.areaCode), o.areaCode);
        if(cmp == 0){
            Integer.compare(this.prefix, o.prefix);
            if(cmp == 0){
                return Integer.compare(this.lineNumber, o.lineNumber);
            }
        }
        return cmp;
    }

    public int getAreaCode(){
        return areaCode;
    }

    public int getPrefix(){
        return prefix;
    }
    public int getLineNumber(){
        return lineNumber;
    }
}
