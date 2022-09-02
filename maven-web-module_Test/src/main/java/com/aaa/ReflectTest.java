package com.aaa;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Author:江Sir
 * @Date:24 2022/08/24 17:08
 * @description: Exercise
 * @Version 1.0.0
 */
public class ReflectTest {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, InvocationTargetException {
        Class<?> aClass = Class.forName("com.aaa.myTest");
        Method[] methods = aClass.getMethods();
        for(Method m:methods) {
//          if (m.isAnnotationPresent(myTest.class)){
//              myTest o = (myTest) aClass.newInstance();
//              m.invoke(o);
//          }
        }
    }
}
