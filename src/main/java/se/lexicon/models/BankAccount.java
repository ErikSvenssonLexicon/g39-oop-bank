package se.lexicon.models;

public class BankAccount {
    //Fields
    private int accountNumber;
    private double balance;
    private double depositLimit;
    private Customer customer;
    private static int accountNumberCounter = 0;

    public static int getAccountNumberCounter(){
        return accountNumberCounter;
    }

    //All args constructor
    public BankAccount(
            double balance,
            Customer customer,
            double depositLimit){
        this.accountNumber = ++accountNumberCounter;
        this.balance = balance;
        this.customer = customer;
        this.depositLimit = depositLimit;
    }

    //getters and setters
    public int getAccountNumber(){
        return accountNumber;
    }

    public double getBalance(){
        return balance;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getDepositLimit() {
        return depositLimit;
    }

    public void setDepositLimit(double depositLimit) {
        this.depositLimit = depositLimit;
    }

    // deposit and withdraw methods
    public void deposit(double amount){
        if(amount < 0){
            throw new IllegalArgumentException("Amount was negative");
        }
        if(amount > depositLimit){
            throw new IllegalArgumentException("Deposit denied: above limit " + depositLimit);
        }
        this.balance = this.balance + amount;
    }

    public double withdraw(double amount){
        if(amount < 0){
            throw new IllegalArgumentException("Amount was negative");
        }
        if(amount > balance){
            throw new IllegalArgumentException("Amount is greater than the balance");
        }
        this.balance = this.balance - amount;
        return amount;
    }

}
