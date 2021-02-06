package belajar.java.oop.app;

import belajar.java.oop.data.Animal;
import belajar.java.oop.data.Cat;

/** Abstract Method
 * tidak boleh membuat block method untuk abstract method itu
 * abstract method wajib di override di class child
 * tidak boleh memiliki access modifier private
 */

public class AbstractMethod {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.name = "Ukitem";
        animal.run();
    }
}
