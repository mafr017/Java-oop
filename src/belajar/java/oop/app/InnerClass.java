package belajar.java.oop.app;

import belajar.java.oop.data.Company;

/** Inner Class
 * membuat class di dalam class
 * salah satu kasus membuat inner class ketika butuh membuat beberapa class yang saling berhubungan,..
 * ..dimana sebuah class tidak bisa dibuat tanpa class lain
 * misal, class employee, dimana membutuhkan class company, maka bisa memebuat class employee sebagai inner class company
 * inner class dapat membaca semua private memmber yang ada di outer class nya
 * untuk dapat mangakses hal tersebut, gunakan nama class outer nya diikuti dengan kata kunci this, misal Company.this
 * untuk mengakses super outer classnya, Company.super
 */

public class InnerClass {

    public static void main(String[] args) {

        Company company = new Company();
        company.setName("MAFR");

        Company.Employee employee = company.new Employee();
        employee.setName("Aditya");

        System.out.println(company.getName());
        System.out.println("Employee=" + employee.getName() + ", Company=" + employee.getCompany());

        Company company1 = new Company();
        company1.setName("Bismillah Jadi");

        Company.Employee employee1 = company1.new Employee();
        employee1.setName("Fathur");

        System.out.println("Employee=" + employee1.getName() + ", Company=" + employee1.getCompany());

    }

}
