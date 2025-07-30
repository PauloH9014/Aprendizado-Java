package Example;

import java.util.Scanner;

 public class exampleOne {
    protected String name;
    protected int idade;

    public exampleOne(String name, int idade) {
        this.name = name;
        this.idade = idade;
    }

    public void persona(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe seu nome: ");
        this.name = sc.nextLine();

        System.out.println("Informe seu idade: ");
        this.idade = sc.nextInt();
    }


}
