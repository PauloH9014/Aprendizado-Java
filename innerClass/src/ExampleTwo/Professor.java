package ExampleTwo;

import Example.exampleOne;

import java.util.Scanner;

public class Professor {
    private String disciplina;

    public Professor(String disciplina){
        this.disciplina = disciplina;
    }
    public String getDisciplina(){
        return this.disciplina;
    }
    public void setDisciplina(String newDisciplina){
        this.disciplina = newDisciplina;
    }

    public class Pos{
        Scanner sc = new Scanner(System.in);
        private String especializacaoValue;

        public Pos(String especializacaoValue){
            this.especializacaoValue = especializacaoValue;
        }
        public String getEspecializacaoValue(){
            return this.especializacaoValue;
        }
        public void setEspecializacaoValue(String newEspecializacaoValue){
            this.especializacaoValue = newEspecializacaoValue;
        }

        public String Profissao(){
            System.out.println("Informe a sua especialização: ");
            this.setEspecializacaoValue(sc.next());

            return "";
        }

    }
}
