import org.junit.Test;

import java.util.logging.Logger;

public class CreditCardTest {

   private static Logger log = Logger.getLogger("TestCard");
    CreditCard testCard = new CreditCard(12345, 12345);

    @Test
    public void depositTest(){

        double a = 200;
        double b = 500;
        double expected = 700;
        testCard.deposit(12345,b);
        testCard.deposit(12345,a);
        double actual = testCard.getBalance();
        if(actual == expected){
            log.info("Test success");
        }else log.info("Test failed");
    }

    public void withDrawTest(){
        testCard.setBalance(0);
        double a = 200;
        double b = 500;
        double expected = 300;

        testCard.deposit(12345,b);
        testCard.withDraw(12345,a);

        double actual = testCard.getBalance();
        if(actual == expected){
            log.info("Test success");
        }else log.info("Test failed");
    }

}
