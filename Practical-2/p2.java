/*Write a Java Program to demonstrate the working of a banking-system  
Instance variables: name, account_no, amount  
Instance methods:  deposit(), withdraw(), checkBalance(), insert() and display().
Here we can deposit and withdraw amount from our account using deposit() and withdraw() methods respectively.
The insert() method is to initialize state and display() method is to display state values. */

import java.util.Scanner;

class Account{
    int account_number;
    String name;
    int amount;
    
    void insert(int acc, String n, int b){
        account_number = acc;
        name = n;
        amount = b;
    }

    void deposit(int d){
        amount+=d;
    }
    void withdraw(int w){
        if(amount==0)
        {
            System.out.println("Insufficient Balance!!!");
        }
        else{
            amount-=w;
        }
    }

    void checkbalance(){
        System.out.println("Balance: "+ amount);
    }

    void display(){
        System.out.println("Name of account holder: "+name);
        System.out.println("Account Number: "+account_number);
        System.out.println("Amount left: "+amount);
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Account Number");
        int ac = sc.nextInt();

        System.out.println("Enter the name");
        String s = sc.next();

        System.out.println("Enter the Amount");
        int u = sc.nextInt();

        System.out.println("Enter the Deposit amount");
        int d = sc.nextInt();

        System.out.println("Enter the withdraw amount");
        int w = sc.nextInt();

        Account obj = new Account();
        obj.insert(ac, s, u);
        obj.deposit(d);
        obj.withdraw(w);
        obj.checkbalance();
        obj.display();
    }
}

