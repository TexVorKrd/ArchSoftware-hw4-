package Controler.ViewServices;

import Model.Domen.Order;
import Model.Domen.Room;
import Model.Domen.Table;

import java.util.Date;
import java.util.List;

public interface IViewReqests {

    void askFreeTables(String jsonREquest);
    void askRooms(String jsonREquest);
    void confirmBooking(String jsonREquest);
}
