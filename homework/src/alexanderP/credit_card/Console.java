package alexanderP.credit_card;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Console {

    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static CreditCard creditCard = new CreditCard("Card1", "1234", 500);
    public static void main(String[] args) throws Exception{


        showCard(creditCard);
        System.out.print("Введите пин-код карты:");
        String pin = reader.readLine();
        System.out.print("Пополнение счёта. Введите сумму: ");
        int sumAdd = Integer.parseInt(reader.readLine());
        deposit(sumAdd, pin);
        showCard(creditCard);
        System.out.println("******************************");
        System.out.println("Снятие денег");
        showCard(creditCard);
        System.out.print("Введите пин-код карты:");
        pin = reader.readLine();
        System.out.print("Введите сумму: ");
        int sumMinus = Integer.parseInt(reader.readLine());
        withdraw(sumMinus, pin);
        showCard(creditCard);
    }

    public static boolean deposit(int sum, String pin) throws Exception {
        if (pinCard(pin)) {
            creditCard.setSum(creditCard.getSum() + sum);
            System.out.println("Пополнение успешно...");
            return true;
        }
        return false;
    }

    public static void showCard(CreditCard card) {
        System.out.print("Данные карты:");
        System.out.println(card.toString());
    }

    public static boolean pinCard(String pin) throws Exception {
        if(pin.equals(creditCard.getPinCard())) {
            return true;
        }
        System.out.println("Пин Код не верен");
        return false;
    }

    public static boolean withdraw(int sum, String pin) throws Exception {
        if(pinCard(pin)) {
            if(creditCard.getSum() - sum >= creditCard.getMaxCredit()) {
                creditCard.setSum(creditCard.getSum() - sum);
                System.out.println("Деньги сняты...");
                return true;
            } else {
                System.out.println("Операция отклонена. Превишение кредитного лимита");
            }
        }
        return false;
    }
}
