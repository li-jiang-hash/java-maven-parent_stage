package com.aaa;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @Author:江Sir
 * @Date:25 2022/08/25 15:17
 * @description: Exercise
 * @Version 1.0.0
 */
public class ClassTest {
    public static void main(String[] args) throws IOException {
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();

        String s = "aaa";
        ClassLoader parent1 = systemClassLoader.getParent();
        ClassLoader parent = parent1.getParent();
        System.out.println("系统类加载器:"+systemClassLoader);
        System.out.println("平台类加载器"+parent1);
        System.out.println("启动类加载器"+parent);

        InputStream resourceAsStream = systemClassLoader.getResourceAsStream("jdbc.properties");
        Properties properties = new Properties();
        properties.load(resourceAsStream);
        System.out.println(properties);
        resourceAsStream.close();

    }
}
