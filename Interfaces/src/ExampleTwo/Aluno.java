package ExampleTwo;

import java.util.Scanner;

public class Aluno implements exmapleTwo{
    Scanner sc = new Scanner(System.in);
    private double notasAluno;
    private String nameAluno;

    public Aluno(double notasAluno, String nameAluno){
        this.notasAluno = notasAluno;
        this.nameAluno = nameAluno;
    }

    public String getNameAluno(){
        return nameAluno;
    }

    public double getNotasAluno(){
        return notasAluno;
    }

    public void setNameAluno(String nameAluno) {
        this.nameAluno = nameAluno;
    }

    public void setNotasAluno(double notasAluno) {
        this.notasAluno = notasAluno;
    }

    @Override
    public void alunoSound() {
        System.out.println("Informe seu nome: ");
        setNameAluno(sc.next());
    }

    @Override
    public double alunoRun() {
        double mediaAluno = 0;

        for (int i = 0; i < 3; i++){
            System.out.println("informe a sua nota: ");
            setNotasAluno(sc.nextDouble());

            mediaAluno += notasAluno;
        }
        return mediaAluno;
    }

    @Override
    public String toString(){
        return "Olá "+getNameAluno()+", sua media semestral foi: "+getNotasAluno();
    }
}
