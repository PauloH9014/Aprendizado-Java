import List.ArrayList.Animals;
import List.ArrayList.UserArrayList;
import List.LinkedList.UserLinkedList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public void ListUsers(){
        UserArrayList newUsers = new UserArrayList("");

        System.out.println("==============Lista de User com ArrayList===============");
        newUsers.listUser();
        System.out.println("=============================");

    }

    public void ListAnimals(){
        Animals newAnimal = new Animals("");

        System.out.println("==============Lista de Animal com ArrayList===============");
        newAnimal.listUser();
        System.out.println("=============================");
    }

    public void LinkedUser(){
        UserLinkedList newUsers = new UserLinkedList("");
        System.out.println("==============Lista de User com LinkedList===============");
        newUsers.nameLinked();
        System.out.println("=============================");
    }


    public static void main(String[] args) {
    Main newRun = new Main();
    newRun.ListUsers();
//    newRun.ListAnimals();
//    newRun.LinkedUser();
    }
}