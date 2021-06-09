package ceditcard;


import java.util.logging.Logger;

public class CreditCardService {

    CreditCard creditCard = new CreditCard(1234,1234);
    Logger log = Logger.getLogger("CreditCardService");

    public double deposit(int pinC, double a) {
        if (pinC != creditCard.getPinCod())
            log.info("Your pin-code is incorrect, please try again.");
        else if (creditCard.getLoanDept() != 0) {
            if ((creditCard.getLoanDept() - a) <= 0) {
                double e = creditCard.getLoanDept() - a;
                creditCard.setLoanDept(0);
                creditCard.setBalance(creditCard.getBalance() - e);
            } else creditCard.setLoanDept( creditCard.getLoanDept() - a);
        } else if (creditCard.getLoanDept() == 0) {
            creditCard.setBalance(creditCard.getBalance() + a);
        }
        return creditCard.getBalance();
    }

    public double withDraw(int pinC, double a) {
        if (pinC != creditCard.getPinCod())
            log.info("Your pin-code is incorrect, please try again");
        else if ((creditCard.getBalance() - a) >= 0)
            creditCard.setBalance(creditCard.getBalance() - a);
        else if ((creditCard.getCreditLimit() + creditCard.getBalance() - a) >= 0 && (creditCard.getBalance() - a) < 0) {
            double d = creditCard.getBalance() - a;
            creditCard.setLoanDept( creditCard.getLoanDept() - d);
            creditCard.setBalance(0);
        } else if ((creditCard.getBalance() - a) < 0 && (creditCard.getCreditLimit() + creditCard.getBalance() - a) < 0) {
            log.info("Your loan dept is exceeds credit limit");
        }
        return creditCard.getBalance();
    }
}
