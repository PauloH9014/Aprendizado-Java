package scope;

import java.util.Scanner;

public class methods_scope {
    public static void main(String[] args) {
        {
            Scanner sc = new Scanner(System.in);

            System.out.println("Poderia informar o valor: ");
            int  x = sc.nextInt();

            System.out.println("O valor inserido é: " + x);
        }
    }
}
