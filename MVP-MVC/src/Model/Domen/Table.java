package Model.Domen;

import java.util.List;

public class Table {
    int id;
    List<Photo> tableList;
    int number;
    int value;
    Room room;

    public Table(int id, List<Photo> tableList, int number, int value, Room room) {
        this.id = id;
        this.tableList = tableList;
        this.number = number;
        this.value = value;
        this.room=room;
    }
}
