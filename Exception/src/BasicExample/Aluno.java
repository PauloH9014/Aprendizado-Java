package BasicExample;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aluno<T> implements Alunos<T>{
    Scanner sc = new Scanner(System.in);
    private List<T> alunos = new ArrayList<>();

    public Aluno(){}

    public void AddAluno(T alunoEscola){
        this.alunos.add(alunoEscola);
    }

    public List<T> getAlunos(){
        return alunos;
    }

    @Override
    public void Aluno(T notasEstudant) {
        double notasAluno = 0.0;
        double mediaAluno = 0.0;

        try {
            Aluno<String> newAluno = new Aluno<>();
            for (int i = 0; i < 3; i++){
                System.out.println("informe a sua nota: ");
                notasAluno = sc.nextInt();
                mediaAluno += notasAluno /3;
            }

            if (mediaAluno >= 7){
                System.out.println("Aprovado! Sua media foi " + mediaAluno);
            }else{
                System.out.println("Reprovado! Sua media foi" + mediaAluno);
            }
        }catch(Exception e){
            System.out.println("Por favor, informe notas com valores validos");
            sc.next();
        }finally {
            System.out.println("\nPrograma de media finalizado.");
            sc.close();
        }
    }
}
