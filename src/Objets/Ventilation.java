package Objets;

public class Ventilation extends Device {
    public Ventilation(String name) {
        super(name);
    }

    @Override
    void turnOn() {
        this.isOn = true;
        System.out.println("The Ventilation " + this.name + " is now on.");
    }

    @Override
    void turnOff() {
        this.isOn = false;
        System.out.println("The Ventilation " + this.name + " is now off.");
    }
}
