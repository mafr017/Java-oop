package belajar.java.oop.app;

//import belajar.java.oop.data.Constant;
import static belajar.java.oop.data.Constant.*;
import belajar.java.oop.data.Country;
import belajar.java.oop.util.MathUtil;
import belajar.java.oop.util.ProceUtil;

/** Static Keyword
 * dengan menggunakan kata kunci static, kita bisa mengakses tampa melalui object nya
 * static hanya bisa mengakses static
 * static hanya bisa mengakses static lainnya
 * Field / class variable, field tersebut bisa diakses langsung tanpa membuat object terlebih dahulu
 * method / class method, method tersebut bisa diakses langsung tanpa membuat object terlebih dahulu
 * block, static block akan otomatis dieksekusi ketika sebuah class di load (hanya dapat mengeksekusi static)
 * inner class, inner class tersebut bisa diakses langsung tanpa membuat object outer class terlebih dahulu..
 * ..static pada inner class menyebabkan kita tidak bisa mengakses lagi object outer class nya
 */

public class StaticKeyword {
    public static void main(String[] args) {
//        System.out.println(Constant.APPLICATION);
//        System.out.println(Constant.Version);
        System.out.println(APPLICATION);
        System.out.println(Version);

        System.out.println(MathUtil.sum(1,2,3,4,5,6,7,8,9,10));

        Country.City city = new Country.City();
        city.setName("Bandung");
        System.out.println(city.getName());

        System.out.println(ProceUtil.PROCESSORS);
    }
}
