//package main.java;


public class Account {
    private long number = 123456789;
    private double balance = 50.0;
    private String name = "Jennie";
    private String email = "junyiliu0803@gmail.com";
    private String tel = "7204219885";



    //To allow the customer to deposit funds (this should increment the balance field).
    public void deposit(double num){
        if(num < 0){
            System.out.println("Put input a positive number");
        }
        this.balance += num;
        System.out.println("New Balance: " + this.balance + " for " +this.name);
    }

    //To allow the customer to withdraw funds.
    // This should deduct from the balance field,
    // but not allow the withdrawal to complete if their are insufficient funds
    // and print the balance with name of customer
    public void withdraw(double num){
        if(num < 0){
            System.out.println("Put input a positive number");
        }
        if(this.balance - num >= 0) {
            this.balance -= num;
            System.out.println("New Balance: " + this.balance + " for " +this.name);
        }
        else{
            System.out.println("No enough money");
        }
    }

    public long getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getTel() {
        return tel;
    }

    //Create another method to print Customer Name, Account Number, Balance, Email and Phone Number
    public void info(){
        System.out.println("Name: "+this.name+" Account Number: "+ number+
        " Balance: " + this.balance+" Email: "+this.email + " tel: "+ this.tel);
    }
}
