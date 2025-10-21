public class Vehicle {
    private String make;
    private String model;
    private int numWheels;
    private int numPassengers;
    public Vehicle() {
        this.make = "make";
        this.model = "model";
        this.numWheels = 0;
        this.numPassengers = 0;
    }
    public Vehicle(String make, String model, int numWheels, int numPassengers) {
        this.make = make;
        this.model = model;
        this.numWheels = numWheels;
        this.numPassengers = numPassengers;
    }
    public String getMake() {
        return make;
    }
    public void setMake(String make) {
        this.make = make;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getNumWheels() {
        return numWheels;
    }
    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }
    public int getNumPassengers() {
        return numPassengers;
    }
    public void setNumPassengers(int numPassengers) {
        this.numPassengers = numPassengers;
    }
    @Override
    public String toString() {
        return "Vehicle{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", numWheels=" + numWheels +
                ", numPassengers=" + numPassengers +
                '}';
    }
} // End of Vehicle Class
