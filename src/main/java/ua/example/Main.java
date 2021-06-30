package ua.example;

public class Main {
    public static void main(String[] args) {
        Animal cat = AnimalFactory.createAnimal(AnimalFactory.CAT);
        Animal dog = AnimalFactory.createAnimal(AnimalFactory.DOG);

        System.out.println(cat.getSound());
        System.out.println(dog.getSound());
    }
}
