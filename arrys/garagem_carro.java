package arrys;

import java.util.Scanner;

public class garagem_carro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String [] cars = {"BMW", "Ford", "Fox"};
        int [] num = {0, 1, 2};

        // metodo de add elementos dentro da arrys
        cars [2] = "GTR";

        System.out.println(cars.length);
    }
}
