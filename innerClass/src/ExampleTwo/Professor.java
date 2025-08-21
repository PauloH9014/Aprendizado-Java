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
}
