package dto;

import lombok.*;
import org.springframework.security.crypto.bcrypt.BCrypt;
import runner.OnlineMarket;

import static constant.PropertyConstant.BCRYPT_SALT;

@Data
public class User {

    @Setter(AccessLevel.PRIVATE)
    private String login;

    @ToString.Exclude
    @Getter(AccessLevel.PRIVATE)
    private String password;

    private User(String login) {
        this.login = login;
    }

    private User() {
    }

    public static User register(String login, String password) {
        if (OnlineMarket.isExistsUser(login)) return null;
        User user = new User(login);
        user.setPassword(password);
        return user;
    }

    public static User login(String login, String password) {
        if (!OnlineMarket.isExistsUser(login)) return new User();
        User user = OnlineMarket.getUser(login);
        return BCrypt.checkpw(password,user.getPassword()) ? user : new User();
    }

    private void setPassword(String password) {
        this.password = BCrypt.hashpw(password, BCRYPT_SALT);
    }

    private boolean checkPassword(String password) {
        return BCrypt.checkpw(password, this.password);
    }


}
