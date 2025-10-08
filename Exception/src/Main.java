import BasicExample.Aluno;

public class Main {

    public void MediaFinalAluno(){
        Aluno newMedia = new Aluno<Double>();
        newMedia.Aluno(0.0);

        System.out.println(newMedia);
    }

    public static void main(String[] args) {
        Main newRun = new Main();

        newRun.MediaFinalAluno();
    }
}