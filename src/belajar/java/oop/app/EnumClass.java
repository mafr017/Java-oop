package belajar.java.oop.app;

import belajar.java.oop.data.Customer;
import belajar.java.oop.data.Level;

/** Enum Class
 * ketika membuat aplikasi, kadang akan bertemu dengan jenis-jenis data yang nilainya terbatas
 * misal: gender(M/F), tipe costumer(standard/permium/vip), dll.
 * untuk kasus itu kita bisa gunakan enum class, class yang berisikan nilai terbatas yang sudah..
 * ..ditentukan
 * saat membuat enum class, secara otomatis akan meng-extends class java.lang.Enum
 * artinya class enum tidak bisa extends class lain, namun masih tetap bisa implements interface
 */

public class EnumClass {

    public static void main(String[] args) {

        Customer customer = new Customer();
        customer.setName("Aditya");
        customer.setLevel(Level.VIP);

        System.out.println(customer.getName());
        System.out.println(customer.getLevel());

    }

}
