import Example.exampleOne;
import ExampleTwo.Aluno;
import ExampleTwo.Professor;

import javax.print.attribute.standard.Media;

public class Main {

    static void Soma(){
        exampleOne sumValor = new exampleOne(0);
        exampleOne.InnerClass myInner = sumValor. new InnerClass(0);
        int resultSum = myInner.getSumValue();
        System.out.println("===================Soma========================\n");
        System.out.println("A soma dos valores informados foi: " + resultSum);
        System.out.println("\n===============================================");
    }

    static void alunoMedia(){
        Aluno newMedia = new Aluno(0,0);
        Aluno.Notas myNotas = newMedia.new Notas();
        double result = myNotas.calcularMedia();
        System.out.println("====================Media Escolar=================\n");
        System.out.println("Sua media semestral foi: " +  result);
        System.out.println("\n==================================================");
    }

    static void Professor(){
        Professor newProfessor = new Professor("");
        Professor.Pos myEspecializacao = newProfessor.new Pos("");
        String profissaoProf = myEspecializacao.Profissao();
        System.out.println("====================Media Escolar=================\n");
        System.out.println("Sua media semestral foi: " +  profissaoProf);
        System.out.println("\n==================================================");
    }

    public static void main(String[] args) {
//    Soma();
    alunoMedia();
    Professor();
    }
}