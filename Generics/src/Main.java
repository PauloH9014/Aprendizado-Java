import singleGenerics.Dog;
public class Main {

    public void Animals(){
        Dog newAnimals = new Dog<String>();
        newAnimals.SoundAnimals("");

        System.out.println(newAnimals);
    }


    public static void main(String[] args) {
        Main runMain = new Main();
        runMain.Animals();
    }
}