public class BankAccount {
    double balance;

    public BankAccount()
    {
        balance = 0;
    }
    public BankAccount(double i)
    {
        balance = i;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double add)
    {
        balance += add;
    }

    public void withdraw(double get)
    {
        balance -= get;
    }
}
