package For_Each;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class para_cada_carro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // aqui eu estou declarando um arry normal, mas na função FOR eu declaro um cariavel vazia para mostra a arry de cars!

        String [] lc = {"Fox","BMW","Volvo"};

        ArrayList<String> cars = new ArrayList<>();
        cars.add("Fox");
        cars.add("BMW");
        cars.add("Volvo");

        // Aqui ele vai mostrar nomes dos carros já existentes na lista
        System.out.println("Aqui é lista de carro que já existem:\n" + Arrays.toString(lc));


        System.out.println("Digite um nome de carro novo para ser add na lista: ");
        String newCarro = sc.nextLine();

        cars.add(newCarro);

        // Cars é a onde vão ter os nomes dos carros, Car é uma arrays vazia que vai receber novos valores.
        System.out.println("Lista atualizada dos carros");
            for(String car: cars){
                System.out.println(car);
            }

        }
    }
