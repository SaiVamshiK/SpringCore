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
        Staff doctor = applicationContext.getBean(Doctor.class);
        Nurse nurse = (Nurse) applicationContext.getBean("nurse");
        doctor.assist();
        nurse.assist();
        System.out.println();

        Doctor doctor1 = applicationContext.getBean(Doctor.class);
        System.out.println(doctor1.getQualification());
        // null value is the output

    }
}
