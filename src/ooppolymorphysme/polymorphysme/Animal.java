package ooppolymorphysme.polymorphysme;

public class Animal {

    public void animalSound(){
        System.out.println("The animal makes a sound");
    }
}

class Cat extends Animal {

    public void animalSound(){
        System.out.println("The cat makes a sound meows meows");
    }
}

class Dog extends Animal {

    public void animalSound(){
        System.out.println("The Dog makes a sound bow wow");
    }
}

class MyMainClass{

    public static void main(String[] args) {
        Animal animal = new Animal();
        Cat cat = new Cat();
        Dog dog = new Dog();

        animal.animalSound();
        cat.animalSound();
        dog.animalSound();
    }
}