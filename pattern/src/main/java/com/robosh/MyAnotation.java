package com.robosh;


import java.lang.annotation.*;


@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface MyAnotation {
    String show();
    String showSnow() default "white";
}
