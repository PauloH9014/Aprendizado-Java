package singleGenerics;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// utilization of class witch interface witch generics list
public class Dog<T> implements Animals<T>{
    Scanner sc = new Scanner(System.in);
    private List<T> especies = new ArrayList<>();

// construtor vazio para que new Dog<>(); de certo para receber valores.
    public  Dog(){}

    public void addEspecie(T especie){
        especies.add(especie);
    }

//    aqui is for list form generics of variaveis.
    public List<T> getEspecieAnimal() {
        return especies;
    }

//    methods utilization of list generic
    @Override
    public void SoundAnimals(Object especie) {
        Dog <T> newAnimal = new Dog<>();
        for(int i = 0; i < 3; i++){
            System.out.println("Informe a especie do animal: ");
            especie = sc.next();

            newAnimal.addEspecie((T) especie);
        }
        System.out.println("As especies informadas foram: "+ newAnimal.getEspecieAnimal());
    }
}
