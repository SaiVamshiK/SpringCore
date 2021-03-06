package demo;


import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component("MyDoctor")
@Scope("prototype")
public class Doctor implements Staff{
    private String qualification;
//    private Nurse nurse;

//    public Doctor(String qualification) {
//        this.qualification = qualification;
//    }

//    public Doctor(String qualification, Nurse nurse) {
//        this.qualification = qualification;
//        this.nurse = nurse;
//    }
//
//    public Nurse getNurse() {
//        return nurse;
//    }
//
//    public void setNurse(Nurse nurse) {
//        this.nurse = nurse;
//    }
//
    public String getQualification() {
        return qualification;
    }
    public void setQualification(String qualification) {
        this.qualification = qualification;
    }
    public void assist()
    {
        System.out.println("Doctor is assisting");
    }
}
