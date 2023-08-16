package BeerFactory.Data.Model;

import javax.xml.crypto.Data;
import java.time.DateTimeException;
import java.util.Date;

/**
 * Модель данных для сохранения в БД отражающие информацию с конкретного датчика
 * в конкретный момент времени.
 */
public class InfoFromSensor {
    private DateTimeException date;
    private double value;
    private String name;
    private TypSensor typSensor;

    public InfoFromSensor(String name) {

        this.name = name;

    }

    public String getName() {
        return name;
    }

    public DateTimeException getDate() {
        return date;
    }

    public void setDate(DateTimeException date) {
        this.date = date;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public TypSensor getTypSensor() {
        return typSensor;
    }

    public void setTypSensor(TypSensor typSensor) {
        this.typSensor = typSensor;
    }
}
