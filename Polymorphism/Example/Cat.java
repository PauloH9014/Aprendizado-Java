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
    public void soundCat(){
        System.out.println("Informe a raça do seu cat: ");
        this.setRaca(sc.nextLine());

        System.out.println("Informe o nome do seu cat: ");
        this.setAge(sc.nextInt());
    }
}
