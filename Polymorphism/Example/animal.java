package Polymorphism.Example;

class animal {
        private String raca;

        public animal(String raca, String cor){
            this.raca = raca;
        }

        public String getRaca(){
            return this.raca;
        }

        public void setRaca(String NewRaca){
            this.raca = NewRaca;
        }

        public void soundAnimal(){
            System.out.println("A raça do animal " + raca);
        }

}
class Dog extends animal{
    private String cor;

    public Dog(String raca, String cor){
        super(raca, cor);
        this.cor = cor;
    }

    public String getCor(){
        return this.cor;
    }

    public void setCor(String NewCor){
        this.cor = NewCor;
    }
}

class Cat extends animal{
    private int age;

    public Cat(String raca, String cor){
        super(raca, cor);
        this.age = 18;
    }

    public int getAge(){
        return this.age;
    }
    public void setAge(int NewAge){
        this.age = NewAge;
    }

    public void soundAnimal(){
        System.out.println("A idade do animal " + age);
    }
}
