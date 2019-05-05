package Lesson1HW;

import org.springframework.stereotype.Component;

//@Component("Appointment")
public class Appointment implements IVaccination {
    @Override
    public void processing() {
        System.out.println("Прививка сделана, но нужна консультация врача");
    }
}
