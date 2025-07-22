package OOP;

import java.util.Scanner;

public class class_objects {

    static void nt(){
        Scanner sc = new Scanner(System.in);
        double soma = 0;

       for(int i = 0; i < 3; i++){
        System.out.println("Informe as suas 3 nota: ");
        double n = sc.nextDouble();
        soma += n;
    }
        double m = soma/3;

       if(m >= 7){
        System.out.println("Aprovado " + m);
       }else{
        System.out.println("Reprovado " + m);
       }
    }

    public static void main(String[] args) {
        nt();
    }
}


// terminar de estudar POO