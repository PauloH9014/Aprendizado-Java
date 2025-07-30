package Inheritance.src;

import Example.exampleOne;

public class Main extends exampleOne{

    public Main(String name, int idade) {
        super(name, idade);
    }

        static void showPerson(){
            Main p = new Main("", 0);
            p.persona();

            System.out.println("seja  bem vindo "  + p.name + " Sua idade é " + p.idade);
        }
        public static void main(String[]args){
        showPerson();
        }
}
