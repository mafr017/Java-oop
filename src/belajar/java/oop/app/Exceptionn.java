package belajar.java.oop.app;

import belajar.java.oop.data.LoginRequest;
import belajar.java.oop.error.ValidationException;
import belajar.java.oop.util.ValidationUtil;

/** Exception
 * error direpresentasikan dengan istilah exception dalam bentuk class exception
 * bisa membuat class exception sendiri / menggunakan yang sudah tersedia
 * jika akan membuat exception, maka harus membuat class yang extends class throwable atau turunannya
 *
 * exception biasanya terjadi di method, ketika membuat exception di sebuah method, maka method..
 * ..tersebut harus ditandai dengan kata kunci " throws " diikuti dengan class exception nya
 * jika method tersebut bisa menimbulkan lebih dari satu jenis exception, kita bisa menambah..
 * ..lebih dari satu class exception
 * untuk membuat exception cukup menggunakan kata kunci " throw " diikuti dengan object exception nya
 */

/** Try Catch
 * saat memanggil sebuah function yang bisa menyebabkan exception, maka kita wajib menggunakan try-catch expression
 * gunanya agar bisa menangkap exception yang terjadi, karena jika tidak ditangkap, lalu terjadi exception..
 * ..maka secara otomatis program kita akan berhenti
 * di block try, kita tinggal panggil method yang bisa menyebabkan exception, dan di block catch, kita bisa..
 * ..melakukan sesuatu jika terjadi exception
 */

/** Fionally Keyword
 * block kode yang akan selalu dieksekusi baik terjadi exception maupun tidak
 */

public class Exceptionn {

    public static void main(String[] args) {

//        LoginRequest loginRequest = new LoginRequest("aditya", "rahasia");
        LoginRequest loginRequest = new LoginRequest("", null);

//        try {
//            ValidationUtil.validate(loginRequest);
//            System.out.println("Data Valid");
//        } catch (ValidationException exception) {
//            System.out.println("Data tidak valid : " + exception.getMessage());
//        } catch (NullPointerException exception){
//            System.out.println("Data null : " + exception.getMessage());
//        }

        try {
            ValidationUtil.validate(loginRequest);
            System.out.println("Data Valid");
        } catch (ValidationException | NullPointerException exception) {
            System.out.println("Data tidak valid : " + exception.getMessage());
        } finally {
            System.out.println("Baris ini akan selalu dieksekusi!");
        }

        System.out.println("baris kode ini dieksekusi");

    }

}
