package ua.example;

public class AnimalFactory {
    public static final String CAT = "cat";
    public static final String DOG = "dog";

    public static Animal createAnimal(String kind) {
        if (CAT.equals(kind)) {
            return new Cat();
        }
        if (DOG.equals(kind)) {
            return new Dog();
        }
        throw new IllegalArgumentException();
    }
}
