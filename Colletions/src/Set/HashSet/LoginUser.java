package Set.HashSet;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LoginUser implements Login {
    Scanner sc = new Scanner(System.in);
    private String emailUser;

    public LoginUser(String emailUser){
        this.emailUser = emailUser;
    }

    public String getEmailUser() {
        return emailUser;
    }

    public void setEmailUser(String emailUser) {
        this.emailUser = emailUser;
    }

    @Override
    public void Logs() {
        Set<String> loginEmails = new HashSet<>();
        for (int i = 0; i < 3; i++){
            String logs = "";
            System.out.println("Informe o seu email");
            logs = sc.next();

            loginEmails.add(logs);
        }
        System.out.println("Os emails cadastrados foram: \n"+loginEmails);
    }
}
