import java.time.LocalDate;
import java.util.List;

public class SortAccount {
    public static class Account {
        double amount;
        double interestRate;
        LocalDate duePayment;

        Account (double amount, double interestRate, LocalDate duePayment)
        {
            this.amount = amount;
            this.interestRate = interestRate;
            this.duePayment = duePayment;
        }

        public double getAmount() {
            return amount;
        }

        public double getInterestRate() {
            return interestRate;
        }

        public LocalDate getDuePayment() {
            return duePayment;
        }
    }

    public static void sortByAmount(List<Account> accounts)
    {
        accounts.sort((a1,a2) -> Double.compare(a1.getAmount(), a2.getAmount()));
    }
    public static void sortByInterestRate(List<Account> accounts)
    {
        accounts.sort((b1,b2) -> Double.compare(b1.getInterestRate(), b2.getInterestRate()));
    }
    public static void sortByDuePayment(List<Account> accounts)
    {
        accounts.sort((c1,c2) -> c1.getDuePayment().compareTo(c2.getDuePayment()));
    }
}
