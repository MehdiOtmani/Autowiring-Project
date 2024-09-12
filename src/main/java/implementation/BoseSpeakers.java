package implementation;

import interfaces.Speakers;
import org.springframework.stereotype.Component;

@Component
public class BoseSpeakers implements Speakers {
    @Override
    public void makeSound() {
        System.out.println("Vehicule Sound By Bose Speakers");
    }

}
