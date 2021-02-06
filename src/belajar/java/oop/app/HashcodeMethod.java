package belajar.java.oop.app;

import belajar.java.oop.data.Product;

/** Hashcode Method
 * method representasi integer object
 * sangat bermanfaat untuk membuat struktur data uniqe seperti HashMap, Set, dll.
 * karena cukup menggunakan hashCode method untuk mendapatkan identitas uniqe object kita
 * secara default akan mengembalikan nilai integer sesuai data di memory, namun kita bisa mengoverride
 /*
 /** Kotrak HashCode Method
 * tidak mudah meng-override method hashCode, karena ada kontraknya:
 * -sebanyak apapun hashCode dipanggil, untuk object yang sama, harus menghasilkan data integer yang sama
 * -jika ada 2 object yang sama jika dibandingkan menggunakan method equals, maka nilai hashCode nya..
 * ..juga harus sama
 * -tidak waib hashCode berbeda jika method equals menghasilkan false, karena memang keterbatasan jumlah..
 * ..integer sekitar 2 miliyar
 */

public class HashcodeMethod {

    public static void main(String[] args) {
        Product product1 = new Product("Indomie", 2_500);
        Product product2 = new Product("Indomie", 2_500);
        System.out.println(product1.equals(product2));
        System.out.println(product1.hashCode());
        System.out.println(product2.hashCode());
        System.out.println(product1.hashCode() == product2.hashCode());
    }

}
