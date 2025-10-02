import List.ArrayList.Animals;
import List.ArrayList.UserArrayList;
import List.LinkedList.UserLinkedList;
import Map.HashMap.Usuarios;
import Set.HashSet.LoginUser;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public void ListUsers(){
        UserArrayList newUsers = new UserArrayList("");

        System.out.println("==============Lista de User com ArrayList===============");
        newUsers.listUser();
        System.out.println("\t=============================");

    }

    public void ListAnimals(){
        Animals newAnimal = new Animals("");

        System.out.println("==============Lista de Animal com ArrayList===============");
        newAnimal.listUser();
        System.out.println("\t=============================");
    }

    public void LinkedUser(){
        UserLinkedList newUsers = new UserLinkedList("");
        System.out.println("==============Lista de User com LinkedList===============");
        newUsers.nameLinked();
        System.out.println("\t=============================");
    }

    public void HashUsers(){
        Usuarios newUsers = new Usuarios("", 0);

        System.out.println("==============Lista de User com HashUsers===============");
        newUsers.USer();
        System.out.println("\t=============================");
    }

    public void SetLonginsUsers(){
        LoginUser newCadastros = new LoginUser("");

        System.out.println("==============Cadastro de emails com HashSet===============");
        newCadastros.Logs();
    }

    public static void main(String[] args) {
    Main newRun = new Main();
    newRun.ListUsers();
//    newRun.ListAnimals();
//    newRun.LinkedUser();
    newRun.HashUsers();
    newRun.SetLonginsUsers();
    }
}