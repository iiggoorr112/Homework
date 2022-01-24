package Homework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        @SuppressWarnings("car")
        ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
        Car car = context.getBean("bean", Car.class);
        Map<String,Integer> map = car.getCar();
        System.out.println(map);
        Person person = new Person();



    }
}
