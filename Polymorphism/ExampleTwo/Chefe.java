package Polymorphism.ExampleTwo;

public class Chefe extends Empresa{
    private String areaEspecializacao;

    public Chefe(double money, String category, String areaEspecializacao) {
        super(category, money);
        this.areaEspecializacao = areaEspecializacao;
    }

    public String getAreaEspecializacao(){
        return areaEspecializacao;
    }

    public void setAreaEspecializacao(String NewareaEspecializacao){

        this.areaEspecializacao = NewareaEspecializacao;
    }
    public void Apresentar(){
        System.out.println("Qual seu cargo?");
        this.setCategory(sc.nextLine());

        System.out.println("Informe sua especialização: ");
        this.setAreaEspecializacao(sc.nextLine());

        System.out.println("Qual seu salario");
        this.setMoney(sc.nextDouble());
    }
}
