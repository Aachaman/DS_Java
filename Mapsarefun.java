import java.util.HashMap;

public class Mapsarefun {
    public static void main(String[] args) {
        HashMap<String,Integer> empIds = new HashMap<>();

        empIds.put("Karl", 234);
        empIds.put("Harry", 432);
        empIds.put("Raina", 675);

        System.out.println(empIds);
        System.out.println(empIds.get("Karl"));
        System.out.println(empIds.containsKey("Raina"));

    }
}
