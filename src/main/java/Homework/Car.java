package Homework;

import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
public class Car implements Driver {
    private HashMap<String,Integer>  car;

    public Car(HashMap<String, Integer> car) {
        this.car = car;
    }

    public HashMap<String, Integer> getCar() {
        return car;
    }

    public void setCar(HashMap<String, Integer> car) {
        this.car = car;
    }

    @Override
    public String start() {
    return "Машина завелась";
    }

    @Override
    public void gas() {

    }
}
