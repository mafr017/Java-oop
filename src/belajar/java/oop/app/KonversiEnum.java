package belajar.java.oop.app;

import belajar.java.oop.data.Level;

public class KonversiEnum {

    public static void main(String[] args) {

        String levelName = Level.VIP.name();    //mengkonversi enum ke string
        System.out.println(levelName);

        Level level = Level.valueOf("STANDARD");    //String ke enum Level
//        Level level = Level.valueOf("Salah");       // error
        System.out.println(level);

        System.out.println();

        System.out.println("Print Level :");
//        Level[] levels = Level.values();        //mengetahui isi semua enum level dalam bentuk array
        for (var value : Level.values()) {
            System.out.println(value);
        }

    }

}
