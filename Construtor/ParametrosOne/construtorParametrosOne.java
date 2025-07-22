package Construtor.ParametrosOne;

import java.util.Scanner;

public class construtorParametrosOne {
    
    public int Soma(int x, int s){
        
        for(int i = 0; i < 3; i++){
            Scanner sc = new Scanner(System.in);

            System.out.println("Informe valor para a soma: ");
            x = sc.nextInt();
            s += x;
        }
        return s;
    } 
}
