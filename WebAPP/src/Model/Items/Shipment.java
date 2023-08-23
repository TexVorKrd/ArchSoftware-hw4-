package Model.Items;

import java.util.HashMap;

/**
 * Отгрузка
 */
public class Shipment {
    private Order order;
    private HashMap<Prodact,Integer> shipment;
    private int value;
}
