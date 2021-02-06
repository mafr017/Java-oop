package belajar.java.oop.app;

/**
 * StackTraceElement Class
 * throwable memiliki method bernama getStackTrace(), dimana menghasilkan Array dari StackTraceElement object
 * StackTraceElement berisikan informasi tentang, class, file bahkan baris lokasi terjadinya error
 * Class StackTraceElement ini sangat penting untuk menulusuri lokasi kejadian error yang terjadi
 * cara paling mudah, memanggil method printStackTrace() class Throwable, untuk mem-print ke console..
 * ..detail error StackTraceElement nya
 */

public class StackTraceElementClass {

    public static void main(String[] args) {
        try {
            sampleError();
        } catch (java.lang.RuntimeException exception) {
            exception.printStackTrace();
        }

//        try {
//            String[] names = {
//                    "Aditya", "Fathur", "Rahman"
//            };
//            System.out.println(names[10]);
//        } catch (Throwable throwable) {
//            StackTraceElement[] stackTraceElements = throwable.getStackTrace();
//            throwable.printStackTrace();
//        }

        System.out.println("baris kode ini dieksekusi");
    }

    public static void sampleError() {

        try {
            String[] names = {
                    "Aditya", "Fathur", "Rahman"
            };
            System.out.println(names[10]);
        } catch (Throwable throwable) {
            throw new java.lang.RuntimeException(throwable);
        }

    }

}
