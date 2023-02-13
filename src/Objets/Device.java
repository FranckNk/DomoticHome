package Objets;

abstract class Device {
    protected String name;
    protected boolean isOn;

    public Device(String name) {
        this.name = name;
        this.isOn = false;
    }

    abstract void turnOn();
    abstract void turnOff();

    public String getName() {
        return this.name;
    }

    public boolean getIsOn() {
        return this.isOn;
    }
}

