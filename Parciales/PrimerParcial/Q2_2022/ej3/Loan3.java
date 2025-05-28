package Parciales.PrimerParcial.Q1_2022;

import java.time.LocalDate;

public class Loan3 extends Loan2{
    public Loan3(LoanType type, int amount, int quotasAmount, LocalDate start){
        super(type, amount, quotasAmount, start);
    }

    @Override
    public void pay(int quota, LocalDate day) {
        if(!canPay(day, quota))
            throw new LoanException("Cannot Pay.");

        current = day;
        quotasPayed++;
    }

    private boolean canPay(LocalDate day, int quota){
        return day.isAfter(current) && (quota == quotasPayed + 1) && quota <= quotasAmount;
    }

    @Override
    public String toString(){
        return super.toString() + "Next paydate: After " + current.toString();
    }
}
