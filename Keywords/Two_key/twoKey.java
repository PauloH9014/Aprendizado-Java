package Keywords.Two_key;

import java.util.Scanner;

public class twoKey {
    public Double NotasSchool;
    public String NameStudent;
    public double m;

    public  twoKey(String NameStudent, double NotasSchool) {
        Scanner sc = new Scanner(System.in);
        double s = 0;

        System.out.println("informe o seu nome:");
        this.NameStudent = sc.nextLine();

        for (int i = 0; i <3; i++){
            System.out.println("Informe a sua nota: ");
            this.NotasSchool = sc.nextDouble();
            s += this.NotasSchool;
        }
        //
        this.m = s/3;
        this.NameStudent = NameStudent;

        if(this.m >= 7){
            System.out.println("Parabens "+this.NameStudent +" sua media foi: " + this.m);
        }else if(this.m < 7 && this.m >= 5){
            System.out.println(this.NameStudent +" Parece que esta de recuperaçao" + this.m);
        }else{
            System.out.print("Ops! "+this.NameStudent +" reprovou, sua media foi: "+ this.m);
        }

        sc.close();
    }
}
