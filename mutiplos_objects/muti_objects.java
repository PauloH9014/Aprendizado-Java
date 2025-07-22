package mutiplos_objects;

import java.util.Scanner;
import java.util.jar.Manifest;

public class muti_objects {


    static void nome(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual seu nome: ");
        String n = sc.nextLine();
    }

    public static void main(String[] args) {
        nome();
    }
}
