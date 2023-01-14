package demo.smart;

public class SmartPhone  extends SmartDevice{

    String capacity;
    String brand;

    public SmartPhone(String wifi, String model, String bluetooth, String speaker, String hdDisplay, String color, String capacity,String brand) {
        super(wifi, model, bluetooth, speaker, hdDisplay, color);
        this.capacity=capacity;
        this.brand=brand;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "capacity='" + capacity + '\'' +
                ", brand='" + brand + '\'' +
                ", wifi='" + wifi + '\'' +
                ", model='" + model + '\'' +
                ", bluetooth='" + bluetooth + '\'' +
                ", speaker='" + speaker + '\'' +
                ", hdDisplay='" + hdDisplay + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
