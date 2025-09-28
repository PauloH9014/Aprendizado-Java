package List.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Animals implements InterfaceArrayList{
    Scanner sc = new Scanner(System.in);
    private String nameAnimals;

    public Animals(String nameAnimals){
        this.nameAnimals = nameAnimals;
    }

    public String getNameAnimals(){
        return nameAnimals;
    }

    public void setNameAnimals(String nameAnimals) {
        this.nameAnimals = nameAnimals;
    }

    @Override
    public void listUser() {
        List<String> listAnimals = new ArrayList<>();
        for(int i = 0; i < 3; i++){
            String listAnimal = "";
            System.out.println("Informe o nome do Animal: ");
            listAnimal = sc.next();

            listAnimals.add(listAnimal);
            setNameAnimals(listAnimal);
        }
        System.out.println("O nome do animal foi add na lista: "+ listAnimals);

    }
}
