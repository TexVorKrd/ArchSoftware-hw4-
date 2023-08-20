package Entity;

import Models.DoctorSpec;
import Models.PacientData;

/**
 * Десйствия пациента ограничны
 * Он может прикрепиться к поликлиники,
 * записаться на прием к специалисту или изменить дату приема,
 * посмотреть историю посещений
 * посмотреть анализы (и то непонятно зачем).
 */
public abstract class Pacient {
    private PacientData pacient;

    public Pacient(PacientData pacient) {
        this.pacient = pacient;
    }
    abstract void connecToClinick();
    abstract void createRecord(Pacient pacient, DoctorSpec spec);
    abstract void changeRecord(Pacient pacient, DoctorSpec spec);
    abstract void showHistory();
    abstract void showAnalises();


}
