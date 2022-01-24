package Homework;

import org.springframework.stereotype.Component;

import java.sql.SQLOutput;
import java.util.HashMap;


public class Car implements ICar{
    private final String model;
    private final int maxSpeed;

    public Car(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }
    @Override
    public String getModel() {
        return model;
    }

    @Override
    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public String start() {
    return "Машина завелась";
    }

    @Override
    public void gas(int speed) {
        if(maxSpeed > speed ){
            System.out.println("Тукущая скорость:  " + speed);
        } else {
            throw new IllegalArgumentException("Превышена максимальная скорость");
        }

    }
}
