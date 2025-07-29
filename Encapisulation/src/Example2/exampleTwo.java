package Example2;

import java.util.Scanner;

public class exampleTwo {
    private int idade;


    public exampleTwo(int idade) {
        this.idade = idade;
    }

    public exampleTwo() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe sua idade: ");
        this.idade = sc.nextInt();

        if(this.idade >= 18 && this.idade <= 40){
            System.out.println("Voce tem que trabalhar bastante");
        }else if (this.idade > 45) {
            System.out.println("Voce esta prestes a se aposentar");
        }else{
            System.out.println("Voce tem que ir para a escola");
        }
    }

    public int getIdade(){
        return this.idade;
    }

    public void setIdade(int newAge){
        this.idade = newAge;
    }
}
