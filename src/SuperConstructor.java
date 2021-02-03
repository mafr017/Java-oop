/** Super Constructor
 * syarat super constructor hanya bisa diakses di dalam class child constructor
 * jika class parent tidak memiliki default constructor (tidak ada parameter)..
 * ..maka class child wajib mengakses constructor class parent tersebut
 */

class Manager3 {
    String name;

//    Manager3(){       // maka class child tidak harus meng-override constructor ini
//
//    }

    Manager3(String name) {     // maka class child harus meng-override constructor ini
        this.name = name;
    }

    void sayHello(String name) {
        System.out.println("Hello " + name + ", My name is Manager " + this.name);
    }
}

class VicePresident3 extends Manager3{

    VicePresident3(String name) {
        super(name);
    }

    void sayHello(String name) {
        System.out.println("Hello " + name + ", My name is Vice President " + this.name);
    }
}

public class SuperConstructor {
    public static void main(String[] args) {

        var manager = new Manager3("Aditya");
        manager.sayHello("Udin");

        var vp = new VicePresident3("Fathur");
        vp.sayHello("Cecep");
    }
}
