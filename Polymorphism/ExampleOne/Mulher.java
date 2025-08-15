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

    public void soundGirl(){
        System.out.println("qual a cor do seu cabelo: ");
        this.setHair(sc.nextLine());

        System.out.println("qual a cor dos seus olhos: ");
        this.setEyes(sc.nextLine());

        System.out.println("qual a cor da sua unha: ");
        this.setUnha(sc.nextLine());
    }
}
