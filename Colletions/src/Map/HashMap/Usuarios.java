package Map.HashMap;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Usuarios implements Users{
    Scanner sc = new Scanner(System.in);
    private String nameUser;
    private int ageUser;

    public Usuarios(String nameUser, int ageUser){
        this.nameUser = nameUser;
        this.ageUser = ageUser;
    }

    public String getNameUser(){
        return nameUser;
    }
    public int getAgeUser(){
        return ageUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public void setAgeUser(int ageUser) {
        this.ageUser = ageUser;
    }

    @Override
    public void USer() {
        String name = "";
        int age = 0;

        Map<Integer, String> informationsUser = new HashMap<>();
        System.out.println("Informe o seu nome: ");
        name = sc.next();

        System.out.println("Informe a sua idade: ");
        age = sc.nextInt();

        informationsUser.put(age,name);

        System.out.println("O nome informado foi "+name+", a idade informada foi "+age);
    }

//    @Override
//    public String toString(){
//        return "Ola "+getNameUser()+" A sua idade é " +getAgeUser();
//    }
}
