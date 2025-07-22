package Classmethods.Staticublic;

import java.util.Scanner;

public class static_or_public {

   public String MyPublicMethods(){
    Scanner sc = new Scanner(System.in);

    System.out.println("Informe seu nome: ");
    String n = sc.nextLine();

    System.out.println("Seja bem-vindo " + n);

    return n;
   }




   public Double MyNotes(){
        Scanner sc = new Scanner(System.in);
        double m = 0;

    for (int i = 0; i < 3; i++){
        System.out.println("Informe Sua nota: ");
        Double n = sc.nextDouble();
        m += n /3;
    }

        if (m >= 7.0){
            System.out.println("Parabens Voce foi aprovado");
        }else{
            System.err.println("Ops! Voce foi reprovado");
        }

        return m;

   }

    public int MySoma(){
        Scanner sc = new  Scanner(System.in);
        int s = 0;

        for (int i = 0; i < 3; i++){
            System.err.println("Digite os valor: ");
            int n = sc.nextInt();

            s += n;
        }

        System.out.println("A Soma dos valores foi " + s);
        return s;
    }   

    public void MyMenssage(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Bom dia");
        int valor = sc.nextInt();
    }


//    public static void main(String[] args) {
//     static_or_public MyObjct = new static_or_public();
//     MyObjct.MyPublicMethods();
//     MyObjct.MyNotes();
//     MyObjct.MySoma();
//     MyObjct.MyMenssage();
//    }
}
