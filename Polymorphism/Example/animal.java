package Polymorphism.Example;

public class animal {
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

