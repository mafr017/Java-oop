package belajar.java.oop.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Try with Resource
 * sebuah mekanisme agar kita lebih mudah menggunakan resource (yang wajib diclose) dalam block try
 * wajib menggunakan interface AutoCloseable
 */

public class TrywithResource {
    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new FileReader("README.md"))) {

            while (true) {
                String line = reader.readLine();
                if (line == null) {
                    break;
                }
                System.out.println(line);
            }

        } catch (Throwable throwable) {
            System.out.println("Error membaca fiel " + throwable.getMessage());
        }

    }
}
