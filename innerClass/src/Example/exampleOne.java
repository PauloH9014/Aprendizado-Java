package Example;

import java.util.Scanner;

public class exampleOne {
        private int sumNumber;

        public exampleOne(int sumNumber){
            this.sumNumber = sumNumber;
        }

        public int getNumber(){
            return this.sumNumber;
        };

        public void setNumber(int NewsumNumber){
            this.sumNumber = NewsumNumber;
        }

    public class InnerClass extends exampleOne{
            Scanner sc = new Scanner(System.in);

//            nao esta utilizando o NewsumNuber, sem logica para receber o valor inserido
            public InnerClass(int NewsumNumber){
                super(NewsumNumber);
            }
                private int sumValue;


               public int getSumValue(){
                   for(int i = 0; i < 2; i++){
                       System.out.println("Informe valor para a soma: ");
                       this.setNumber(sc.nextInt());

                       sumValue += this.getNumber();
                   }
                   return sumValue;
           }
        }
    }
