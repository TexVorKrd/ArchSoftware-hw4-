package Model.Domen;

import java.util.Date;

public class Order {
    int id;
    Date date;
    String name;
    String phone;
    Table table;

    public Order(int id, Date date, String name, String phone, Table table) {
        this.id = id;
        this.date = date;
        this.name = name;
        this.phone = phone;
        this.table = table;
    }
}
