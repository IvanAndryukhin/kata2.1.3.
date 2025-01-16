package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AnimalsCage {

    private final Animal animal;
    private final Timer timerBean;

    @Autowired
    public AnimalsCage(@Qualifier("dogBean") Animal animal, Timer timerBean) {
        this.animal = animal;
        this.timerBean = timerBean;
    }


    public Timer getTimer() {
        return (timerBean);
    }

    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animal.toString());
        System.out.println("At:");
        System.out.println(timerBean.getTime());
        System.out.println("________________________");
    }
}
