package Modifiers.Class.Protects;

// aqui vai ser o exemplo de uma SubClasse que tem um atributo que sera passado para outra classe

import java.util.Scanner;


// Aqui eu estou criando uma classe base chamada Person
class Person{

  // Aqui eu estou criando atributos protegidos que podem ser acessados por subclasses
    protected String name;
    protected int idade;

    // Aqui eu estou criando um construtor que recebe o nome e a idade
    public Person(String name, int idade){
      this.name = name;
      this.idade = idade;
    }

    public void Apresentar(){
        System.out.println("Ola! seja bem-vindo " + name + "sua idade é "+ idade);
    }
}

public class Pessoa extends Person {

  // Aqui eu estou criando uma subclasse Pessoa que herda de Person
  public Pessoa(String name, int idade) {
      super(name, idade);
    }


  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite seu nome: ");
    String nome = sc.nextLine();

    System.out.println("Digite sua idade: ");
    int idade = sc.nextInt();


   Person p = new Person(nome, idade);
   p.Apresentar();
 }
}


// terminado!