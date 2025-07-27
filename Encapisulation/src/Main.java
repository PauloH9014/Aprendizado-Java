import Example.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static void Ususarios(String name){
        example NewUsuarios = new example();
        NewUsuarios.setUSer(name);

        System.out.println("Seja bem vindo " + NewUsuarios.getUser());
    }

    public static void main(String[] args) {
       Ususarios("Paulo");
    }
}

// fazer mais exemplos de get e set