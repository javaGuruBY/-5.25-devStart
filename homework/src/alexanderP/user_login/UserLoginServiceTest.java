package alexanderP.user_login;

import org.junit.Test;

import static org.junit.Assert.*;

public class UserLoginServiceTest {

    @Test
    public void lockUser() {
        User user = new User("User_1", "123", true);
        User actual = UserLoginService.lockUser(user);
        assertFalse(actual.getLock());
    }

    @Test
    public void login() {
        User user = new User("User_1", "123", true);
        User userMain = new User("User_1", "123", true);
        assertTrue(UserLoginService.login(user, userMain));
    }

    @Test
    public void loginNotPin() {
        User user = new User("User_1", "111123", true);
        User userMain = new User("User_1", "123", true);
        assertFalse(UserLoginService.login(user, userMain));
    }
}