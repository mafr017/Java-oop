package belajar.java.oop.app;

import belajar.java.oop.data.Bus;
import belajar.java.oop.data.Car;

/** Default Method
 * ketika menambah satu method di interface, secara otomatis semua class yang mengimplement akan..
 * ..rusak karena harus meng-override method tersebut
 * dengan menggunakan default method, kita bisa menambahkan konkrit method di interface
 */

public class DefaultMethod {
    public static void main(String[] args) {
        Car bus = new Bus();
        bus.drive();
        System.out.println(bus.getTire());
        System.out.println(bus.getBrand());
        System.out.println(bus.isMaintenace());
        System.out.println(bus.isBig());
    }
}
