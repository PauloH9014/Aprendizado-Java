package Polymorphism;

import Polymorphism.Example.Cat;
import Polymorphism.Example.Dog;
import Polymorphism.ExampleOne.Homem;
import Polymorphism.ExampleOne.Mulher;
import Polymorphism.ExampleOne.Pessoa;
import Polymorphism.ExampleTwo.Chefe;
import Polymorphism.ExampleTwo.Operador;

public class Main {

    static void Cachorro() {
        Dog NewDogs = new Dog("PitBull", "Preto");

        System.out.println("=============================================");
        System.out.println("A raca do seu dog é: " + NewDogs.getRaca());
        System.out.println("A cor do seu dog é: " + NewDogs.getCor());
        System.out.println("=============================================");
    }

    static void Gato() {
        Cat NewCat = new Cat("Seames", 10);

        System.out.println("=============================================");
        System.out.println("A raça do seu gato é: " + NewCat.getRaca());
        System.out.println("A idade do seu gato é: " + NewCat.getAge());
        System.out.println("=============================================");
    }

    static void Man(){
        Homem NewPessoa = new Homem("Alta", "Verde",  "Loiro");

        System.out.println("=============================================");
        System.out.println("Seu cabelo é da cor : " + NewPessoa.getHair());
        System.out.println("Seus olhos tem a cor :  " + NewPessoa.getEyes());
        System.out.println("Sua força é: " + NewPessoa.getForca());
        System.out.println("=============================================");
    }

    static void Girl(){
        Mulher NewPessoa1 = new Mulher("Grande", "Azul",  "Preto");

        System.out.println("=============================================");
        System.out.println("Sua unha é: " + NewPessoa1.getUnha());
        System.out.println("Seu cabelo é: " + NewPessoa1.getEyes());
        System.out.println("Seus olhos tem a cor :  " + NewPessoa1.getHair());
        System.out.println("=============================================");

    }

    static void Boss(){
        Chefe NewBoss = new Chefe(4.3993,"Chefe", "Engenheiro Civil");
        System.out.println("=============================================");
        System.out.println("Seu cargo é: " + NewBoss.getCategory());
        System.out.println("Sua especialização é: " + NewBoss.getAreaEspecializacao());
        System.out.println("Seu salario é: " + NewBoss.getMoney());
        System.out.println("==============================================");
    }

    static void Funcionario(){
        Operador NewOperador = new Operador("Asistente Administrativo",
                "Reformatar tabelas Google Sheets", 1.678);

        System.out.println("=============================================");
        System.out.println("Seu cargo é: " + NewOperador.getCategory());
        System.out.println("Tarefa atribuida" + NewOperador.getTarefa());
        System.out.println("Seu salario é: " + NewOperador.getMoney());
        System.out.println("==============================================");
    }

    public static void main(String[] args) {

        Cachorro();
        Gato();
        Man();
        Girl();
        Boss();
        Funcionario();
    }
}
