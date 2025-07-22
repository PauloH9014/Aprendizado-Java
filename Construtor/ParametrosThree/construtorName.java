package Construtor.ParametrosThree;

import java.util.Scanner;

public class construtorName {

    public void SobreMim(String name, int i){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe seu nome ");
        name = sc.nextLine();

        System.out.println("Informe sua idade ");
        i = sc.nextInt();

        System.out.println("Ola " + name + "Parece que a sua idade " + i);
    }
}
