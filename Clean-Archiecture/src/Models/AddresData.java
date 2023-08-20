package Models;

/**
 * Эмуяция КЛАДР класификация адресов
 * Не коментирую поля, назания логически понятные
 * Для здания и квартиры выран тип стринг, так как могут содержать не только цифры.
 */
public class AddresData {

    CountryData country;
    int index;
    String city;
    String road;
    String building;
    String floatNumber;

    public AddresData(CountryData country, int index, String city, String road, String building, String floatNumber) {
        this.country = country;
        this.index = index;
        this.city = city;
        this.road = road;
        this.building = building;
        this.floatNumber = floatNumber;
    }
}
