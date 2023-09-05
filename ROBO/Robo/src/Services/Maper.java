package Services;

import Model.Token;
import Model.User;

public abstract class Maper {
    public abstract String tokenToJson(Token token);
    public abstract String userToJson(User user);
    public abstract Token jsonToToken(String jsonToken);
    public abstract User jsonToUser(String jsonUser);

}
