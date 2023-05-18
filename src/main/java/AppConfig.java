import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {


    @Bean(name = "Car")
    @Scope("prototype")
    public Car getCarBean() {
        return new Car("Автомобиль");
    }

    @Bean(name = "Bus")
    @Scope("prototype")
    public Bus getBusBean() {
        return new Bus("Автобус");
    }

    @Bean(name = "Pickup")
    @Scope("prototype")
    public Pickup getPickupBean() {
        return new Pickup("Пикап");
    }

    @Bean(name = "driver1")
    public Driver<Car> getDriver1() {
        return new Driver<>("Илья", getCarBean());
    }

    @Bean(name = "driver2")
    public Driver<Bus> getDriver2() {
        return new Driver<>("Фёдор", getBusBean());
    }

    @Bean(name = "driver3")
    public Driver<Pickup> getDriver3() {
        return new Driver<>("Алексей", getPickupBean());
    }


}
