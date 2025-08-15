package Polymorphism.ExampleOne;

import java.util.Scanner;

public class Pessoa {
    Scanner sc = new Scanner(System.in);
    private String eyes;
    private String hair;


    public Pessoa(String eyes, String hair){
        this.eyes = eyes;
        this.hair = hair;
    }

    public String getEyes(){
        return this.eyes;
    }

    public String getHair(){
        return this.hair;
    }

    public void setEyes(String NewEyes){
        this.eyes = NewEyes;
    }

    public void setHair(String Newhair) {
        this.hair = Newhair;
    }
}
