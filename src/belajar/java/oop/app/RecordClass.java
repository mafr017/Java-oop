package belajar.java.oop.app;

import belajar.java.oop.data.LoginRequest;

/** Record Class (MASIH PREVIEW FEATURE)
 * terkadang kita membutuhkan sebuah class yang hanya berisikan data (getter, setter, equals, hashCode, & toString)
 * digunakan untuk mempermudah pembuatan jenis class tersebut
 * secara otomatis akan dibuatkan method class dan constructor tersebut
 * secara otomatis akan meng-extends class java.lang.Record,..
 * ..artinya tidak bisa extends class lain namun tetap bisa meng-implement interface
 */

public class RecordClass {

    public static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest("Adit", "rahasia");

        System.out.println(loginRequest);
        System.out.println(loginRequest.username());
        System.out.println(loginRequest.password());
        loginRequest.sayHello("Java");
        System.out.println();

        System.out.println(new LoginRequest());
        System.out.println(new LoginRequest("Aditya"));
        System.out.println(new LoginRequest("Aditya", "Secret"));
    }

}
