package belajar.java.oop.data;

// public abstract class Avanza implements Car{    // gunakan abstract jika tidak ingin mengimplement
public class Avanza implements Car, IsMaintenance{

    public void drive() {
        System.out.println("Avanza drive");
    }

    public int getTire() {
        return 4;
    }

    public String getBrand() {
        return "Toyota";
    }

    public boolean isMaintenace() {
        return false;
    }
}
