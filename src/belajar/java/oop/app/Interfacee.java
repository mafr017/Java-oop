package belajar.java.oop.app;

import belajar.java.oop.data.Avanza;
import belajar.java.oop.data.Car;

/** Interface
 * sebelumnya kita tahu bahwa abstract class bisa digunakan sebagai kontrak untuk class child nya
 * sebenarnya yang lebih tepat untuk kontrak adalah Interface
 * interface mirip seperti abstract class, yang membedakan adalah di interface semua method..
 * ..otomatis abstract, tidak boleh memiliki block
 * tidak boleh memiliki field, hanya boleh memiliki constant (field yang tidak bisa diubah-ubah)
 * untuk mewariskan interface menggunakan kata kunci " implements "
 */

public class Interfacee {
    public static void main(String[] args) {

//        Car car = new Car();      // tidak bisa diinstansiasi
        Car car = new Avanza();
        System.out.println(car.getTire());
        car.drive();

    }
}
