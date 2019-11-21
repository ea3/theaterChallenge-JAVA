import java.util.HashMap;
import java.util.Map;

public class MapProgram {

    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();
        languages.put("Java", "a compiled high level, object-oriented, platform independent");
        languages.put("Python", "an interpreted, object-orientated, high-level programming language with dynamic semantics");
        languages.put("Algol", "an algorithmic language");
        System.out.println(languages.put("BASIC", "Begginers all purposes symbolic instruction code"));
        System.out.println(languages.put("Lisp", "Therein lies madness"));

        if(languages.containsKey("Java")){
            System.out.println("Java is already in the map");
        }else{
            languages.put("Java", "this curse is about Java");
        }

        System.out.println("++++++++++++++++++++++++++++++++++++++++++");

        // loop though the map.
        for(String key: languages.keySet()){
            System.out.println(key + " : " + languages.get(key));

        }
        languages.remove("Python");
        System.out.println("+++++++++++++++++++++++++++++++++++");
        for(String key: languages.keySet()){
            System.out.println(key + " : " + languages.get(key));

        }



    }
}

