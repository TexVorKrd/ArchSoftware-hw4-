package BeerFactory.Data.Repository;

import BeerFactory.Data.Model.InfoFromSensor;

import java.util.List;

public interface IRepository {
    /**
     * Подключение к внешней БД
     */
    void conect();

    /**
     * Чтение данных
     * @return
     */
    List<InfoFromSensor> getDate();

    /**
     * Запись данных
     * @param date - Данные из модели
     * @return - результат записи
     */
    boolean putDate(InfoFromSensor date);
}
