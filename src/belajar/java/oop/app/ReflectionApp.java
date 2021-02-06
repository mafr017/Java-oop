package belajar.java.oop.app;

import belajar.java.oop.data.CreateUserRequest;
import belajar.java.oop.util.ValidationUtil;

/** Reflection
 * kemampuan melihat struktur aplikasi kita pada saat berjalan
 * biasanya sangat berguna ketika ingin membuat library ataupun framework, sehingga bisa meng-otomatisasi pekerjaan
 * untuk mengakses reflection class dari sebuah object, bisa menggunakan method getClass() atau NamaClass.class
 */

public class ReflectionApp {

    public static void main(String[] args) {

        CreateUserRequest request = new CreateUserRequest();
        request.setUsername("Aditya");
        request.setPassword("rahasia");
        request.setName("Aditya");

        ValidationUtil.validationReflection(request);

        System.out.println("Sukses");
    }

}
