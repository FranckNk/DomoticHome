package Objets;

public class SmokeDetection extends Device {
    public SmokeDetection(String name) {
        super(name);
    }

    @Override
    void turnOn() {
        this.isOn = true;
        System.out.println("The smmoke detection " + this.name + " is activated.");
    }

    @Override
    void turnOff() {
        this.isOn = false;
        System.out.println("The smoke detection " + this.name + " is now desactivated.");
    }
}
