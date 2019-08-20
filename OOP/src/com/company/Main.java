package com.company;

import com.company.BankManager.*;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
	// write your code here
        CheckingAccount ca = new CheckingAccount("1000101", 42.0, 50.0);
        SavingsAccount sa = new SavingsAccount("3003330", 2.44, 0.3);
        COD cod = new COD("2424242", 33.3, new Date());

        System.out.println(ca.getDetails());
        System.out.println(sa.getDetails());
        System.out.println(cod.getDetails());

    }
}
