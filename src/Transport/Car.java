package Transport;

    public class Car extends Vehicle{
        public int numberOfDoors;
        public String transmissionType;


        Car(String name, String model, int noOfWheels, int numberOfDoors, String transmissionType) {
            super(name, model, noOfWheels);
            this.numberOfDoors = numberOfDoors;
            this.transmissionType = transmissionType;
            super.startEngine();
        }

        public void startAC(){
            System.out.println("AC started of %s %s\n"+ name + model );
        }

    }
