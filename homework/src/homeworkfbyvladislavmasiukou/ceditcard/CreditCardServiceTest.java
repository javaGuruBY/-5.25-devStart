package ceditcard;

import org.junit.Test;

import static org.junit.Assert.*;

public class CreditCardServiceTest {

    CreditCardService creditCardService = new CreditCardService();

    @Test
    public void deposit() {

        double expected = 700;
        double actual = creditCardService.deposit(1234, 700);
        assertEquals(expected,actual,0);
    }

    @Test
    public void withDraw() {

        creditCardService.deposit(1234,500);
        double expected = 200;
        double actual = creditCardService.withDraw(1234, 300);
        assertEquals(expected,actual,0);
    }
}