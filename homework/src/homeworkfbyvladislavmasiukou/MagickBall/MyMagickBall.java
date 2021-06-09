package MagickBall;

import java.util.List;
import java.util.Random;

public class MyMagickBall {

        List<String> answers = List.of(
                //positive answers
                "It is certain",
                "It is decidedly so",
                "Without a doubt",
                "Yes — definitely",
                "You may rely on it",
                //indecisively positive answers
                "As I see it, yes",
                "Most likely",
                "Outlook good",
                "Signs point to yes",
                "Yes",
                //neutral answers
                "Reply hazy, try again",
                "Ask again later",
                "Better not tell you now",
                "Cannot predict now",
                "Concentrate and ask again",
                //negative answers
                "Don’t count on it",
                "My reply is no",
                "My sources say",
                "Outlook not so good",
                "Very doubtful"
        );
        public int ShakeBall() {
            Random r = new Random();
            int rand = r.nextInt(20);
            return rand;
        }
}
