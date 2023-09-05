package Controler;

import Model.Token;
import Model.User;

public interface IServices {
    String getToken(String jsonUser);
    boolean checkToken(String jsonToken);
    void removeToken(String jsonToken);
}
