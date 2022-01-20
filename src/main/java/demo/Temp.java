package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Temp {
    @Autowired
    @Qualifier("MyDoctor")
    private Staff staff;

    public void func()
    {
        staff.assist();
    }
}
