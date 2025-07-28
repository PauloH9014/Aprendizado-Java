package Example3;

import java.util.Scanner;

public class exampleTree {
    private double notas;
    private double media;

    public exampleTree() {
        this.notas = 0.0;
        this.media = 0.0;
    }

    public exampleTree(int quantidadeNotas) {
        Scanner sc = new Scanner(System.in);
        double soma = 0;

        for (int i = 0; i < quantidadeNotas; i++) {

            System.out.println("informe sua nota: ");
            this.notas = sc.nextDouble();

            soma += this.notas;
        }
        this.media = (soma / quantidadeNotas);

        if(this.media >= 8){
            System.out.println("Parabens voce passou, sua media foi: " + this.media);
        } else if (this.media >= 5 && this.media < 6) {
            System.out.println("Hmmm, voce esta de recuperaçao , sua media foi: " + this.media);
        }else{
            System.out.println("Pena sua nota foi: " + this.media);
        }
    }
    public double getNotas() {
        return this.media;
    }

    public void setNotas(double NewMedia) {
        this.media = NewMedia;
    }
}
