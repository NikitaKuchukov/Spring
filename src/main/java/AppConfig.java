import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name = "car")
    public Car getCarBean() {
        return new Car("BMW", "M5");
    }

    @Bean(name = "bus")
    public Bus getBusBean() {
        return new Bus("LIAZ", "3350");
    }

    @Bean(name = "truck")
    public Pickup getPickupBean() {
        return new Pickup("Ford", "F150");
    }

    @Bean(name = "driver1")
    public Driver getDriver1() {
        return new Driver("Vova", getCarBean());
    }

    @Bean(name = "driver2")
    public Driver getDriver2() {
        return new Driver("Vasya", getBusBean());
    }

    @Bean(name = "driver3")
    public Driver getDriver3() {
        return new Driver("Grisha", getPickupBean());
    }
}
