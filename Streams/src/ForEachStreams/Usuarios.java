package ForEachStreams;

import java.util.List;

public class Usuarios {
    private List<String> listNames = List.of("Paulo", "Pedro", "William");

    public void ListaUser(){
        listNames.stream()
                .forEach(System.out::println);
    }
}
