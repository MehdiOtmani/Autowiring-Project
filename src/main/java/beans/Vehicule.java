package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import services.VehiculeServices;

@Component(value = "vehiculeBean")
public class Vehicule {
    private String name="Tesla";

    public void setName(String name) {
        this.name = name;
    }

    public VehiculeServices getVehiculeServices() {
        return vehiculeServices;
    }

    private final VehiculeServices vehiculeServices;

    public String getName() {
        return name;
    }

    public VehiculeServices getVs() {
        return vehiculeServices;
    }

    @Autowired
    Vehicule(VehiculeServices vs){
        this.vehiculeServices=vs;
    }
}
