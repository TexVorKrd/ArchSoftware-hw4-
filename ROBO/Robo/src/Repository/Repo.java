package Repository;

import Model.Robo;
import Model.Token;
import Model.User;

import java.util.ArrayList;
import java.util.List;

public abstract class Repo implements IRepo{
    private List<User> users;
    private List<Token> tokens;
    private List<Robo> robots;
    public Token getToken(User user){
        return null;
    }

    public boolean checkToken(Token token){
        return true;
    }

    public void removeToken(Token token){

    }

    public Repo() {
        connect();
        users=new ArrayList<User>();
        tokens=new ArrayList<Token>();
        robots=new ArrayList<Robo>();
        load();
    }
}
