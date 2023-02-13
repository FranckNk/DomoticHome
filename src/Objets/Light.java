package Objets;
public class Light extends Device {
    public Light(String name) {
        super(name);
    }

    @Override
    void turnOn() {
        this.isOn = true;
        System.out.println("The light " + this.name + " is now on.");
    }

    @Override
    void turnOff() {
        this.isOn = false;
        System.out.println("The light " + this.name + " is now off.");
    }
}


