package services;

import interfaces.Speakers;
import interfaces.Tyres;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VehiculeServices {
    @Autowired
    private Speakers speakers;
    private Tyres tyres;

   public void playMusic(){
       speakers.makeSound();
   }
   public void moveVehicule(){
       tyres.rotate();
   }

   @Autowired
    public void setTyres(Tyres tyres) {
        this.tyres = tyres;
    }
}
