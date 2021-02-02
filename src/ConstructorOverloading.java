class Person2 {
    String name;
    String address;
    final String country = "Indonesia";

    Person2(String paramName, String paramAddress) {
        name = paramName;
        address = paramAddress;
        System.out.println("Constructor-1");
    }

    Person2(String paramName) {
//        name = paramName;
        this(paramName, null); //otomatis akan memanggil constructor-1
        System.out.println("Constructor-2");
    }

    Person2() {
//        this(null, null); //otomatis akan memanggil constructor-1
        this(null); //otomatis akan memanggil constructor-2(dimana constructor-2 memanggil constructor-1)
        System.out.println("Constructor-3");
    }

    void sayHello(String paramName) {
        System.out.println("Hello " + paramName + ", my name is " + name + " from " + address + " " + country);
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        var person1 = new Person2("MAFR", "Bandung");
        System.out.println();
        var person2 = new Person2("Aditya");
        System.out.println();
        var person3 = new Person2();
        System.out.println();

        person1.sayHello("Java");
        person2.sayHello("Kotlin");
        person3.sayHello("Python");
    }
}
