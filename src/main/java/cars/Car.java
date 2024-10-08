package cars;

public class Car {
    String model;
    int year;
    private Human owner;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public Human getOwner() {
        return owner;
    }

    public void setOwner(Human owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
