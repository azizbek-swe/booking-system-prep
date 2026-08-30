package de.tub.annotationsdemo;

import java.lang.reflect.Method;

public class Runner {

    public static void invokeAllAnnotated(Object target) throws Exception {
        for (Method m : target.getClass().getDeclaredMethods()) {
            if (m.isAnnotationPresent(LogCall.class)) {
                LogCall ann = m.getAnnotation(LogCall.class);
                System.out.println("[" + ann.value() + "] " + m.getName());
                Object result = m.invoke(target, "Ana");
                System.out.println(result);
            }
        }
    }
}
