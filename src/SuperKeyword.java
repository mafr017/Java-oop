/** Super Keyword
 * mengakses method/field milik class parent yang sudah di override
 */

class Shape {
    int getCorner() {
        return 0;
    }
}

class Rectangel extends Shape {
    int getCorner() {
        return 4;
    }

    int getParentCorner(){
        return super.getCorner();
    }
}

public class SuperKeyword {

    public static void main(String[] args) {

        var shape = new Shape();
        System.out.println(shape.getCorner());

        var rectangle = new Rectangel();
        System.out.println(rectangle.getCorner());
        System.out.println(rectangle.getParentCorner());

    }

}
