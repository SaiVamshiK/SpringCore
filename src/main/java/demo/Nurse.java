package demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class Nurse implements Staff{
    public void assist()
    {
        System.out.println("Nurse is assisting");
    }
}
