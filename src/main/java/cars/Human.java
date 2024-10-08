package cars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("Person")
public class Human {
    String name;
    @Qualifier("ncar1")
    @Autowired
    private Car car;

    public Human(String name) {
        this.name = name;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", car=" + car +
                '}';
    }
}
