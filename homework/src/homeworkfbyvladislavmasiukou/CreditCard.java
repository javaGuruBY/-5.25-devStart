import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CreditCard {

    private int numberOfCard;
    private int pinCod;
    private double balance;
    private double creditLimit;
    private double loanDept;

    Logger log = LoggerFactory.getLogger("CreditCard");

    CreditCard(int num, int pin) {
        this.numberOfCard = num;
        this.pinCod = pin;
        balance = 0d;
        loanDept = 0d;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public double deposit(int pinC, double a) {
        if (pinC != pinCod)
            log.info("Your pin-code is incorrect, please try again.");
        else if (loanDept != 0) {
            if ((loanDept - a) <= 0) {
                double e = loanDept - a;
                loanDept = 0;
                balance = balance - e;
            } else loanDept = loanDept - a;
        } else if (loanDept == 0) {
            balance = balance + a;
        }
        return balance;
    }

    public double withDraw(int pinC, double a) {
        if (pinC != pinCod)
            log.info("Your pin-code is incorrect, please try again");
        else if ((balance - a) >= 0)
            balance = balance - a;
        else if ((creditLimit + balance - a) >= 0 && (balance - a) < 0) {
            double d = balance - a;
            loanDept = loanDept - d;
            balance = 0;
        } else if ((balance - a) < 0 && (creditLimit + balance - a) < 0) {
            log.info("Your loan dept is exceeds credit limit");
        }
        return balance;
    }

    public double getBalance() {
        return balance;
    }

    //This method for TEST.
    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "numberOfCard=" + numberOfCard +
                ", pinCod=" + pinCod +
                ", balance=" + balance +
                ", creditLimit=" + creditLimit +
                ", loanDept=" + loanDept +
                '}';
    }
}
