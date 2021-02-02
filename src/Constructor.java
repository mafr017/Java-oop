/** Constructor
 * method yang akan dipanggil saat pertama kali object dibuat
 * tidak membutuhkan kata kunci void dan tidak mengembalikan nilai
 */
class Person {
    String name;
    String address;
    final String country = "Indonesia";

    // jika menambahkan parameter, maka pertama kali dibuat objectnya harus ditambahkan nilai parameternya
    Person(String paramName, String paramAddress) {
        name = paramName;
        address = paramAddress;
        System.out.println("Constructor dibuat!");
    }

    void sayHello(String paramName) {
        System.out.println("Hello " + paramName + ", my name is " + name);
    }
}

public class Constructor {
    public static void main(String[] args) {
        var person1 = new Person("Aditya", "cimahi");
        person1.name = "M Aditya FR";
        person1.sayHello("Lily");
    }
}
