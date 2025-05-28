package Parciales.PrimerParcial.Q1_2022;


import java.time.LocalDate;

public class Loan {
    protected LoanType type;
    protected int amount, quotasAmount, quotasPayed;
    protected LocalDate current;


    public Loan(LoanType type, int amount, int quotasAmount, LocalDate start){
        if(amount > type.getMaxAmount() || quotasAmount > type.getMaxQuotas() || amount <= 0) {
            throw new LoanException("Inavlid Loan.");
        }
        this.type = type;
        this.amount = amount;
        this.quotasAmount = quotasAmount;
        this.current = start;
    }

    public void pay(int quota, LocalDate day){
        if(quota <= 0 || !canPay(day, quota))
            throw new LoanException("Cannot Pay.");

        System.out.println("Paying quota " + quota + " on date " + day + ".");
    }
    private boolean canPay(LocalDate day, int quota){
        return day.isAfter(current) && quota >= 0;
    }

    @Override
    public String toString(){
        return type.getName() + " Loan of $" + amount + ". Remaining quota: " + (quotasAmount - quotasPayed) + ". ";
    }
}
