package verificar;

import java.lang.classfile.instruction.SwitchCase;
import java.util.Scanner;

public class sistema_escola {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int User;
        String matricula;

        System.out.println("\n Aluno = 1\n Professor = 2\n Informe O valor do seu user (ex: 2):");
        User = sc.nextInt();

        switch(User){
            case 1:
                System.out.println("Ola querido aluno");
                break;
            case 2:
                System.out.println("Ola querido Professor");
                break;
            default:
                System.out.println("Informe uma das opçoes");
                break;
        }

        if (User == 1 || User == 2){
            System.out.println("Poderia Informar sua matricula:");
            sc.nextLine();

            matricula = sc.nextLine();

            if (matricula.length() ==8){

                int sistema;

                System.out.println("Seja bem-vindo querido aluno\n Faltas (Digite): 1\n  Notas (Digite): 2\n Informe: ");
                sistema = sc.nextInt();

                switch(sistema) {
                    case 1:
                        System.out.println("Gostaria de se informar sobre faltas?");
                        break;
                    case 2:
                        System.out.println("Gostaria de se informar sobre suas notas?");
                        break;
                    default:
                        System.out.println("Ops! Algo de errado ocorreu");
                        break;
                }

                if(sistema == 1){
                    System.out.println("Por enquanto o sistema está em ajuste: ");
                }else if(sistema == 2){

                    Double n1,n2,n3, m;

                    System.out.println("Informe suas notas:\n");

                    System.out.println("Informe sua nota: ");
                    n1 = sc.nextDouble();

                    System.out.println("Informe sua nota: ");
                    n2 = sc.nextDouble();
                    
                    System.out.println("Informe sua nota: ");
                    n3 = sc.nextDouble();

                    m = (n1 + n2 + n3)/3;

                    if(m >= 7){
                        System.out.println("Parabens você foi Aprovado");
                    }else{
                        System.out.println("Infelizmente você foi Reprovou");
                    };

                }else{
                    System.out.println("Ops! Escolha uma das opções");
                }

            // Aqui é para verificar a conta dos Professores 
            }else if(matricula.length() ==6){
                System.out.println("Seja bem-vindo querido professor");
            }else{
                System.out.println("Informe novamente");
            }

        }else{
            System.out.println("Ops! Ocorreu um erro");
        }

    }
}


// Terminar quando chegar!! verificar o professor! Só falta esse ai finaliza o sistema, vamooooooo😀