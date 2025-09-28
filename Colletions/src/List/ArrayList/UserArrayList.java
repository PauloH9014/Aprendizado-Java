package List.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class UserArrayList implements InterfaceArrayList{
    private String name;

    public UserArrayList(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setName(String newName){
        this.name = newName;
    }

    @Override
    public void listUser() {
        Scanner sc = new Scanner(System.in);

//        muito mais utilizada em pojetos pois envolve acessar objtos por indice ou percorrer a lista inteira.

        List<String> nameUsers = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            String lisUser = "";

            System.out.println("Informe seu nome: ");
            lisUser = sc.next();

            nameUsers.add(lisUser);
            setName(lisUser);
        }
            System.out.println("Seu nome foi listado " + nameUsers);
            nameUsers.remove(2);
            System.out.println("Seu nome foi listado " + nameUsers);
        }

//    sem necessidade de ser chamado

//    @Override
//    public String toString(){
//        return "O nome informado foi "+getName();
//    }

}
