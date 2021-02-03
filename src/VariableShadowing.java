/** Variable Shadowing
 * ketika membuat nama variabel dengan nama yang sama di scope yang menutupi variabel dengan..
 * ..nama yang sama di scope atasnya
 * variabel diatas scopenya tidak bisa diakses
 */

class Person3 {
    String name = "aditya";
    String address;
    final String country = "Indonesia";

    Person3(String paramName, String paramAddress) {
        name = paramName;
        address = paramAddress;
        System.out.println("Constructor-1");
    }

    Person3(String paramName) {
        this(paramName, null); //otomatis akan memanggil constructor-1
        System.out.println("Constructor-2");
    }

    Person3(){
        name = "variabel name terkena shadowing";
        System.out.println("Shadowing");
    }

    void sayHello(String paramName) {
        System.out.println("Hello " + paramName + ", my name is " + name + " from " + address + " " + country);
    }
}

public class VariableShadowing {

    public static void main(String[] args) {

        var person1 = new Person3();
        System.out.println(person1.name);

    }

}
