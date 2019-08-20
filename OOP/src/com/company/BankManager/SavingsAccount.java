package com.company.BankManager;

public class SavingsAccount extends BankAccount {

   private double interest;

    public SavingsAccount(String account, double balance, double interest){
        super(account, balance);
        this.interest = interest;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    public String getDetails(){
        return "COD account " + getAccount() + " balance " + getBalance() + " interest " + getInterest();
    }

}
