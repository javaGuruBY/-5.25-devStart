package voloshchenkoHomeWork;

import java.util.Random;

public class Application {
    public static void main(String[] args) {
        Random random = new Random();
        int flip = random.nextInt(2);
        if(flip == 1){
            System.out.println("Orel");
        }
        else{
            System.out.println("Reshka");
        }
    }
}
