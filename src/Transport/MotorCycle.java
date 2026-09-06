package Transport;

public class MotorCycle extends Vehicle{
    public String handleBarStyle;

    public String suspensiveType;

    MotorCycle(String name, String model, int noOfWheels, String handleBarStyle, String suspensiveType) {
        super(name, model, noOfWheels);
        this.handleBarStyle = handleBarStyle;
        this.suspensiveType = suspensiveType;
        super.startEngine();
    }

    public void wheelie(){
        System.out.println("Wheelie performed by %s %s\n"+ name + model );
    }
    
}
