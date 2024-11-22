
package com.kh.Oop.bank;

public class AccountEx {

    private String name;
    private String accountNumber;
    private double balance;
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }


    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // 전달받은 금액을 balance 에 누적한 후 현재 콘솔창에 표시하기
    public void deposit(double amount) {
        this.balance += amount;
        System.out.println(name+"의 현재 잔액 : "+balance);
    }



    public void deposit1(double amount) {
        this.balance -= amount;
        System.out.println(name+"의 현재 잔액 : "+balance);
    }


}
