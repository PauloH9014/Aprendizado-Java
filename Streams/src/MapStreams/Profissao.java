package MapStreams;

import java.util.List;

public class Profissao {
    private List<String> listProfission = List.of("Medico","Engenheiro","Gestor");

    public void ListaProfission(){
        listProfission.stream()
                .map(listProfission -> listProfission.toUpperCase())
                .forEach(System.out::println);
    }
}
