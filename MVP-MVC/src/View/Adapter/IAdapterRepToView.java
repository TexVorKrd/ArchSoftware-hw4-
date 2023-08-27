package View.Adapter;

import Model.Domen.Order;
import Model.Domen.Room;
import Model.Domen.Table;

import java.util.List;

public interface IAdapterRepToView {

    String convertRoomToJson(List<Room> room);
    String convertTableToJson(List<Table> table);
    String convertOrderToJson(Order order);

}
