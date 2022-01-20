package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
//        Doctor doctor = new Doctor();
//        doctor.assist();
//        Nurse nurse = new Nurse();
//        nurse.assist();
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanConfig.class);
        Doctor doctor = applicationContext.getBean(Doctor.class);
        Nurse nurse = (Nurse) applicationContext.getBean("nurse");
        doctor.assist();
        doctor.setQualification("MBBS");
        nurse.assist();
        System.out.println();

        Doctor doctor1 = applicationContext.getBean(Doctor.class);
        System.out.println(doctor1.getQualification());
        // MBBS value is the output
        //System.out.println(doctor1.getNurse());
        // actual object is the output

    }
}
