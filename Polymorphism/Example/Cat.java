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

//        Integer.parseInt(sc.nextLine() faz o valor em formato em String, depois muda para um int or double or float etc...
        System.out.println("Informe a idade do seu cat: ");
        this.setAge(Integer.parseInt(sc.nextLine()));
    }
}
