package escola;

import java.util.Scanner;

public class number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Double n1, n2, n3;
        String nome;

        System.out.println("Informe seu nome: ");
        nome = sc.nextLine();

        System.out.println("Escreva a sua Primeira nota:");
        n1 = sc.nextDouble();

        System.out.println("Escreva a sua segunda nota: ");
        n2 = sc.nextDouble();


        System.out.println("Escreva a sua Terceira nota: ");
        n3 = sc.nextDouble();

        
        Double m = (n1 + n2 + n3) /3;

        if (m >= 7){
            System.out.println("Parabéns "+ nome +" Aprovado, sua media foi: " + m);
        }else if (m >= 4 && m <= 6){
            System.out.println(nome + " Tera que fazer o exame final: " + m);
        }else{
            System.out.println(nome + " infelizmente reprovou sua media foi: " + m);
        }
    }
}
