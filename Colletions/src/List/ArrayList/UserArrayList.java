package List.ArrayList;

import java.util.ArrayList;
import java.util.List;
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
    public void listUser(){
        Scanner sc = new Scanner(System.in);

        List<String> nameUsers = new ArrayList<>();
        System.out.println("Informe seu nome");
        setName(sc.next());

        nameUsers.add(getName());
        System.out.println("Seu nome foi listado "+ nameUsers);
    }

//    sem necessidade de ser chamado

//    @Override
//    public String toString(){
//        return "O nome informado foi "+getName();
//    }

}
