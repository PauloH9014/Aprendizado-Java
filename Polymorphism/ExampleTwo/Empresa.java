package Polymorphism.ExampleTwo;

import java.util.Scanner;

public class Empresa{
    Scanner sc = new Scanner(System.in);
    private double money;
    private String category;

    public Empresa(String category, double money) {
        this.money = money;
        this.category = category;
    }

    public double getMoney() {
        return this.money;
    }

    public String getCategory(){
        return this.category;
    }

    public void setMoney(double Newmoney) {
        this.money = Newmoney;
    }

    public void setCategory(String Newcategory) {
        this.category = Newcategory;
    }
}
