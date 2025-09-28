package List.LinkedList;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class UserLinkedList implements interfaceLinkendList{
    Scanner sc = new Scanner(System.in);
    private String nameUSer;

    public UserLinkedList(String nameUSer){
        this.nameUSer = nameUSer;
    }

    public String getNameUSer(){
        return nameUSer;
    }
    public void setNameUSer(String nameUSer){
        this.nameUSer = nameUSer;
    }

    @Override
    public void nameLinked() {
        String usersList = "";
//    Lista encadeada, serve para ex: lista, fila e pilha.
//        menos utilizada casos especias como Inserção de parametros/ remoçoes de paramentros no inicio e fim.
        LinkedList<String> userLinked = new LinkedList<>();
        for(int i = 0; i < 3; i++){
            System.out.println("Informe seu nome: ");
            usersList = sc.next();

            userLinked.add(usersList);
            setNameUSer(usersList);
        }
        System.out.println("Os nomes informados foram armazenados aqui"+userLinked);
    }
}
