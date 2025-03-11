package OOPS;

public class Vehicle {
    protected int wheels;
    String type;

    int wheels() {
        return this.wheels;
    }

    Vehicle(int wheels) {
        this.wheels = wheels;
        System.out.println("Vehicle");
    }

    void Sound() {
        System.out.println("pow pow");
    }
}
