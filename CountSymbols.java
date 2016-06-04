import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountSymbols {
    public static void main(String[] args) {
        TreeMap<Character, Integer> collection = new TreeMap<>();

        Scanner console = new Scanner(System.in);
        String userInput = console.nextLine();

        char[] ch = userInput.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            if(!collection.containsKey(ch[i])){
                collection.put(ch[i], 0);
            }

            collection.put(ch[i], collection.get(ch[i]) + 1);
        }

        for (Map.Entry<Character, Integer> entry : collection.entrySet()) {
            System.out.printf("%s: ", entry.getKey());
            System.out.printf("%d time/s\n", entry.getValue());
        }
    }
}

