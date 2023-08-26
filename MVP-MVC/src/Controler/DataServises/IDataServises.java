package Controler.DataServises;

import Model.Domen.Room;
import Model.Domen.Table;

import java.util.List;

public interface IDataServises {
    List<Room> getRooms();
    List<Table> getTables();

}
