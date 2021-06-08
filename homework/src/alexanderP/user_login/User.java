package alexanderP.user_login;

public class User {

    private String login;
    private String password;
    private boolean lock;
    private int countMaxEnter = 3;

    public User() {
    }

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public User(String login, String password, boolean lock) {
        this.login = login;
        this.password = password;
        this.lock = lock;
    }

    public boolean getLock() {
        return lock;
    }

    public void setLock(boolean lock) {
        this.lock = lock;
    }

    public int getCountMaxEnter() {
        return countMaxEnter;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
