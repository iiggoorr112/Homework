package Homework;

import org.springframework.stereotype.Component;

@Component
public class Person implements Driver {
    private String name;
    private Car car;

    public String getName() {
        return name;
    }

    public void setName(String name) {
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
        return "Person{" +
                "name='" + name + '\'' +
                ", car=" + car +
                '}';
    }

    @Override
    public String start() {
        return null;
    }

    @Override
    public void gas() {

    }
}
