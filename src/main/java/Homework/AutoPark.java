package Homework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class AutoPark {

    private Map<String,ICar> carMap;

    public AutoPark(List<ICar> carList) {
        carMap = new HashMap<>();
        for (ICar car : carList) {
            carMap.put(car.getModel(), car);
        }
    }

    public Map<String, ICar> getCarMap() {
        return carMap;
    }

    public void setCarMap(Map<String, ICar> carMap) {
        this.carMap = carMap;
    }
}
