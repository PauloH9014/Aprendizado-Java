package Polymorphism.Example;

public class Dog extends animal{
    private String cor;

    public Dog(String raca, String cor) {
        super(raca);
        this.cor = cor;
    }

    public String getCor(){
        return this.cor;
    }

    public void setCor(String NewCor){
        this.cor = NewCor;
    }
}
