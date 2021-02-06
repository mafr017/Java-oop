package belajar.java.oop.app;

import belajar.java.oop.error.DatabaseError;

/** Error
 * jenis exception yang terakhir
 * sebuah clas yang tidak direkomendasikan untuk di try-catch
 * biasanya terjadi ketika ada masalah serius, dan sangat tidak direkomendasikan untuk di try-cath..
 * ..artinya direkomendasikan untuk mematikan aplikasi
 * misal, jika diawal aplikasi tidak bisa terkoneksi ke database, maka direkomendasikan membuat error..
 * ..exception dan menghentikan aplikasi
 */

public class Error {

    public static void main(String[] args) {

//        connectDatabsse("admin", null);
        connectDatabsse("admin", "rahasia");
        System.out.println("Sukses");
    }

    public static void connectDatabsse(String username, String password) {
        if (username == null || password == null) {
            throw new DatabaseError("Tidak bisa konek ke database");
        }
    }

}
