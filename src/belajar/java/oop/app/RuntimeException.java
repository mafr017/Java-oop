package belajar.java.oop.app;

import belajar.java.oop.data.LoginRequest;
import belajar.java.oop.util.ValidationUtil;

/** Runtime Exception
 * jenis exception yang tidak wajib di tangkap menggunakan try catch
 * kompiler java tidak akan protes walaupun kita tidak menggunakan try-catch ketika kita memanggil method..
 * .. yang bisa menyebabkan runtime exception
 * untuk membuat runtime exception, wajib meng-extends class RuntimeException
 * ada banyak runtime exception, seperti: NullPointerException, IllegalArgumentException, dll.
 */

public class RuntimeException {

    public static void main(String[] args) {

        LoginRequest loginRequest = new LoginRequest(null, null);
        ValidationUtil.validateRuntime(loginRequest);
        System.out.println("Sukses");

    }

}
