package BeerFactory.Data.Sensors;

import BeerFactory.Data.Model.InfoFromSensor;
import BeerFactory.Data.Model.TypSensor;
import BeerFactory.Data.RawDate.ISensor;

/**Виртуальный датчик реализует подключние к физическому датчику и конвертирует
 * сырые данные в нужный формат
 *
 * @param <T>
 */
public abstract class Sensor<T> implements DataConverter, ISensor<T>{



    // Данные с сенсора конвертированые в формат для БД
    InfoFromSensor sensorData;

    public Sensor(String name,String[] conectionParam, TypSensor typeSensor) {
        this.sensorData = new InfoFromSensor(name);
        conect(conectionParam);
        sensorData.setTypSensor(typeSensor);
    }

    /**
     * Статус подключения
     * @return - подключен или нет
     */
    public abstract boolean getStatus();

    /**
     * Информация с конкретного датчика
     * Сыры данные пропускаются через конвертер
     * @return
     */
    public abstract InfoFromSensor getDate();




}
