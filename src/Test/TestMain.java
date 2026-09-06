package Test;

import Transport.Vehicle;

public class TestMain {
    public static void main(String[] args) {
        Vehicle v = new Vehicle(); 
        System.out.println(v.name + " " + v.model + " " + v.noOfWheels);
    }
}
