import Example.exampleOne;

public class Main {

    static void Soma(){
        exampleOne sumValor = new exampleOne(0);
        exampleOne.InnerClass myInner = sumValor. new InnerClass(0);
        int resultSum = myInner.getSumValue();
        System.out.println("A soma dos valores informados foi: " + resultSum);
    }
    public static void main(String[] args) {
    Soma();
    }
}