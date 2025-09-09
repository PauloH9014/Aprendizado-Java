package ExampleOne;

import java.util.Scanner;

public class Cat implements exampleOne{
    Scanner sc = new Scanner(System.in);
    private String name;
    private int age;

    public  Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    @Override
    public void animalsSound() {
        System.out.println("Nome do seu gato: ");
        setName(sc.next());
    }

    @Override
    public void animalsRun() {
        System.out.println("Qual a idade do seu gato: ");
        setAge(sc.nextInt());
    }

    @Override
    public String toString() {
        return "O nome do Seu gato é " + getName() + ", a idade do seu gato é " + getAge();
    }
}