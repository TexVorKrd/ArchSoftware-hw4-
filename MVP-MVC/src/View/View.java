package View;

import Controler.Controler;

public abstract class View implements IView,IViewUpdates {
    Controler controler;

    public View(Controler controler) {
        this.controler = controler;
    }
    abstract public void update();
}
