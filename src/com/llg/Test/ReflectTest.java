package com.llg.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectTest {

    public static void main(String[] args) {
        try {
            Class<?> demoClazz = Demo.class;
            Constructor<?> constructor = demoClazz.getConstructor(int.class, int.class);

            Object object = constructor.newInstance(2, 3);


            Field a = demoClazz.getDeclaredField("a");
            Field b = demoClazz.getDeclaredField("b");
            a.setAccessible(true);
            b.setAccessible(true);

            Method method = demoClazz.getDeclaredMethod("mul");
            method.setAccessible(true);
            Object ret = method.invoke(object);
            System.out.println(ret + "");
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }


}

