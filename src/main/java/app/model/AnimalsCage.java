package app.model;

import org.springframework.stereotype.Component;

@Component
public class AnimalsCage {
    //  @Autowired
    //  @Qualifier("Dog")
    private Animal animal;
    //   @Autowired
    private Timer timer;

    public AnimalsCage(Animal animal, Timer timer) {
        this.animal = animal;
        this.timer = timer;
    }

    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animal.toString());
        System.out.println("At:");
        System.out.println(timer.getTime());
        System.out.println("________________________");
    }

    public Timer getTimer() {
        return timer;
    }

}
