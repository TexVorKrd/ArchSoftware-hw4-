package Models;

import java.util.List;

public class DoctorData {
    PerconeData doctor;
    List<DoctorSpec> spec;

    public DoctorData(PerconeData doctor, List<DoctorSpec> spec) {
        this.doctor = doctor;
        this.spec = spec;
    }
}
