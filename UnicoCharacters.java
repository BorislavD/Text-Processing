import java.util.Scanner;

public class UnicoCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            sb.append("\\u00");
            sb.append(Integer.toHexString(ch));
        }

        System.out.println(sb.toString());
    }
}
