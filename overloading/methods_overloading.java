package overloading;

import java.util.Scanner;

import methods_return.return_values;

public class methods_overloading {

    static int plusMethodInt(int x, int s ){
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 2; i++){
            System.out.println("Informe valor para soma: ");
            x = sc.nextInt();

            s += x;
        };
        
        return s;
    };

    static double plusMethodDouble(double n, double m){
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 3; i++){
            System.out.println("Informe a sua nota: ");
            n = sc.nextDouble();
            
            m += n;
        }

        if (m >= 7){
            System.out.println("Aprovado sua media foi: " + m);
        }else{
            System.out.println("Reprovado sua media foi: " + m);
        };

        return m;

    };

    public static void main(String[] args) {
        int somar = plusMethodInt(0, 0);
        double media_aluno = plusMethodDouble(0, 0);

        System.out.println("int information is: " + somar);
        System.out.println("Double information is: " + media_aluno);
    }
}   
