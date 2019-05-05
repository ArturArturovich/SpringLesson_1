package Lesson1HW;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("vaccine")
public class Vaccination implements IVaccination{
    @Override
    public void processing() {
        System.out.println("прививка сделана");
    }
}
