import ExampleOne.Cat;
import ExampleOne.Dog;
import ExampleTree.Usuario;
import ExampleTwo.Aluno;

public class Main {
    public void Dogs(){
        Dog newDog = new Dog("", "");
        newDog.animalsSound();
        newDog.animalsRun();

        System.out.println(newDog);
    }

    public void Cats(){
        Cat newCat = new Cat("", 0);
        newCat.animalsSound();
        newCat.animalsRun();

        System.out.println(newCat);
    }

    public void Alunos(){
        Aluno newAluno = new Aluno(0.0, "");
        newAluno.alunoSound();
        newAluno.alunoRun();

        System.out.println(newAluno);
    }

    public void User(){
        Usuario newUser = new Usuario("", 0);
        newUser.nameUSer();
        newUser.ageUser();

        System.out.println(newUser);
    }

     public static void main(String[] args) {
     Main newExecute = new Main();

// aqui é uma classe animal
     newExecute.Dogs();
     newExecute.Cats();

// aqui é uma classe aluno
     newExecute.Alunos();
     //    aqui é uma classe de usuario
    newExecute.User();
    }
}
