import javax.annotation.PostConstruct;

public abstract class Transport {

    private String transportType;

    public Transport(String transportType) {
        this.transportType = transportType;
    }

    public String getTransportType() {
        return transportType;
    }

    public void setTransportType(String transportType) {
        this.transportType = transportType;
    }

    @PostConstruct
    private void init(){
        System.out.println(transportType + " готов к работе.");
    }

    @Override
    public String toString() {
        return transportType;
    }

}
