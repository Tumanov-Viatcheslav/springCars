package cars;

public class Human {
    String name;
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
