package Controler;

import Controler.ViewServices.IViewReqests;

import Model.Domen.Order;
import Model.Repository.Filters.Filter;
import Model.Repository.Repository;
import View.Adapter.Adapter;
import View.View;


public class Controler implements IViewReqests {
    Repository repository;
    View view;

    Adapter adapter;
    public Controler(Repository repository, View view, Adapter adapter) {
        this.repository = repository;
        this.view = view;
        this.adapter = adapter;
    }

    @Override
    public void askFreeTables(String jsonREquest) {
        Filter filter = adapter.filterFromReqest(jsonREquest);
        String jsonAnswer= adapter.convertTableToJson(
                repository.getTables(filter)
        );
        view.updateRommsInfo(jsonAnswer);
    }

    @Override
    public void askRooms(String jsonREquest) {
        Filter filter = adapter.filterFromReqest(jsonREquest);
        String jsonAnswer= adapter.convertRoomToJson(
                repository.getRooms(filter)
                );
        view.updateTablesInfo(jsonAnswer);
    }

    @Override
    public void confirmBooking(String jsonREquest) {
        Order order=adapter.convertJsonToOrde(jsonREquest);
        repository.addOrder(order);
        view.updateOrderInfo(adapter.convertOrderToJson(order));
    }
}
