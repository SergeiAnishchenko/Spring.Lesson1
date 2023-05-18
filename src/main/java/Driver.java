import org.springframework.beans.factory.annotation.Autowired;

public class Driver<T extends Transport> {

    private String name;

    private T transport;

    public Driver(String name, T transport) {
        this.name = name;
        this.transport = transport;
    }

    public Driver(String name) {
        this.name = name;
    }

    public T getTransport() {
        return transport;
    }

    public void setTransport(T transport) {
        this.transport = transport;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Водитель " + name
                + ",транспорт " + transport + ".";
    }
}
