package Class_attributes;

import java.util.Scanner;

import methods_return.return_values;

public class acessing_attributes {
        Scanner sc = new Scanner(System.in);
        int s;

        public acessing_attributes(){

        System.out.println("informe uma valor: ");
        int v1 = sc.nextInt();

        System.out.println("informe um outro valor: ");
        int v2 = sc.nextInt();

         s = v1 + v2;
        }

    public static void main(String[] args) {
        acessing_attributes myObjt = new acessing_attributes();

        System.out.println("A soma do seu valor é: " + myObjt.s);
    }
}
