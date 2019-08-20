package com.company.BankManager;

public class CheckingAccount extends BankAccount {

    private double limit;

    public CheckingAccount(String account, double balance, double limit){
        super(account, balance);
        this.limit = limit;

    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }

    public String getDetails(){
        return "COD account " + getAccount() + " balance " + getBalance() + " limit " + getLimit();
    }

}
