package Models;

import java.util.Date;

/**
 * Информация которая есть у каждого человека. Упрощенно.
 */
public class PerconeData {
    String fName;
    String sName;
    Date bDay;
    AddresData addres;
    int inn;
    Sex sex;

    public PerconeData(String fName, String sName, Date bDay, AddresData addres, int inn, Sex sex) {
        this.fName = fName;
        this.sName = sName;
        this.bDay = bDay;
        this.addres = addres;
        this.inn = inn;
        this.sex = sex;
    }
}
