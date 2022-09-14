package Day_30_Exceptions.UserDefined;

public class BankAccount {

    double balance;

    public BankAccount(double blnc){
        this.balance=blnc;
    }

    public void Deposit(double amnt){
        balance =balance+amnt;
        System.out.println("The new balance is : "+balance);
    }

    public void Withdraw(double amount) throws InsufficientException{

        if (balance<amount){
            throw new InsufficientException();

        }else {
            balance = balance-amount;
            System.out.println("The new balance is : "+balance);
        }


    }
}
