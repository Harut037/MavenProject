package org.example.inheritance.aggregation.example_3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Car object1 = new Car("Toyota Supra",140);
        Car object2 = new Car("BMW m5 e 60",196);
        Car object3 = new Car("LADA Vesta",60);

        List<Car> cars = new ArrayList<>();
        cars.add(object1);
        cars.add(object2);
        cars.add(object3);

        SportMode sm = new SportMode();
        sm.setList(cars);
        for (Car car : sm.getList()){
            System.out.println(car.getMark() + " " + car.getSpeed());
        }


    }
}
