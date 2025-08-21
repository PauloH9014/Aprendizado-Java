import Example.exampleOne;
import ExampleTwo.Aluno;

import javax.print.attribute.standard.Media;

public class Main {

    static void Soma(){
        exampleOne sumValor = new exampleOne(0);
        exampleOne.InnerClass myInner = sumValor. new InnerClass(0);
        int resultSum = myInner.getSumValue();
        System.out.println("A soma dos valores informados foi: " + resultSum);
    }

//    nao esta retornando o valor da innerClass teria que aparecer o (sumValue. new Notas)
    static void alunoMedia(){
        Aluno newMedia = new Aluno(0,0);
//        Aluno.Notas myNotas = sumValue;
    }
    public static void main(String[] args) {
    Soma();
    }

}