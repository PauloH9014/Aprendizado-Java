package Class_attributes.Modify_attributes;

import java.util.Scanner;

public class modify_attributes {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        modify_attributes myObjt = new modify_attributes();
        
        System.err.println("escreva um novo valor: ");
        int y = myObjt.x + 4;

        System.out.println("O valor foi alterado para " + y);
    }
}

// feito