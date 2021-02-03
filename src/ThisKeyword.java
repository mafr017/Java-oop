/** This
 * keyword ini digunakan untuk mengatasi masalah variable shadowing
 */

class Person4 {
    String name = "Java";
    String address;
    final String country = "Indonesia";

    Person4(String name, String address) {
        System.out.println("Constructor-1 this.name=" + this.name + ", name=" + name);
        this.name = name;
        this.address = address;
        System.out.println("Constructor-1 this.name=" + this.name);
    }
    Person4(){
        this(null,null);    // baris kode this ini digunakan untuk memanggil constructor diatasnya/pertama
        System.out.println("Constructor tanpa parameter");
    }

    void sayHello(String paramName) {
        System.out.println("Hello " + paramName + ", my name is " + name + " from " + address + " " + country);
    }

    void sayHello() {
        this.sayHello("World!");
    }
}

public class ThisKeyword {

    public static void main(String[] args) {

        var person = new Person4("aditya", "cimahi");
        person.sayHello();
        person.sayHello("Java");

        var person1 = new Person4();
        person1.sayHello();

    }

}
