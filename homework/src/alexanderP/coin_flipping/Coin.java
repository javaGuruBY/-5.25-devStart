package alexanderP.coin_flipping;

public class Coin {

    public static void main(String[] args) {

        System.out.println(eagleOrNut((int)(Math.random() * 1000)));
    }

    static String eagleOrNut(int number) {
        if(number % 2 == 0) {
            return "Eagle";
        }
        return "Nut";
    }
}
