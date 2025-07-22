package Modifiers.noModifiers;

import java.util.Scanner;

final class Person{
    protected String n;
    protected int i;

    public void SobreUser(String n, int i){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome: ");
        this.n = sc.nextLine();

        System.out.println("Digite a idade: ");
        this.i = sc.nextInt();
    }

    public static void main(String[] args) {
        Person NewPerson = new Person();
        NewPerson.SobreUser("", 0);

        System.out.println("O nome é: " + NewPerson.n + " e a idade é: " + NewPerson.i);
    }
}


// rodar