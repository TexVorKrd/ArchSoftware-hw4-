package Entity;

import Models.Record;

import java.util.List;

/**
 * Элементарная часть, добавить удалить, показать.
 * Хотя формирование полнценного расписания одна из сложных задач. :-)
 * та же самая (Nurse Schedule)
 *
 */
public abstract class Shedule {

    private List<Record> records;

    public Shedule() {

    }
    abstract boolean addRecord(Record record);
    abstract boolean removeRecord(Record record);
    abstract void showRecord();



}
