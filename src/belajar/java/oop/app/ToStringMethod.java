package belajar.java.oop.app;

import belajar.java.oop.data.Product;

/** ToString Method
 * method yang terdapat di class object
 * digunakan untuk mempresentasikan object dalam bentuk String
 * secara default, toString() ini akan menghasilkan: namaClass@hashcode
 * namun kita bisa mengubahnya jika kita mau, agar object yang kita buat lebih mudah dibaca
 */

public class ToStringMethod {
    public static void main(String[] args) {
        Product product = new Product("Indomie", 2_500);

        System.out.println(product.name);
        System.out.println(product.price);
        System.out.println(product.toString());
    }
}
