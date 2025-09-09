package ExampleOne;

import java.util.Scanner;

public class Dog implements exampleOne {
    Scanner sc = new Scanner(System.in);
    private String nameAnimal;
    private String localAnimal;
    
    public Dog(String nameAnimal, String localAnimal) {
        this.nameAnimal = nameAnimal;
        this.localAnimal = localAnimal;
    }

    public String getName() {
        return nameAnimal;
    }

    public String getLocalAnimal() {
        return localAnimal;
    }

    public void setName(String nameNew) {
        this.nameAnimal = nameNew;
    }
    public void setLocalAnimal(String localNew) {
        this.localAnimal = localNew;
    }
    
    @Override
    public void animalsSound() {
        System.out.println("Informe o name do animal: ");
        setName(sc.next());

    }

    @Override
    public void animalsRun() {
        System.out.println("Informe onde encontrou o animal: ");
        setLocalAnimal(sc.next());
    }

    @Override
    public String toString() {
        return "a especie do animal é " + getName() + " o lugar que foi encontrado: " + getLocalAnimal();
    }
}
