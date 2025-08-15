package Polymorphism.Example;

import java.util.Scanner;

public class animal {
    Scanner sc = new Scanner(System.in);
        private String raca;

        public animal(String raca){
            this.raca = raca;
        }

        public String getRaca(){
            return this.raca;
        }

        public void setRaca(String NewRaca){
            this.raca = NewRaca;
        }

        public void soundAnimal(){
            System.out.println("A raça do animal " + this.raca);
        }

}

