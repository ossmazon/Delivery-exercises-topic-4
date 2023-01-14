package demo.smart;

public class SmartWatch extends SmartDevice{

    String size;
    String autonomy;


    public SmartWatch(String wifi, String model, String bluetooth, String speaker, String hdDisplay, String color, String size, String autonomy) {
        super(wifi, model, bluetooth, speaker, hdDisplay, color);

        this.size=size;
        this. autonomy=autonomy;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "size='" + size + '\'' +
                ", autonomy='" + autonomy + '\'' +
                ", wifi='" + wifi + '\'' +
                ", model='" + model + '\'' +
                ", bluetooth='" + bluetooth + '\'' +
                ", speaker='" + speaker + '\'' +
                ", hdDisplay='" + hdDisplay + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
