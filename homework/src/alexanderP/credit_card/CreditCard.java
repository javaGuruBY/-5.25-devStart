package alexanderP.credit_card;

public class CreditCard {

    private String idCard;
    private String pinCard;
    private int sum;
    private int maxCredit = -900;

    public CreditCard(String idCard, String pinCard, int sum) {
        this.idCard = idCard;
        this.pinCard = pinCard;
        this.sum = sum;
    }

    public String getPinCard() {
        return pinCard;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public int getMaxCredit() {
        return maxCredit;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "idCard='" + idCard + '\'' +
                ", pinCard='" + pinCard + '\'' +
                ", sum=" + sum +
                ", maxCredit=" + maxCredit +
                '}';
    }
}