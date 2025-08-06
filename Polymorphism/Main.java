package Polymorphism;

import Polymorphism.Example.Cat;
import Polymorphism.Example.Dog;

public class Main {

    static void Cachorro() {
        Dog NewDogs = new Dog("PitBull", "Preto");

        System.out.println("A raca do seu dog é: " + NewDogs.getRaca());
        System.out.println("A cor do seu dog é: " + NewDogs.getCor());
    }

    static void Gato() {
        Cat NewCat = new Cat("Seames", 10);

        System.out.println("A raça do seu gato é: " + NewCat.getRaca());
        System.out.println("A idade do seu gato é: " + NewCat.getAge());
    }

    public static void main(String[] args) {
        Cachorro();
        Gato();
    }
}
