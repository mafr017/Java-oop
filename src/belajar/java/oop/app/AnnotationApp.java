package belajar.java.oop.app;

import belajar.java.oop.annotation.Fancy;

/** Annotation
 * menambahkan metadata ke kode program yang kita buat
 * biasanya annotation digunakan saat ingin membuat library / framework
 * Annotation bisa diakses menggunakan Reflection
 * untuk membuat Annotation, bisa menggunakan kata kunci @interface
 * Annotation hanya bisa memiliki method dengan tipe data sederhana, dan bisa memiliki default value
 *
 * Attribute:
 * @Target  memberitahu annotation bisa digunakan dimana? Class, method, field, dll.
 * @Retention memberitahu annotation apakah disimpan di hasil kompilasi, dan apakah bisa dibaca di reflection?
 */

@Fancy(name = "AnnotationAPp", tags = {"application", "java"})
public class AnnotationApp {

    public static void main(String[] args) {
    }

}
