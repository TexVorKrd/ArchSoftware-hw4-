package Controler.ViewServices;

import Model.Domen.Order;
import Model.Domen.Room;
import Model.Domen.Table;

import java.util.Date;
import java.util.List;

public interface IViewReqests {

    void askFreeTables(Date date, Room room);
    void askRooms(Room room);
    void confirmBooking(Order order);
}
