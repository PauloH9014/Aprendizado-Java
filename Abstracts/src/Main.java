import ExampleOne.Soma;
import ExampleTwo.Homem;
import ExampleTwo.Pessoa;

public class Main {

//    mesmo setando os valores, o newSoma = 0; entao o resultado sera 0
    static void Sum(){
        Soma newSoma = new Soma(3,6);
        newSoma.Valores();
        newSoma.setTwoValue(5);
        newSoma.setOneValue(6);
        newSoma.setSomaValue(newSoma.getOneValue() + newSoma.getTwoValue());
        newSoma.Valores();

    }


    static void Personas(){
        Pessoa newPerson = new Pessoa("", 0,"");
        newPerson.userValue();
        System.out.println("\n" + newPerson);
    }

    static void Man(){
        Homem newBear = new Homem("");
        newBear.manBear();
        System.out.println("\n" + newBear);
    }
//    }
    public static void main(String[] args){
//    Sum();
    Personas();
    Man();
    }
}