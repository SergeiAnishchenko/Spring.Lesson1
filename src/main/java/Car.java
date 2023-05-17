import javax.annotation.PostConstruct;

public class Car extends Transport{

    public Car(String transportType) {
        super(transportType);
    }

    @PostConstruct
    private void init(){
        Car car = new Car("Автомобиль");
        System.out.println(car.getTransportType() + " готов к работе.");
    }
}
