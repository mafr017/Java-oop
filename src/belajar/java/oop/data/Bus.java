package belajar.java.oop.data;

public class Bus implements Car {

    public void drive() {
        System.out.println("Bus drive");
    }

    public int getTire() {
        return 8;
    }

    public String getBrand() {
        return "HINO";
    }

    public boolean isMaintenace() {
        return true;
    }

    public boolean isBig() {
        return true;
    }
}
