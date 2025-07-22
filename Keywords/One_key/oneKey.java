package Keywords.One_key;

import java.util.ArrayList;
import java.util.Arrays;

public class oneKey {
    public String modelCar;
    public int  YearCar;

    static   String Carros(){
        String [] molCars = {"Bmw","Volvo"};

        ArrayList<String> cars = new ArrayList<>();
        cars.add("bmw");
        cars.add("volvo"); 
        
        System.out.println("Aqui estao os carros que estam na lista: " + Arrays.toString(molCars));

        // aqui estara adicionando novos carros a lista
        System.out.println("Modelos de carros disponiveis:");
        for(String car: cars){
            System.out.println(car);

            break;
        }
        
 
        return molCars[0];
    }

    public oneKey(String modelCar, int YearCar){
        // Scanner sc = new Scanner(System.in);
        Carros();

        // System.out.println("Digite o modelo do carro: ");
        // this.modelCar = sc.nextLine();

        // System.out.println("Informe o ano do carro:");
        // this.YearCar = sc.nextInt();

        // System.out.println("O modelo do  carro é:" + this.modelCar + " e o ano do seu carro é: " + this.YearCar);

    }
}
