package reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class TestReflection {
    public static void main(String[] args) throws ClassNotFoundException {
        Person person = new Person();

        Class personClass = Person.class;
        Class personClass2 = person.getClass();
        Class personClass3 = Class.forName("reflection.Person");

//        Method[] methods = personClass.getMethods();
//        for (Method mehod: methods) {
//            System.out.println(mehod.getName() + ", " + mehod.getReturnType()
//                    + ", " + Arrays.toString(mehod.getParameterTypes()));
//        }

        // только приватные поля, ничего не выведет
//        Field[] fields = personClass.getFields();

        // показывает даже приватные поля
        Field[] fields = personClass.getDeclaredFields();
        for (Field field: fields) {
            System.out.println(field.getName() + ", " + field.getType());
        }

        Annotation[] annotations = personClass.getAnnotations();
        for (Annotation annotation : annotations) {
            if (annotation instanceof Author) {
                System.out.println("Yes");
            }
        }

    }
}
