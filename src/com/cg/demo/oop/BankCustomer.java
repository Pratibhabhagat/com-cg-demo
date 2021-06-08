package com.cg.demo.oop;

//member=method or field
//access static member in static context - free access - class reference
//access static member in non static context - free access - class reference
//access non static member in static context - restricted access - object reference
//access non static member in non static context - restricted access - ?? reference

import java.awt.Checkbox;

//method definition
public class BankCustomer //method signature
{
	//static field
    static int ifsc=1234; //method body
    
    //non static field
    int acNo;
    String name;
    double balance;

    //non static context
    void checkBalance() {
        System.out.println(balance);
    }

    //static context
    static void openAccount() {
        System.out.println("Open an account.");
    }

 
    public static void main(String[] args) {

        BankCustomer c1 = new BankCustomer();
        c1.acNo = 101;
        c1.name = "Sonu";
        c1.balance = 10000;
        System.out.println(c1.acNo + " " + c1.name + " " + c1.balance);
        c1.checkBalance();  //method call/invocation(valid)
       // CheckBalance(); (not valid)
        //System.out.println(c1.balance);
        openAccount();
        System.out.println(ifsc);
        System.out.println(c1.ifsc);
 

    }

 

}
 
