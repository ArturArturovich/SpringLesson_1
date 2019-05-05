package Lesson1HW;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("Lesson1HW")
public class AppConfig {
    @Bean(name = "vaccination")
    public IVaccination vaccination(){
        return new Vaccination();
    }

    @Bean (name = "vaccine")
    public Vaccine vaccine(IVaccination vaccination){
        HospitalImp vaccine = new HospitalImp();
        vaccine.setVaccination(vaccination);
        return vaccine;
    }
}
