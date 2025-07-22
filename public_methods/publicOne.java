package public_methods;

import java.util.Scanner;

public  class publicOne {
    Scanner sc = new Scanner(System.in);


    public void  FullTrottler(){
        System.out.println("Qual a aceleração total que o seu carro pode alcançar? ");
        int potencia = sc.nextInt();
    }

    public void Speed(){
        System.out.println("o seu carro pode chegar até qual velocidade?");
        int MaxSpeed = sc.nextInt();
    }

    // public void Verificando(int MaxSpeed, int potencia){
    //     FullTrottler();
    //     Speed();

    //     System.out.println("A velocidade max do seu carro é: " + MaxSpeed);
    //     System.out.println("O seu carro atualmente só chega a velocidade: " + potencia);
    // }
}
