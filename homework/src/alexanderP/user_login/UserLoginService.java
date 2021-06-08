package alexanderP.user_login;

import java.util.Scanner;

public class UserLoginService {

    private static int count = 0;
    private static boolean flag = true;

    public static void main(String[] args) {

        User userMain = new User("User_1", "123", true);

        // boolean flag = true;
        while (flag) {
            User user = enterData();
            count++;
            if (login(user, userMain)) {
                System.out.println("Пользователь: " + user.getLogin() + " онлайн");
            } else {
                System.out.println("Некорректные данные...");
            }
            if(count >= user.getCountMaxEnter()) {
                flag = false;
                lockUser(user);
                System.out.println("Пользователь: " + user.getLogin() + " заблокирован.... " +
                        "Проверьте правильность пароля");
            }
        }
    }

    private static User enterData() {
        Scanner reader = new Scanner(System.in);
        System.out.print("Введите логин: ");
        String login = reader.nextLine();
        System.out.print("Введите пароль: ");
        String password = reader.nextLine();
        return new User(login, password);
    }

    public static User lockUser(User user) {
        user.setLock(false);
       return user;
    }

    public static boolean login(User user, User userMain) {
            if(user.getLogin().equals(userMain.getLogin())) {
                if(user.getPassword().equals(userMain.getPassword())) {
                    return true;
                }
            }
        return false;
    }
}
