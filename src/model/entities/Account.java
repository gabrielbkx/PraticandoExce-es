package model.entities;


import model.exeptions.AccountExeption;

import java.rmi.AccessException;

public class Account {
    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawlimit;

    public Account() {
    }

    public Account(Integer number, String holder, Double balance, Double withdrawlimit)  {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawlimit = withdrawlimit;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public Double getWithdrawlimit() {
        return withdrawlimit;
    }

    public void setWithdrawlimit(Double withdrawlimit) {
        this.withdrawlimit = withdrawlimit;
    }
    public void deposit(Double amount) {
        this.balance += amount;
    }

    public void withdraw(Double amount) {

        validateWithdraw(amount);
        this.balance -= amount;
    }
    public void validateWithdraw(double amount){

        if (amount > getBalance()) {
            throw new AccountExeption(" Not enough balance");
        }
        if (amount > getWithdrawlimit()) {
            throw new AccountExeption("The amount exceeds withdraw limit");
        }
    }
}
