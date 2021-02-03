/** Polymorphism
 * kemampuan sebuah object berubah bentuk menjadi bentuk lain
 */

class Employee4 {
    String name;
    String company = "PT.Sukses";
    String position = "Employee";

    Employee4(String name) {
        this.name = name;
    }

    void sayHello(String name) {
        System.out.println("Hello " + name + ", My name is " + this.position + " " + this.name + " from Company " + this.company);
    }
}

class Manager4 extends Employee4{

    Manager4(String name) {
        super(name);
        super.position = "Manager";
    }
}

class VicePresident4 extends Manager4{

    VicePresident4(String name) {
        super(name);
        super.position = "Vice President";
    }
}

public class Polymorphism {
    public static void main(String[] args) {

        Employee4 employee = new Employee4("Aditya");
        employee.sayHello("Udin");

        employee = new Manager4("Fathur");
        employee.sayHello("Udin");

        employee = new VicePresident4("Rahman");
        employee.sayHello("Udin");

        employee = new Employee4("Lily");
        employee.sayHello("Udin");

//        sayHello(new Employee4("Aditya"));
//        sayHello(new Manager4("Fathur"));
//        sayHello(new VicePresident4("Rahman"));

    }

//    static void sayHello(Employee4 employee) {
//        System.out.println("Hello " + employee.position + " " + employee.name);
//    }

}
