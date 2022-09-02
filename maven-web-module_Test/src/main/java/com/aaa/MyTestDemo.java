package com.aaa;


/**
 * @Author:江Sir
 * @Date:24 2022/08/24 17:02
 * @description: Exercise
 * @Version 1.0.0
 */


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(value = RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD,ElementType.TYPE})
public @interface MyTestDemo {
//    String name() default "niahao";

//    public static void main(String[] args) {
//    }
}
