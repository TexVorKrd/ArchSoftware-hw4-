package View.Adapter;

import Model.Domen.Order;
import Model.Domen.Room;
import Model.Domen.Table;
import Model.Repository.Filters.Filter;

import java.util.List;

public interface IAdapterViewToRep {
    List<Room> convertJsonToRooms(String json);
    List<Table> convertJsonToTables(String json);
    Order convertJsonToOrde(String json);
    Filter filterFromReqest(String json);
}
