package alexanderP.coin_flipping;

import org.junit.Test;

import static org.junit.Assert.*;

public class CoinTest {

    Coin coin = new Coin();

    @Test
    public void eagleOrNutEagle() {
        String expected = "Eagle";
        int number = 2;
        assertEquals(expected, Coin.eagleOrNut(number));
    }

    @Test
    public void eagleOrNutNut() {
        String expected = "Nut";
        int number = 1;
        assertEquals(expected, Coin.eagleOrNut(number));
    }
}