package Polymorphism.ExampleOne;

public class Homem extends Pessoa{
    private String forca;

    public Homem(String forca, String eyes, String hair) {
        super(eyes, hair);
        this.forca = forca;
    }

    public String getForca(){
        return this.forca;
    }

    public void setForca(String Newforca){
        this.forca = Newforca;
    }
}
