package demo.smart;

public class MainTester {

    public static void main(String[] args) {

        SmartDevice device1 =new SmartPhone("Yes","2022","Yes","Yes","No","Red","250gb","Motorola");
        SmartDevice device2=new SmartWatch("Yes","2023","No","Yes","Yes","White","64gb","48hrs");

        System.out.println(device1+"\n"+device2);


    }
}

