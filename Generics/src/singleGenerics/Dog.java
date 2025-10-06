package singleGenerics;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Dog<T> implements Animals{
    Scanner sc = new Scanner(System.in);
    private List<T> especies = new ArrayList<>();

// construtor vazio para que new Dog<>(); de certo para receber valores.
    public  Dog(){}

    public void addEspecie(T especie){
        especies.add(especie);
    }

    public List<T> getEspecieAnimal() {
        return especies;
    }

//    refazer a logica para chamar a especie;
    @Override
    public void SoundAnimals(Object especie) {
        Dog <String> newAnimal = new Dog<>();
        for(int i = 0; i < 3; i++){
            System.out.println("Informe a especie do animal: ");
            especie = sc.next();

            newAnimal.addEspecie((String) especie);
        }
        System.out.println("As especies informadas foram: "+ newAnimal.getEspecieAnimal());
    }
}
