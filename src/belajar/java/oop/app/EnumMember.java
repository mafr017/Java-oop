package belajar.java.oop.app;

import belajar.java.oop.data.Customer;
import belajar.java.oop.data.Level;

/** Enum Members
 * sama seperti class biasanya, di class enum pun, kita bisa menambahkan members(field, method, dan constructor)
 * khusus constructor tidak bisa membuat public, karena memang tujuan enum bukan untuk di instansiasi secara bebas
 */

public class EnumMember {

    public static void main(String[] args) {

        Customer customer = new Customer();
        customer.setName("Aditya");
        customer.setLevel(Level.VIP);

        System.out.println(customer.getName());
        System.out.println(customer.getLevel());
        System.out.println(customer.getLevel().getDescription());

    }

}
