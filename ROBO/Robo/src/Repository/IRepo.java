package Repository;

public interface IRepo {
    boolean connect();
    boolean status();
    void disconnect();
    void load();
    void update();
}
