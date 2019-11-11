/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class8;

/**
 *
 * @author patrick.shapiro
 */
//********************************************************************
// Account.java Author: Lewis/Loftus
//
// Represents a bank account with basic services such as deposit
// and withdraw.
//********************************************************************
import java.text.NumberFormat;

public class Account
{

    private final double RATE = 0.03; // interest rate of 3%
    private long acctNumber;
    private double balance;
    private String name;
//-----------------------------------------------------------------
// Sets up the account by defining its owner, account number,
// and initial balance.
//-----------------------------------------------------------------

    public Account(String owner, long account, double initial)
    {
        name = owner;
        acctNumber = account;
        balance = initial;
    }
//-----------------------------------------------------------------
// Deposits the specified amount into the account. Returns the
// new balance.
//-----------------------------------------------------------------

    public double deposit(double amount)
    {
        balance = balance + amount;
        return balance;
    }
//-----------------------------------------------------------------
// Withdraws the specified amount from the account and applies
// the fee. Returns the new balance.
//-----------------------------------------------------------------

    public double withdraw(double amount, double fee)
    {
        if ((amount + fee) <= balance)
        {
            balance = balance - amount - fee;
            return balance;
        }
        else
        {
            System.out.println("Insufficient funds");
            return balance;
        }   
    }

//-----------------------------------------------------------------
// Adds interest to the account and returns the new balance.
//-----------------------------------------------------------------
    public void addInterest()
    {
        balance += (balance * RATE);
    }
//-----------------------------------------------------------------
// Returns the current balance of the account.
//-----------------------------------------------------------------

    public double getBalance()
    {
        return balance;
    }
    
        public String getName()
    {
        return name;
    }
//-----------------------------------------------------------------
// Returns a one-line description of the account as a string.
//-----------------------------------------------------------------

    public String toString()
    {
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        return (acctNumber + "\t" + name + "\t" + fmt.format(balance));
    }
}
