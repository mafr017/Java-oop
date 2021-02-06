package belajar.java.oop.util;

public class ProceUtil {
    public static final int PROCESSORS;

    static {
        System.out.println("Mengakses class Processor");
        PROCESSORS = Runtime.getRuntime().availableProcessors();
    }
}
