package belajar.java.oop.data;

//public interface Car extends HasBrand {
public interface Car extends HasBrand, IsMaintenance {

//    public abstract  void drive();
    void drive();

    int getTire();

    default boolean isBig() {
        return false;
    }

}
