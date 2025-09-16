package com.wipro.bank.acc;

public class RDAccount extends Account {

    public RDAccount(int tenure, float principal) {
        this.tenure = tenure;
        this.principal = principal;
    }

    @Override
    public float calculateAmountDeposited() {
        return principal * tenure * 12;
    }

    @Override
    public float calculateInterest() {
        int n = 12; 
        float r = rateOfInterest / 100; 
        float t = tenure;
       
        return (float) (principal * (Math.pow(1 + r / n, n * t) - 1));
    }
}
