/** Type Check & Casts
 * cast bisa digunakan untuk tipe data bukan primitif (object)
 * agar aman, sebelum melakukan cast, pastikan kita melakukan check, dengan kata kunci instaceof
 * hasil instanceof adalah boolean, true jika tipe data sesuai, false jika tidak sesuai
 */

class Employee5 {
    String name;
    String company = "PT.Sukses";
//    String position = "Employee";

    Employee5(String name) {
        this.name = name;
    }

    void sayHello(String name) {
//        System.out.println("Hello " + name + ", My name is " + this.position + " " + this.name + " from Company " + this.company);
        System.out.println("Hello " + name + ", My name is " + this.name + " from Company " + this.company);
    }
}

class Manager5 extends Employee5{

    Manager5(String name) {
        super(name);
//        super.position = "Manager";
    }
}

class VicePresident5 extends Manager5{

    VicePresident5(String name) {
        super(name);
//        super.position = "Vice President";
    }
}

public class TypeCheckCasts {
    public static void main(String[] args) {

        sayHello(new Employee5("Aditya"));
        sayHello(new Manager5("Fathur"));
        sayHello(new VicePresident5("Rahman"));
        sayHello(new Employee5("Lily"));

    }

    static void sayHello(Employee5 employee) {
        if (employee instanceof VicePresident5) { // mengecek object apakah object tersebut adalah object VicePresident5
            VicePresident5 vicePresident = (VicePresident5) employee; // ini merupakan konversi object (employee -> vicepresident)
            System.out.println("Hello Vice President " + vicePresident.name);
        } else if (employee instanceof Manager5) {
            Manager5 manager = (Manager5) employee; // ini merupakan konversi object (employee -> vicepresident)
            System.out.println("Hello Manager " + manager.name);
        } else {
            System.out.println("Hello Employee " + employee.name);
        }
    }

}