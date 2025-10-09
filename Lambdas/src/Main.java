import SingleLambdas.Usuario;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public void LoginUser(){
        Usuario user = new Usuario(
                (log, pass) -> System.out.println("User logged: " + log + "\npassword: " + pass)
        );

        user.Log();
    }



    public static void main(String[] args) {
        Main run = new Main();
        run.LoginUser();
    }
}