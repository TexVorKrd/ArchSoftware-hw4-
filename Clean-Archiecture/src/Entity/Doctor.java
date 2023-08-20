package Entity;

import Models.DoctorData;
import Models.Record;

/**
 * Все маниуляции с пациентом выполняет доктор.
 * Прдполагается логика билдера. В хое приема Доктор выполняет набор различных мероприятий.
 * Начинает/Завершает  прием
 * В ходе приема может выполнть одно из действий:
 * Сбор анамнеза
 * Назначение различны анлизов
 * Запись к различниым специалистам
 * Запись на процедуры
 *
 * В качестве данных передается сама запись(ссылка на запись) так как содержат исчеерпывающую информацию
 * кто кому когда.
 */
public abstract class Doctor {

    private DoctorData doctor;

    public Doctor(DoctorData doctor) {
        this.doctor = doctor;
    }

    abstract void startRecord(Record record);
    abstract void stopRecord(Record record);
    abstract void createAnamnes(Record record);
    abstract void creaeRecordForAnalse(Record record);
    abstract void creaeRecordForManipulation(Record record);
    abstract void createNewRecord(Record record);
    abstract void cancelRecord(Record record);
}
