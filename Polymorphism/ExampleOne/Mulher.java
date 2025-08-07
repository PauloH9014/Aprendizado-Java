package Polymorphism.ExampleOne;

public class Mulher extends Pessoa{
    private String unha;

    public Mulher(String unha, String eyes, String hair){
        super(eyes, hair);
        this.unha = unha;
    }

    public String getUnha(){
        return this.unha;
    }

    public void setUnha(String Newunha) {
        this.unha = Newunha;
    }
}
