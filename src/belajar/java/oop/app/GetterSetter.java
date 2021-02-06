package belajar.java.oop.app;
/** Encapsulation
 * Encapsulation = memastikan data sensitif sebuah object tersembunyi dari akses luar
 * biasanya kita akan membuat semua field menggunakan access modifier private, sehingga tidak bisa diakses dari luar
 * agar bisa diubah, kita akan menyediakan method untuk mengubah dan mendapatkan field
 */

import belajar.java.oop.data.Category;

/** Getter & Setter
 * getter = function yang dibuat untuk mengambil data field
 * setter = function untuk mengubah data field
 *
 * Tipe Data    | Getter    | Setter
 * ------------------------------------------------
 * boolean      |isField()    |setField(boolean value)
 * primitif     |getField()   |setField(primitif value)
 * object       |getField()   |setField(object value)
 */

public class GetterSetter {
    public static void main(String[] args) {

        var category = new Category();
        category.setId("ID");
        category.setId(null);
        System.out.println(category.getId());
        category.setId("Aditya");
        System.out.println(category.getId());

        category.setExpensive(false);
        System.out.println(category.isExpensive());
        category.setExpensive(true);
        System.out.println(category.isExpensive());

    }
}
