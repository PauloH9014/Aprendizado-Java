package methods;

import java.util.Scanner;

public class myMethods {
    static void myMethod1(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe seu nome: ");
        String n = sc.nextLine();

        System.out.println("Ola como voce está " + n + "\n");
    };

    static void myMethod2(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Poderia informar sua idade: ");
        int i = sc.nextInt();

        if(i >= 18){
            System.out.println("Tudo certo, você pode curtir a festa");
        }else{
            System.out.println("Opa! Você não pode passar");
        }
    };

    static void myMethod3(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Poderia informar seu cpf: ");
        String d = sc.nextLine();

        if (d.matches("\\d{11}")){
            System.out.println("Ok... Aguarde um momento");
        } else {
            System.out.println("Ops! algo deu errado");
}

    }

    public static void main(String[] args) {
        myMethod1();
        myMethod2();
        myMethod3();
    }
};