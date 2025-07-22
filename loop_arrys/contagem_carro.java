package loop_arrys;

import java.util.Scanner;

public class contagem_carro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String [] cars = {"volvo","fox","bmw","ford"};

        for(int i = 0; i < cars.length; i++){
            System.out.println(cars[i]);
        }
    }
}
