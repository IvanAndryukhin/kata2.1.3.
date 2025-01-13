package app.model;

import org.springframework.stereotype.Component;

@Component("dogBean")
public class Dog extends Animal {
    public Dog() {
        super();
    }

    @Override
    public void eat() {
        System.out.println("Chappi");
    }
}
