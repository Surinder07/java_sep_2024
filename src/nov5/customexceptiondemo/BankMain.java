package nov5.customexceptiondemo;

public class BankMain {
    public static void main(String[] args) {
        show();
    }


    public static void show(){
        try {
            bankOperations();
        }
        catch (InsufficientBalanceException e){
            e.printStackTrace();
        }
    }

    public static void bankOperations() throws InsufficientBalanceException{
        Bank bank = new Bank(15000);

        double currentBalance = bank.getBalance();
        System.out.println("Current Balance "+currentBalance);

        double balanceAfterDeposit = bank.deposit(299);
        System.out.println("New Balance "+ balanceAfterDeposit);

        double balanceAfterWithdraw = bank.withdraw(26000);
        System.out.println("Balance After 16K withdraw " + balanceAfterWithdraw);
        System.out.println("Closing...");

    }
}
