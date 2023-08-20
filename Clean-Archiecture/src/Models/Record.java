package Models;

import Entity.Doctor;
import Entity.Pacient;

import java.time.LocalDateTime;



/**
 * Запись пациэнта к врачу;
 */
public class Record {
    LocalDateTime date;
    int duration;
    Doctor doctor;
    Pacient pacient;

    public Record(LocalDateTime date, int duration, Doctor doctor, Pacient pacient) {
        this.date = date;
        this.duration = duration;
        this.doctor = doctor;
        this.pacient = pacient;
    }


}
