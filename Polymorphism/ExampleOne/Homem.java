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

    public void soundMan(){
        System.out.println("qual a cor do seu cabelo: ");
        this.setHair(sc.nextLine());

        System.out.println("qual a cor dos seus olhos: ");
        this.setEyes(sc.nextLine());

        System.out.println("informe porcentagem da forca: ");
        this.setForca(sc.nextLine());
    }
}
