package BeerFactory.Data.DataCollection;

import BeerFactory.Data.Model.InfoFromSensor;
import BeerFactory.Data.Repository.SensorDateRep;
import BeerFactory.Data.Sensors.Sensor;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class DateCollector implements IDateCollector{
    List<Sensor> sensors = new ArrayList<>();
    Map<String,Integer> collectionInterval;
    SensorDateRep reposytory;

    /**
     * Сор данных и их запись в рпоситорий с учетом интервала сбора
     * @return
     */
    @Override
    public boolean startCollect() {
        return false;
    }

    @Override
    public boolean stopCollect() {
        return false;
    }

    /**
     * Записывает данные датчика в репозиторий
     * @param sensor - сенсор с которого данные будут записываться
     * @return - результат записи
     */
    @Override
    public boolean pushDate(Sensor sensor) {
        reposytory.putDate(sensor.getDate());
        return true;
    }

    /**
     * Добавляет новый сенсор для мониторнга.
     *
     * @param sensor - сенсор
     * @param interval - периодичность сбора данных
     */
    public void add(Sensor sensor,int interval){
        sensors.add(sensor);
        collectionInterval.put(sensor.getDate().getName(),interval);
    }

    /**
     * Удаляет сенсор из системы мониторинга
     * @param sensor
     */
    public void remove(Sensor sensor){
        // удаление сенсора и сопутствующей информаии из систмы сбора данных.
    }
}
