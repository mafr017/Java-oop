/** Method Overriding
 * kemampuan mendeklarasikan ulang method di child class, yang sudah ada di class parent
 * ketika melakukan proses overriding, maka ketika membuat object dari class child, method asli..
 * ..yang ada di class parent tidak bisa diakses lagi
 */


class Manager2 {
    String name;

    void sayHello(String name) {
        System.out.println("Hello " + name + ", My name is Manager " + this.name);
    }
}

class VicePresident2 extends Manager2{

    void sayHello(String name) {
        System.out.println("Hello " + name + ", My name is Vice President " + this.name);
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        var manager = new Manager2();
        manager.name = "Aditya";
        manager.sayHello("Udin");
        
        var vp = new VicePresident2();
        vp.name = "Fathur";
        vp.sayHello("Cecep");
    }
}
