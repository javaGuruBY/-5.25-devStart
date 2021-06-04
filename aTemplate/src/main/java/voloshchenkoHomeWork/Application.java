package voloshchenkoHomeWork;

import java.util.Random;

public class Application {
    public static void main(String[] args) {
        System.out.println("Монета подброшена! ");
        Random random = new Random();
        int flip = random.nextInt(2);
        if(flip == 1){
            System.out.println("Выпал: Orel");
        }
        else{
            System.out.println("Выпала: Reshka");
        }
    }
}
