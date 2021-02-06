package belajar.java.oop.app;

import belajar.java.oop.data.Product;

/** Equals Method
 * di bahasa pemograman lain, untuk mengecek apakah sebuah object sama, biasanya menggunakan operator ==,..
 * ..di Java operator == hanya digunakan untuk mengecek data primitif
 * untuk non primitif/object menggunakan method equals
 * secara default, method equals akan membandingkan dua buah object secara kesamaan posisi object di memory,..
 * ..artinya jika membuat 2 object yang isi fields nya sama, tetap dianggap beda oleh method equals
 * oleh karena itu ada baiknya mengoverride method equals milik class object tersebut
 */

public class EqualsMethod {

    public static void main(String[] args) {

        String s1 = "HelloWorld";
        String s2 = "HelloWorld";
        System.out.println("Apakah sama?? " + s1 == s2); // sama dengan (("Apakah sama?? " + s1) == s2)
        System.out.println("Apakah sama?? " + (s1 == s2)); //ini artinya isi dari s2 me-refer s1
        System.out.println();

        s1 = s1 + " " + "Java";
        String s3 = "HelloWorld Java";
        System.out.println(s1 ==s3);
        System.out.println(s1.equals(s3));
        System.out.println(s2.equals(s3));
        System.out.println();

        Product product1 = new Product("Indomie", 2_500);
        System.out.println(product1);
        Product product2 = new Product("Indomie", 2_500);
        System.out.println(product2);
        System.out.println(product1.equals(product2));
    }

}
