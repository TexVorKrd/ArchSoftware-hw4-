package BeerFactory.Services.MonitoringSystem;

import BeerFactory.Data.Sensors.Sensor;
import BeerFactory.Views.SensorMonitoting.IDrawSensorsStatus;
import BeerFactory.Views.SensorMonitoting.IDrawSpace;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Система мониторинга сенсоров
 */
public abstract class MonitoringSystem  {
    /**
     * Список сенсоров для мониторинга
     */
    List<Sensor> sensors = new ArrayList<>();

    /**
     * Интрвал мониторинга
     */
    Map<String,Integer> collectionInterval;

    /**
     * Место отображения
     */

     IDrawSpace monior;
    /**
     * Способ отображения
     */
     IDrawSensorsStatus drawMetods;

    public MonitoringSystem(IDrawSpace monior, IDrawSensorsStatus drawMetods) {
        this.monior = monior;
        this.drawMetods = drawMetods;
    }

    //Обработка и отображение информации о датчиках
    public abstract void startMotitoring();

    //Остановка мониторинга
    public abstract void stopMotitoring();

}
