package ma.projects.demo;

import beans.Person;
import beans.Vehicule;
import implementation.MichelinTyres;
import implementation.SonySpeakers;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.VehiculeServices;

@SpringBootApplication
public class TestApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(ProjectConfig.class);
		Person p= context.getBean(Person.class);
		Vehicule v=context.getBean(Vehicule.class);
		System.out.println(p.getVehicule().getName());
	    v.getVehiculeServices().moveVehicule();
		v.getVehiculeServices().playMusic();
		//SpringApplication.run(TestApplication.class, args);
	}

}
