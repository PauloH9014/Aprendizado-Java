package Polymorphism.Example;

public  class Cat extends animal{
    private int age;

    public Cat(String raca, int age){
        super(raca);
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int NewAge){
        this.age = NewAge;
    }

//    public void soundAnimal(){
//        System.out.println("A idade do animal " + age);
//    }
}
