package Polymorphism.ExampleTwo;

public class Operador extends Empresa{
    private String tarefaSubordinacao;

    public Operador(String category, String tarefaSubordinacao, double money) {
        super(category, money);
        this.tarefaSubordinacao = tarefaSubordinacao;
    }

    public String getTarefa() {
        return this.tarefaSubordinacao;
    }

    public void setTarefa(String Newtarefa){
        this.tarefaSubordinacao = Newtarefa;
    }
}
