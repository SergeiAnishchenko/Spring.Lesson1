import javax.annotation.PostConstruct;

public class Pickup extends Transport{

    public Pickup(String transportType) {
        super(transportType);
    }

    @PostConstruct
    private void init(){
        Pickup pickup = new Pickup("Пикап");
        System.out.println(pickup.getTransportType() + " готов к работе.");
    }
}
