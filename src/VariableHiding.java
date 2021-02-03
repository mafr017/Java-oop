/** Variable Hiding
 * masalah yang terjadi ketika membuat nama field sama di class child dengan nama field di class parent
 * bukan field overriding, ketika membuat ulang nama field, melainkan variable hiding
 * untuk mengatasi variabel hiding gunakan super keyword
 */

class Parent {
    String name;

    void doIt() {
        System.out.println("Do it in parent");
    }
}

class Child extends Parent {
    String name;

    void doIt() {
        System.out.println("Do it in child");
        System.out.println("Parent name is " + super.name);
    }
}

public class VariableHiding {

    public static void main(String[] args) {

        Child child = new Child();
        child.name = "Child A";
        child.doIt();
        System.out.println(child.name);

//        Parent parent = (Parent) child;
        Parent parent = child;
//        Parent parent = new Parent();
//        parent.name = "Parent A";
        parent.doIt();
        System.out.println(parent.name);
    }

}
