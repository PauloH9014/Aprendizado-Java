package inicio;
import java.util.Scanner;


public class teste {
   public teste() {
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.println("Qual seu nome: ");
      String nome = sc.nextLine();

      System.out.println("Qual a sua idade: ");
      Number idade = sc.nextInt(); 


      System.out.println("Seja bem-vindo " + nome);
      System.out.println("Sua idade é: " + idade);
   }
}
