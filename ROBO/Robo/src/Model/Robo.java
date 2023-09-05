package Model;

public class Robo {
    private String name;
    private String model;
    private String sn;
    private long ipV6;
    private long softVersion;

    public long getIpV6() {
        return ipV6;
    }

    public void setIpV6(long ipV6) {
        this.ipV6 = ipV6;
    }

    public long getSoftVersion() {
        return softVersion;
    }

    public void setSoftVersion(long softVersion) {
        this.softVersion = softVersion;
    }

    public Robo(String name, String model, String sn, String ipV6) {
        this.name = name;
        this.model = model;
        this.sn = sn;
    }
}
