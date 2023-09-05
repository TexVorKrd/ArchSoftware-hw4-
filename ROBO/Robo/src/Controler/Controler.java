package Controler;

import Model.Token;
import Model.User;
import Repository.Repo;
import Services.Maper;
import View.View;

public class Controler implements IServices {
    private Repo repo;
    private View view;
    private Maper maper;

    public Controler(Repo repo, View view, Maper maper) {
        this.repo = repo;
        this.view = view;
        this.maper = maper;
    }

    @Override
    public String getToken(String jsonUser) {
        User user=maper.jsonToUser(jsonUser);
        Token token=repo.getToken(user);
        return maper.tokenToJson(token);
    }

    @Override
    public boolean checkToken(String jsonToken) {
        Token token=maper.jsonToToken(jsonToken);
        return repo.checkToken(token);
    }

    @Override
    public void removeToken(String jsonToken) {
        Token token=maper.jsonToToken(jsonToken);
        repo.removeToken(token);

    }
}
