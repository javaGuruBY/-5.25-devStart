package MagickBall;

import java.util.logging.Logger;

public class MyMagickBallMain {
    private static Logger log = Logger.getLogger("MagickBall");
    public static void main(String[] args) {

        MyMagickBall myMagickBall = new MyMagickBall();

        log.info(myMagickBall.answers.get(myMagickBall.ShakeBall()));
    }
}
