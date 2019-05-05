package Lesson1HW;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("vaccina")
public class HospitalImp implements Vaccine{

    private IVaccination vaccination;

//    public HospitalImp(){
//        this.vaccination = vaccination;
//    }

    public IVaccination getVaccination(){
        return vaccination;
    }
    @Autowired(required = false)
    @Qualifier("Appointment")
    public void setVaccination(IVaccination vaccination){
        this.vaccination = vaccination;
    }
    @Override
    public void doVaccine() {
        System.out.println("Укол");
        vaccination.processing();
    }
}
