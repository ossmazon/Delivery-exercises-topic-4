package demo.smart;

public abstract class SmartDevice {

    String wifi;
    String model;
    String bluetooth;
    String speaker;
    String hdDisplay;
    String color;

    public SmartDevice(String wifi, String model, String bluetooth, String speaker, String hdDisplay, String color) {
        this.wifi = wifi;
        this.model = model;
        this.bluetooth = bluetooth;
        this.speaker = speaker;
        this.hdDisplay = hdDisplay;
        this.color = color;
    }

    @Override
    public String toString() {
        return "SmartDevice{" +
                "wifi='" + wifi + '\'' +
                ", model='" + model + '\'' +
                ", bluetooth='" + bluetooth + '\'' +
                ", speaker='" + speaker + '\'' +
                ", hdDisplay='" + hdDisplay + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}



