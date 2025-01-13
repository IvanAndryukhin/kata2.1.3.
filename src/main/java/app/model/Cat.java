package app.model;

import org.springframework.stereotype.Component;

@Component("catBean")
public class Cat extends Animal {
    public Cat() {
        super();
    }

    public void eat() {
        System.out.println("cat eat");
    }

    @Override
    public String toString() {
        return "Im a Cat";
    }
}
