package ExampleTwo;

import java.util.Scanner;

abstract class ExamplePerson{
    public abstract void userValue();

    public void User(){
    userValue();
    }
}




 public class Pessoa extends ExamplePerson{
    Scanner sc = new Scanner(System.in);
    private String nome;
    private int idade;
    private String sexo;

    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }
    public int  getIdade() {
        return idade;
    }
    public String getSexo() {
    return sexo;}

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public void userValue() {
        System.out.println("Informe seu Nome: ");
        setNome(sc.next());

        System.out.println("Informe seu Idade: ");
        setIdade(sc.nextInt());

        System.out.println("Informe seu Sexo: ");
        setSexo(sc.next());
    }

    @Override
    public String toString(){
        return "Prazer: " + getNome() + "\n Sua idade " + getIdade() + "\n Seu sexo " + getSexo();
    }
}
