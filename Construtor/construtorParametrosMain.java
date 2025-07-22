package Construtor;

import Construtor.ParametrosOne.construtorParametrosOne;
import Construtor.ParametrosThree.construtorName;
import Construtor.ParametrosTwo.MediaNotas;

public class construtorParametrosMain {

    static void Message(int i, String name) {

        construtorName NewName = new construtorName();
        NewName.SobreMim(name, i);
    }

    static  void SomaNumero(int x, int s) {

        construtorParametrosOne NewOne = new construtorParametrosOne();
        s = NewOne.Soma(x, s);
        
        System.out.println("O resultado da soma dos valores foi " + s);
    }

    static void MediaAvaliacao(double n, double m) {

        MediaNotas NewMediaNotas = new MediaNotas();
        m = NewMediaNotas.Media(n, m);
        
        System.out.println("\nO resultado da media dos valores foi " + m);
    }


    public static void main(String[] args) {
        
        Message(0, null);
        SomaNumero(0, 0);
        MediaAvaliacao(0,0);


    }
}
