import FilterStreams.Animal;
import ForEachStreams.Usuarios;
import MapStreams.Profissao;

public class Main {
    public void ListUsers1(){
        Usuarios list = new Usuarios();
        list.ListaUser();
    }

    public void ListUsers2(){
        Animal list = new Animal();
        list.ListaUsuarios();
    }

    public void ListUser3(){
        Profissao lis = new Profissao();
        lis.ListaProfission();
    }

    public static void main(String[] args) {
        Main run = new Main();
        run.ListUsers1();
        run.ListUsers2();
        run.ListUser3();
    }
}