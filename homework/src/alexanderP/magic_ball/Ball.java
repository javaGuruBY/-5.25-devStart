package alexanderP.magic_ball;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ball {

    static List<String> magicBall = new ArrayList<>();

    public static void main(String[] args) throws Exception {

        magicBall.add("Бесспорно");
        magicBall.add("Предрешено");
        magicBall.add("Никаких сомнений");
        magicBall.add("Определенно да");
        magicBall.add("Можешь быть уверен в этом");
        magicBall.add("Мне кажется - да");
        magicBall.add("Вероятнее всего");
        magicBall.add("Хорошие перспективы");
        magicBall.add("Знаки говорят - да");
        magicBall.add("Да");
        magicBall.add("Пока не ясно, попробуй снова");
        magicBall.add("Спроси позже");
        magicBall.add("Лучше не рассказывать");
        magicBall.add("Сейчас нельзя предсказать");
        magicBall.add("Сконцетрируйся и спроси опять");
        magicBall.add("Даже не думай");
        magicBall.add("Мой ответ - нет");
        magicBall.add("По моим данным - нет");
        magicBall.add("Преспективы не очень хорошие");
        magicBall.add("Весьма сомнительно");

        Random random = new Random();
        int number = random.nextInt(19);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите ваш вопрос: ");
        String question = reader.readLine();
        System.out.println("Ваш вопрос - " + question);
        answer(number);

    }

    static void answer(int number) {
        System.out.print("Магический шар показал: ");
        System.out.println(magicBall.get(number));
    }
}
