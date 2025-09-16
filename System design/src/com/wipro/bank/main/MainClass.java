package com.wipro.bank.main;

import java.util.Scanner;
import com.wipro.bank.server.BankService;

public class MainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Tenure (5 or 10): ");
        int tenure = sc.nextInt();

        System.out.print("Enter Principal: ");
        float principal = sc.nextFloat();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        System.out.print("Enter Gender (Male/Female): ");
        String gender = sc.next();

        BankService bs = new BankService();
        bs.calculate(principal, tenure, age, gender);

        sc.close();
    }
}
