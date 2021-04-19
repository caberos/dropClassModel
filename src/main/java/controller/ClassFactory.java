package controller;

public class ClassFactory {
    public static ClassModel create(String name) {
        return new ClassModel(name);
    }
}
