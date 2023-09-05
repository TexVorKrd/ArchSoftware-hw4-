package View;

import Controler.Controler;
import Model.Token;
import Model.User;

public abstract class View implements IView{

    private Controler controler;

    public View() {

    }

    public void setControler(Controler controler) {
        this.controler = controler;
    }

    public String getTokenFromRepo(String jsonUser) {
        return controler.getToken(jsonUser);
    }


    public boolean checkToken(String jsonToken) {
        return controler.checkToken(jsonToken);
    }


    public void removeToken(String jsonToken) {
        controler.removeToken(jsonToken);

    }
}
