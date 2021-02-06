package belajar.java.oop.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Fancy {

    String name();      //membuat attribute
//    String name() default "";      //membuat attribute

    String[] tags() default {};

}
