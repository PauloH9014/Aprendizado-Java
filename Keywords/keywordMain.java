package Keywords;

import Keywords.One_key.oneKey;
import Keywords.Two_key.twoKey;

public class keywordMain {

    // static void Valores(int x) {
    // exampleKey NewExample = new exampleKey(x);

    // System.out.println("value of x is " + NewExample.x);
    // }

    static void Car(String modelCar, int YearCar) {
        oneKey NewCar = new oneKey(modelCar, YearCar);

        System.out.println("O valor do modelo do carro é: " + NewCar.modelCar + "e o ano do carro é:" + NewCar.YearCar);
    }

    static void Aluno(String NameStudant, double NotasSchool) {
        twoKey NewTwoKey = new twoKey(NameStudant, NotasSchool);

        System.out.println("O nome do aluno é:" + NewTwoKey.NameStudent + "e a nota é: " + NewTwoKey.NotasSchool);
    }

    public static void main(String[] args) {
        // Valores(0);
        Aluno("", 0);
        Car("", 0);
    }
}
