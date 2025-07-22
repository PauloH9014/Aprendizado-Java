package Construtor.ParametrosTwo;

import java.util.Scanner;

public class MediaNotas {

    public Double Media(double n, double m){
        for (int i = 0; i < 3; i++) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Informe a sua nota: ");
            n = sc.nextDouble();

            m += n/3;
        }

        if (m >= 7) {
            System.out.println("Parabens sua media foi " + m);
        } else {
            System.out.println("Ops! Voce recprovou sua media foi" + m);
        }
        
        return m;
    } 
}

