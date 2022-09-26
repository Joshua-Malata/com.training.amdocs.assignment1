import java.util.Map;
import java.util.HashMap;
import java.util.stream.Collectors;
public class Main {
    public static void main(String[] args) {
        Map<Integer, String> hmap = new HashMap<Integer, String>();
        hmap.put(1, "Soy");
        hmap.put(2, "Billy");
        hmap.put(3, "Tomatoes");
        hmap.put(4, "Cakes");

        Map<Integer, String> result = hmap.entrySet()
                .stream()
                .filter(map -> map.getValue().toUpperCase().startsWith("S"))
                .collect(Collectors.toMap(map -> map.getKey(), map -> map.getValue()));

        System.out.println("Result: " + result);
    }
}