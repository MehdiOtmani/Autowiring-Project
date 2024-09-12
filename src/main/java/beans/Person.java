package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value="personBean")
public class Person {
     String name="Mehdi";
     public final Vehicule vehicule; //when variable is final we cant create setter

     public void setName(String name) {
          this.name = name;
     }

     public String getName() {
          return name;
     }

     public Vehicule getVehicule() {
          return vehicule;
     }

     @Autowired
     public Person(Vehicule vehicule){
         this.vehicule=vehicule;
     }
}
