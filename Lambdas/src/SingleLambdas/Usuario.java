package SingleLambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Usuario{
    Scanner sc = new Scanner(System.in);
    private User user;

    public Usuario(User user){
        this.user = user;
    }

    public void Log(){
        System.out.println("Information this login: ");
        String log = sc.next();

        System.out.println("Information this password: ");
        String pass = sc.next();

        user.SoundUSer(log, pass);
        sc.close();
    }
}
