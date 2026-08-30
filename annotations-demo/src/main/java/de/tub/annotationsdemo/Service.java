package de.tub.annotationsdemo;

public class Service {

    @LogCall("greeting sent")
    public String greet(String name) {
        return "Hello, " + name;
    }

    public String farewell(String name) {   // keine Annotation
        return "Bye, " + name;
    }
}
