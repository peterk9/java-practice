package com.company.BankManager;

import java.util.Date;

public class COD extends BankAccount {

    private Date expiry;

    public COD(String account, double balance, Date expiry){
        super(account,balance);
        this.expiry = expiry;
    }

    public Date getExpiry() {
        return expiry;
    }

    public void setExpiry(Date expiry) {
        this.expiry = expiry;
    }

    public String getDetails(){
        return "COD account " + getAccount() + " balance " + getBalance() + " expire " + getExpiry().toString();
     }
}
