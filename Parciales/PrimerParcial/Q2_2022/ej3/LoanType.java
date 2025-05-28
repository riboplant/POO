package Parciales.PrimerParcial.Q1_2022;

public enum LoanType {
    PERSONAL("Personal", 50000, 12),
    CAR("Automotor", 300000, 24),
    HOME("Hipotecario",1000000, 360);

    private String name;
    private final int maxAmount, maxQuotas;
    LoanType(String name, int maxAmount, int maxQuotas){
        this.name = name;
        this.maxAmount = maxAmount;
        this.maxQuotas = maxQuotas;
    }

    public int getMaxAmount(){
        return maxAmount;
    }

    public int getMaxQuotas() {
        return maxQuotas;
    }
    public String getName(){
        return name;
    }
}
