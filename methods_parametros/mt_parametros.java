package methods_parametros;

import java.util.Scanner;

public class mt_parametros {
    
    static void checkAge(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a sua idade: ");
        int age = sc.nextInt();

        if (age >= 18){
            System.out.println("voce já é de maior");
        }else{
            System.out.println("Ops! Voce ainda é de menor");
        }
    }

    public static void main(String[] args) {
        checkAge();
    }
}
