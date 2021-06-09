package alexanderP.navigation_menu;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Console {

    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) {

        boolean flag = true;
        try {
            while (flag) {
                System.out.println("1. Code\n2. Issues\n3. Pull requests\n4. Insights\n5. Settings\n 6. Выход");
                System.out.print("\nВведите номер раздела - ");
                String line = reader.readLine();
                switch (line) {
                    case "1":
                        flag = codeMenu();
                        break;
                    case "2":
                        flag = issuesMenu();
                        break;
                    case "3":
                        flag = pullRequestsMenu();
                        break;
                    case "4":
                        flag = insightsMenu();
                        break;
                    case "5":
                        flag = settingsMenu();
                        break;
                    case "6":
                        flag = false;
                    default:
                        System.out.println("Некорректный выбор... Повторите попытку...");
                        break;

                }
            }
        }catch (Exception e) {
            e.getStackTrace();
        }
    }

    static boolean issuesMenu() throws Exception {
        boolean flag = true;
        while (flag) {
            System.out.println("Issues Menu\n\n1. Issues 1\n2. Issues 2\n3. Назад\n4. Выход и закончить");
            System.out.print("Введите номер раздела - ");
            String line = reader.readLine();
            switch (line) {
                case "1":
//                    flag = issues1();
                    break;
                case "2":
//                    flag = issues2();
                    break;
                case "3":
                    return true;
                case "4":
                    flag = false;
                    break;
                default:
                    System.out.println("Некорректный выбор... Повторите попытку...");
                    break;
            }
        }
        return false;
    }

    static boolean codeMenu() throws Exception {
        boolean flag = true;
        while (flag) {
            System.out.println("Code Menu\n\n1. Settings\n2. Remove\n3. Назад\n4. Выход и закончить");
            System.out.print("Введите номер раздела - ");
            String line = reader.readLine();
            switch (line) {
                case "1":
//                    flag = settings();
                    break;
                case "2":
//                    flag = remove();
                    break;
                case "3":
                    return true;
                case "4":
                    flag = false;
                    break;
                default:
                    System.out.println("Некорректный выбор... Повторите попытку...");
                    break;
            }
        }
        return false;
    }

    static boolean insightsMenu() throws Exception {
        boolean flag = true;
        while (flag) {
            System.out.println("Insights Menu\n\n1. Insights 1\n2. Insights 2\n3. Назад\n4. Выход и закончить");
            System.out.print("Введите номер раздела - ");
            String line = reader.readLine();
            switch (line) {
                case "1":
//                    flag = insights1();
                    break;
                case "2":
//                    flag = insights2();
                    break;
                case "3":
                    return true;
                case "4":
                    flag = false;
                    break;
                default:
                    System.out.println("Некорректный выбор... Повторите попытку...");
                    break;
            }
        }
        return false;
    }

    static boolean pullRequestsMenu() throws Exception {
        boolean flag = true;
        while (flag) {
            System.out.println("Pull requests Menu\n\n1. Requests 1\n2. Requests 2\n3. Назад\n4. Выход и закончить");
            System.out.print("Введите номер раздела - ");
            String line = reader.readLine();
            switch (line) {
                case "1":
//                    flag = requests1();
                    break;
                case "2":
//                    flag = requests2();
                    break;
                case "3":
                    return true;
                case "4":
                    flag = false;
                    break;
                default:
                    System.out.println("Некорректный выбор... Повторите попытку...");
                    break;
            }
        }
        return false;
    }

    static boolean settingsMenu() throws Exception {
        boolean flag = true;
        while (flag) {
            System.out.println("Settings Menu\n\n1. Settings 1\n2. Settings 2\n3. Назад\n4. Выход и закончить");
            System.out.print("Введите номер раздела - ");
            String line = reader.readLine();
            switch (line) {
                case "1":
//                    flag = settings1();
                    break;
                case "2":
//                    flag = settings2();
                    break;
                case "3":
                    return true;
                case "4":
                    flag = false;
                    break;
                default:
                    System.out.println("Некорректный выбор... Повторите попытку...");
                    break;
            }
        }
        return false;
    }
}
