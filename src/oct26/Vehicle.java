package oct26;

public class Vehicle {

    int fuelCap;

    public Vehicle(int fuelCap) {
        this.fuelCap = fuelCap;
    }

    public void displayVehicleDetails(){
        System.out.println("Fuel Capacity for Vehicle "+ fuelCap);
    }

}

/*

Vehicle
  |
Car  , car


 */