package Classmethods;

import java.util.Scanner;

public class methods_class {

    static void  Menssage(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe seu nome: ");
        String n = sc.nextLine();
    }

    public static void main(String[] args) {
        Menssage();
    }
}
