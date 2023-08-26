package Controler;

import Controler.DataServises.IDataServises;
import Controler.ViewServices.IViewReqests;
import Model.Domen.Order;
import Model.Domen.Room;
import Model.Domen.Table;
import Model.Repository.Filters.Filter;
import Model.Repository.Repository;
import View.View;

import java.util.Date;
import java.util.List;

public class Controler implements IViewReqests,IDataServises {
    Repository repository;
    View view;
    IDataServises dataServises;


    public Controler(Repository repository, View view) {
        this.repository = repository;
        this.view = view;
    }

    @Override
    public void askFreeTables(Date date, Room room) {
        List<Table> tables=getTables();
        String filtringTables="";
        view.updateTablesInfo(filtringTables);
    }

    @Override
    public void askRooms(Room room) {
        getRooms();
        String roomToString="";
        view.updateRommsInfo(roomToString);
    }

    @Override
    public void confirmBooking(Order order) {
        String orderConfirm="";
        view.updateOrderInfo(orderConfirm);
    }

    @Override
    public List<Room> getRooms() {
        Filter filter=new Filter() {
        };
        return repository.getRooms(filter);
    }

    @Override
    public List<Table> getTables() {
        Filter filter=new Filter() {
        };
        return repository.getTables(filter);
    }
}
