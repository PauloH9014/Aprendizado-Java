package Modifiers;

import Modifiers.Class.Atributis_Methods_Constructors.privateDeclaret;

public class modifiersMain {
    
    static void Declaracao(String nome, int idade){
        privateDeclaret NewDeclaret = new privateDeclaret();
        NewDeclaret.SobreMim(nome, idade);
    }

    public static void main(String[] args) {
        Declaracao("", 0);
    }
}
