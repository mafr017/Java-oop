/** Inheritance
 * kemampuian menurunkan sebuah class ke class lain (class parent -> child)
 * class child hanya memiliki satu class parent
 * keyword " extends " dan diikuti class parent nya
 */

class Manager {
    String name;

    void sayHello(String name) {
        System.out.println("Hello " + name + ", My name is " + this.name);
    }
}

class VicePresident extends Manager{

}

public class Inheritance {
    public static void main(String[] args) {
        var manager = new Manager();
        manager.name = "Aditya";
        manager.sayHello("Udin");

        var vicePresident = new VicePresident();
        vicePresident.name = "Fathur";
        vicePresident.sayHello("Cecep");
    }
}
