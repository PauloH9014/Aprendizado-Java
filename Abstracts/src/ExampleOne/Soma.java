package ExampleOne;

abstract class exampleAnimals {
    public abstract void Number();

    public void Valores(){
        System.out.println("Carregando para somar Valores: ");
        Number();
    }
}

 public class Soma extends exampleAnimals {
    private int oneValue;
    private int twoValue;
    private int somaValue;

    public Soma(int oneValue, int twoValue) {
        this.oneValue = oneValue;
        this.twoValue = twoValue;
        this.somaValue = oneValue + twoValue;
    }

    public int getOneValue() {
        return this.oneValue;
    }
    public int getTwoValue() {
        return this.twoValue;
    }
    public int getSomaValue() {
        return this.somaValue;
    }
    public void setOneValue(int newOneValue) {
        this.oneValue = newOneValue;
    }
    public void setTwoValue(int newTwoValue) {
        this.twoValue = newTwoValue;
    }
    public void setSomaValue(int newSomaValue) {
        this.somaValue = newSomaValue;
    }

    @Override
    public void Number() {
        System.out.println("Valor para a soma: "+ getOneValue());
        System.out.println("Valor para a soma: "+ getTwoValue());
        System.out.println("\nA soma dos valores deu o resultado: " + getSomaValue());
    }
}
// o encapisulamento nao esta sendo usado!!