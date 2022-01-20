package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
//        Doctor doctor = new Doctor();
//        doctor.assist();
//        Nurse nurse = new Nurse();
//        nurse.assist();
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Doctor doctor = applicationContext.getBean(Doctor.class);
        Nurse nurse = applicationContext.getBean(Nurse.class);
        doctor.assist();
        nurse.assist();
    }
}
