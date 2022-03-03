public class BankAccounts{

    private double balance;
    private String name;
    private String accountNumber;
    private double interestRate;

    public Bank (double deposit, String name, String accountNumbers, double interestRate){
        this.balance = deposit;
        this.name = name;
        this.accountNumber = accountNumber;
        this.interestRate = interestRate;
    }

    public Bank (String name, String accountNumbers, double interestRate){
        this.balance = 0;
        this.name = name;
        this.accountNumber = accountNumber;
        this.interestRate = interestRate;
    }

    public boolean deposit(double amount){
        if (amount > 0){
            this.balance = this.balance + amount;
            return true;
        } else {
            return false;
        }
    }

    public boolean withdrawal(double amount){
        if (amount > 0 && amount > balance){
            this.balance = this.balance - amount;
            return true;
        } else {
            return false;
        }

    }

    public boolean transfer(BankAccounts bank2, double amount){
        if (bank2 == null){
            return false;
        }
        if(this.withdraw(amount))
    }


}