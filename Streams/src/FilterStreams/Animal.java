package FilterStreams;

import java.util.List;

public class Animal {
    private List<String> list =  List.of("Dog","cat","fish","monkey");

//    ira trazer apenas 2
    public void ListaUsuarios(){
        list.stream()
                .filter(list -> list.length() > 3)
                .forEach(System.out::println);
    }

}
