package reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class TestReflection2 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        Scanner scanner = new Scanner(System.in);
        // Название_класса_1 Название_класса_2 Название_метода
        Class classObject1 = Class.forName(scanner.next());
        Class classObject2 = Class.forName(scanner.next());
        String methodName = scanner.next();

        Method m = classObject1.getMethod(methodName, classObject2);
        Object o1 = classObject1.newInstance();
        Object o2 = classObject2.getConstructor(String.class).newInstance("String value");

        m.invoke(o1, o2);

        System.out.println(o1);

//        пример вводимой строки
//        reflection.Person java.lang.String setName
//        java.lang.Thread java.lang.String setName
    }
}
