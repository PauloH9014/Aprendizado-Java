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

    public void soundOperador(){
        System.out.println("Qual seu cargo? ");
        this.setCategory(sc.nextLine());

        System.out.println("Informe a sua tarefa atribuida: ");
        this.setTarefa(sc.nextLine());

//        System.out.println("Qual seu salario? ");
//        this.setMoney(sc.nextDouble());
    }
}
