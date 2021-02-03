package belajar.java.oop.app;

import belajar.java.oop.data.City;
import belajar.java.oop.data.Location;

/** Abstract Class
 * class yang tidak bisa dibuat sebagai object secara langsung, hanya bisa diturunkan
 */

public class AbstractClass {
    public static void main(String[] args) {

//        var location = new Location();  //error karena location abstract class
        var city = new City();
        city.name = "Bandung";
        System.out.println(city.name);
    }
}
