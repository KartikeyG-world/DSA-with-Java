package Transport;

public class Vehicle {
    public String name;
    public String model;
    public int noOfWheels;


    public Vehicle() {
        this.name = "";
        this.model = "";
        this.noOfWheels = -1;
    }
    Vehicle(String name, String model, int noOfWheels) {
        this.name = name;
        this.model = model;
        this.noOfWheels = noOfWheels;
    }
    void startEngine(){
        System.out.println("Engine started of %s %s\n"+ name + model );
    }

    void stopEngine(){
        System.out.println("Engine stopped of %s %s\n"+ name + model );
    }
}
