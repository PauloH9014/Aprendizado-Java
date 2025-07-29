import Example.example;
import Example2.exampleTwo;
import Example3.exampleTree;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static void Ususarios(String name, int Age){
        example NewUsuarios = new example();
        NewUsuarios.setUSer(name);
        NewUsuarios.setAge(Age);

        System.out.println("Seja bem vindo " + NewUsuarios.getUser());
        System.out.println("Sua idade é: " + NewUsuarios.getAge());
    }

//   nao esta retornando os valores
    static void UserAge(){
        exampleTwo NewAge = new exampleTwo();
//      NewAge.setIdade(idade);

        System.out.println(NewAge.getIdade());
    }

    static void UserNotas(){
        exampleTree NewNotas = new exampleTree(3);
        System.out.println(NewNotas.getNotas());
    }

    public static void main(String[] args) {
       Ususarios("Paulo", 29);
       UserAge();
       UserNotas();
    }
}

// fazer mais exemplos de get e set