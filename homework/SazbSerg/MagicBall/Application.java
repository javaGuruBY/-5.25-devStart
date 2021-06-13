package MagicBall;
import java.util.List;
import java.util.Random;

public class Application {
    public static void main(String[] args) {
        Random randomGenerator = new Random();

        List<String> defList = List.of("Бесспорно","Предрешено", "Никаких сомнений", "Бесспорно",
                "Предрешено", "Никаких сомнений", "Определённо да", "Можешь быть уверен в этом",
                "Мне кажется — «да»", "Вероятнее всего", "Хорошие перспективы",
                "Знаки говорят — «да»", "Да", "Пока не ясно, попробуй снова", "Спроси позже",
                "Лучше не рассказывать", "Сейчас нельзя предсказать",
                "Сконцентрируйся и спроси опять", "Даже не думай", "Мой ответ — «нет»",
                "По моим данным — «нет»", "Перспективы не очень хорошие", "Весьма сомнительно");

        int Randomize = randomGenerator.nextInt(20);
        System.out.println(defList.get(Randomize));
    }

}