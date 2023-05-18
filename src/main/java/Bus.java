import javax.annotation.PostConstruct;

public class Bus extends Transport{

    public Bus(String transportType) {
        super(transportType);
    }

    @PostConstruct
    private void init(){
        Bus bus = new Bus("Автобус");
        System.out.println(bus.getTransportType() + " готов к работе.");
    }
}
