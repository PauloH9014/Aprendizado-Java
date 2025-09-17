import ExampleOne.Cat;
import ExampleOne.Dog;

public class Main {
    public void Dogs(){
        Dog newDog = new Dog("", "");
        newDog.animalsSound();
        newDog.animalsRun();

        System.out.println(newDog);
    }

    public void Cats(){
        Cat newCat = new Cat("", 0);
        newCat.animalsSound();
        newCat.animalsRun();

        System.out.println(newCat);
    }

     public static void main(String[] args) {
     Main newExecute = new Main();

     newExecute.Dogs();
     newExecute.Cats();
    }
}

// arrumar para chamar o methods.
