package methods_return;

import java.util.Scanner;

public class return_values {

    static int mt(){
        Scanner sc = new Scanner(System.in);
        int s = 0;


        for (int i = 0; i < 2; i++){
            System.out.println("Informe um valores: ");
            int x = sc.nextInt();
            s += x;
        }

        return s;
    }

    public static void main(String[] args) {
        int soma = mt();    
        System.out.println("A soma dos valores: " + soma);
    }
}
