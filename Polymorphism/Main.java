package Polymorphism;

import Polymorphism.Example.Cat;
import Polymorphism.Example.Dog;
import Polymorphism.ExampleOne.Homem;
import Polymorphism.ExampleOne.Pessoa;

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

    static void Man(){
        Homem NewPessoa = new Homem("Alta", "Verde",  "Loiro");

        System.out.println("Seu cabelo é da cor : " + NewPessoa.getHair());
        System.out.println("Seus olhos tem a cor :  " + NewPessoa.getEyes());
        System.out.println("Sua força é: " + NewPessoa.getForca());
    }

    public static void main(String[] args) {
        Cachorro();
        Gato();
        Man();
    }
}
