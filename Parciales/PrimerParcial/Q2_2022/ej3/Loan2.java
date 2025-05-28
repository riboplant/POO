package Parciales.PrimerParcial.Q1_2022;

import java.time.LocalDate;

public class Loan2 extends Loan{
    protected int quotasPayed;

    public Loan2(LoanType type, int amount, int quotasAmount, LocalDate start){
        super(type, amount, quotasAmount, start);
    }

    @Override
    public void pay(int quota, LocalDate day){
        if(!canPay(day, quota))
            throw new LoanException("Cannot Pay.");

        quotasPayed++;
    }


    private boolean canPay(LocalDate day, int quota){
        return day.isAfter(current) && (quota == quotasPayed + 1) && quota <= quotasAmount;
    }

    @Override
    public String toString(){
        return super.toString() + "Last quota: " + quotasPayed + ". ";
    }
}
