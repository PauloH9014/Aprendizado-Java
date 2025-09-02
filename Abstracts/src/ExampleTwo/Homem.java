package ExampleTwo;

import java.util.Scanner;

abstract class Bear{
    public abstract void manBear();

    public void Man(){
        System.out.println("Coletando dados...");
        manBear();
        System.out.println("Dados coletados com sucesso!");
    }
}


public class Homem  extends Bear{
    Scanner sc = new Scanner(System.in);
    private String corHair;

    public Homem(String corHair){
        this.corHair = corHair;
    }

    public String getCorHair(){
        return corHair;
    }

    public void setCorHair(String corHair){
        this.corHair = corHair;
    }


    @Override
    public void manBear() {
        System.out.println("Informe a cor do seu cabelo: ");
        setCorHair(sc.next());
    }

    @Override
    public String toString() {
        return "A cor do seu cabelo: " + getCorHair();
    }
}
