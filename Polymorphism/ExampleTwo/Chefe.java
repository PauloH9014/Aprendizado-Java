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
}
