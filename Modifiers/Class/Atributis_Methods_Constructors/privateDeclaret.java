package Modifiers.Class.Atributis_Methods_Constructors;

import java.util.Scanner;

public class privateDeclaret {
    private String name;
    private int idade;

    public void SobreMim(String nome, int idade) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        this.name = sc.nextLine();
        
        System.out.println("Digite sua idade: ");
        this.idade = sc.nextInt();

        System.out.println("Ola " + this.name + "a idade informada foi: " + this.idade + "anos.");
    }
}
// fazer teste para ver os valores de name e idade