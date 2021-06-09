package alexanderP.credit_card;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConsoleTest  {

    @Test
    public void depositNotPin() throws Exception {
        String pin = "1111";
        int sum = 111;
        assertFalse(Console.deposit(sum, pin));
    }

    @Test
    public void deposit() throws Exception {
        String pin = "1234";
        int sum = 111;
        assertTrue(Console.deposit(sum, pin));
    }

    @Test
    public void pinCardNotPin() throws Exception {
        String pin = "1111";
        assertFalse(Console.pinCard(pin));
    }

    @Test
    public void pinCard() throws Exception {
        String pin = "1234";
        assertTrue(Console.pinCard(pin));
    }

    @Test
    public void withdrawNotPin() throws Exception {
        String pin = "1111";
        int sum = 111;
        assertFalse(Console.deposit(sum, pin));
    }

    @Test
    public void withdraw() throws Exception {
        String pin = "1234";
        int sum = 111;
        assertTrue(Console.deposit(sum, pin));
    }
}