package org.example.inheritance.aggregation.example_3;

import java.util.ArrayList;
import java.util.List;

public class SportMode {

    List<Car> list = new ArrayList<>();

    public List<Car> getList() {
        return list;
    }

    public void setList(List<Car> list) {
        this.list = list;
    }

    public SportMode(){


    }
}
