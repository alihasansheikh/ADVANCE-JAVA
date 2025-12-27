package org.example.annotations;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME) //when this annotation would initiate
@Target(ElementType.METHOD)  //on where this annotation should be applied
public @interface MyCustomAnnotation {
    int value=10;
}
