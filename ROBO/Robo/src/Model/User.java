package Model;

public class User {
    private String name;
    private String login;
    private String hashPassword;
    private String email;

    public User(String name, String login, String hashPassword, String email) {
        this.name = name;
        this.login = login;
        this.hashPassword = hashPassword;
        this.email = email;
    }
}
