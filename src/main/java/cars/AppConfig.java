package cars;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.beans.BeanProperty;

@Configuration
public class AppConfig {
    @Bean(name = "ncar1")
    public Car car1() {
        return new Car("Auto1", 19777);
    }
    @Bean(name = "ncar2")
    public Car car2() {
        return new Car("Auto2", 777);
    }
    @Bean(name = "nowner1")
    public Human owner1() {
        return new Human("Owner1");
    }

}
