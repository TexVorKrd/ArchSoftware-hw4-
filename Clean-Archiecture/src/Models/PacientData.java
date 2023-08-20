package Models;

public class PacientData {
    PerconeData patient;
    int OMS;
    int DMS;

    public PacientData(PerconeData patient, int OMS, int DMS) {
        this.patient = patient;
        this.OMS = OMS;
        this.DMS = DMS;
    }
}
