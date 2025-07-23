package Modifiers.noModifiers.Abistract;

import java.util.Scanner;
public abstract class abistractsModifiers {
    Scanner sc = new Scanner(System.in);
    public double m = 0;
    public double nota = 0;

    public abstract void AlunoNotas();

    public void Apresentar() {
        System.out.println("Ola! seja bem-vindo " + nota + " sua média é " + m);
    }
}

class Studante extends abistractsModifiers {
    @Override
    public void AlunoNotas() {
        double soma = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("Digite a nota " + (i + 1) + ": ");
            nota = sc.nextDouble();
            soma += nota;
        }
        m = soma / 3;
        Apresentar();
        if (m >= 7) {
            System.out.println("Aprovado com média: " + m);
        } else if (m >= 5) {
            System.out.println("Recuperação com média: " + m);
        } else {
            System.out.println("Reprovado com média: " + m);
        }
    }

    public static void main(String[] args) {
        Studante aluno = new Studante();
        aluno.AlunoNotas();
    }
}

// terminar pois o resultado não está correto
// corrigir o resultado da média e o loop de notas