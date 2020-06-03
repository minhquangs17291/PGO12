package PGO12;

import java.util.ArrayList;
import java.util.List;

public class Car implements Comparable<Car> {
    public String model;
    public int manufactureYear;

    @Override
    public String toString() {
        return model + "" + manufactureYear;
    }

    public Car(String model, int manufactureYear) {
        this.model = model;
        this.manufactureYear = manufactureYear;
    }


    @Override
    public int compareTo(Car car) {
        return manufactureYear - car.manufactureYear;
    }
}
