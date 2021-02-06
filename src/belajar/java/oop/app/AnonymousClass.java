package belajar.java.oop.app;

import belajar.java.oop.data.HelloWold;

/** Anonymous Class
 * kemampuan mendeklarasikan class, sekaligus meng-instasi object-nya secara langsung
 * Anonymous class sebenarnya termasuk inner class, dimana outer class nya adalah tempat dimana
 * membuat anonymous class tersebut
 * cocok ketika berhadapan dengan kasus membuat implementasi interface atau abstract class sederhana,..
 * ..tanpa harus membuat implementasi class nya
 * kekurangannya tidak bisa di-reuse
 */

public class AnonymousClass {

    public static void main(String[] args) {

//        HelloWold helloWold = new SampleHelloWorld();
        HelloWold helloWold = new HelloWold() {
            public void sayHello() {
                System.out.println("Hello");
            }

            public void sayHello(String name) {
                System.out.println("Hello " + name);
            }
        };

        helloWold.sayHello();
        helloWold.sayHello("Aditya");

    }

}
