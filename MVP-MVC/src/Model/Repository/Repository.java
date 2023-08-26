package Model.Repository;

import Controler.Controler;
import Model.Domen.Order;
import Model.Domen.Room;
import Model.Domen.Table;
import Model.Repository.Filters.Filter;

import java.util.List;

public abstract class Repository implements iRepository {
    private List<Room> rooms;
    private List<Table> tables;
    private List<Order> orders;



    public Repository(Controler controler) {
        connect();
        this.rooms=loadRooms();
        this.tables=loadTables();
        this.orders=loadOrders();

    }

    abstract List<Order> loadOrders();
    abstract List<Table> loadTables();
    abstract List<Room> loadRooms();

    public List<Room> getRooms(Filter filter) {
        return rooms;
    }

    public List<Table> getTables(Filter filter) {
        return tables;
    }

    public List<Order> getOrders(Filter filter) {
        return orders;
    }
}
