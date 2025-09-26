package ExampleTree;

import java.util.Scanner;

public class Usuario implements User{
    Scanner sc = new Scanner(System.in);
    private String nome;
    private int age;

    public Usuario(String nome, int age){
        this.nome = nome;
        this.age = age;
    }

    public String getNome() {
        return nome;
    }

    public int getAge() {
        return age;
    }

    public void setNome(String newNome){
        this.nome = newNome;
    }

    public void setAge(int newAge){
        this.age = newAge;
    }

    @Override
    public void nameUSer() {
        System.out.println("Informe seu user: ");
        setNome(sc.next());

    }

    @Override
    public void ageUser(){
        System.out.println("Informe a sua idade: ");
        setAge(sc.nextInt());
    }

    @Override
    public String toString(){
        return "Ola " +getNome()+", sua idade é "+getAge();
    }
}
