import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by jamesyburr on 5/18/16.
 */
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
        //using generics to cast the type
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        String name = (String) names.get(0);
        //must use class type of int (Integer), no need to cast if generics used
        HashMap<String, Integer> scores = new HashMap<>();
        scores.put("Alice", 10);
        scores.put("Bob", 7);
        scores.put("Charlie", 3);

        int score = (int) scores.get("Bob");
    }
}

