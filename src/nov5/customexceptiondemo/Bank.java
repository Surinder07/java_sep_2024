package nov5.customexceptiondemo;

public class Bank {

    private double balance;

    public Bank(double balance) {
        this.balance = balance;
    }

    // Balance
    public double getBalance(){
        return balance;
    }

    //deposit

    public double deposit(double deposit) {
        //balance += deposit;
        balance = balance + deposit;
        return balance;
    }

    // withdraw

    public double withdraw(double withdraw){
        if(balance < withdraw){
            throw new InsufficientBalanceException("Insufficient Balance Exception ");
        }
        balance = balance - withdraw;
        return balance;
    }
}
