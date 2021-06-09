package ceditcard;

public class CreditCard {

    private int numberOfCard;
    private int pinCod;
    private double balance;
    private double creditLimit;
    private double loanDept;

    CreditCard(int num, int pin) {
        this.numberOfCard = num;
        this.pinCod = pin;
        balance = 0d;
        loanDept = 0d;
    }

    public int getNumberOfCard() {
        return numberOfCard;
    }

    public void setNumberOfCard(int numberOfCard) {
        this.numberOfCard = numberOfCard;
    }

    public int getPinCod() {
        return pinCod;
    }

    public void setPinCod(int pinCod) {
        this.pinCod = pinCod;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public double getLoanDept() {
        return loanDept;
    }

    public void setLoanDept(double loanDept) {
        this.loanDept = loanDept;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "ceditcard.CreditCard{" +
                "numberOfCard=" + numberOfCard +
                ", pinCod=" + pinCod +
                ", balance=" + balance +
                ", creditLimit=" + creditLimit +
                ", loanDept=" + loanDept +
                '}';
    }
}
