package BeerFactory.Data.DataCollection;

import BeerFactory.Data.Model.InfoFromSensor;
import BeerFactory.Data.Sensors.Sensor;

public interface IDateCollector {
    /**
     * Запуск сбора данных
     * @return
     */
    boolean startCollect();

    /**
     * Завершение сбора данных
     * @return
     */
    boolean stopCollect();

    /**
     * Запись данных в репозиторий
     * @param date - данные с сенсора
     * @return - результат записи
     */
    boolean pushDate(Sensor date);

}
