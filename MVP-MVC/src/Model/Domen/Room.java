package Model.Domen;

import Model.Repository.Repository;

import java.util.ArrayList;
import java.util.List;

public class Room {
    int id;
    String name;
    String description;
    List<Photo> photos;


    public Room(int id, String name, String description, List<Photo> photos) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.photos = photos;
    }
}
