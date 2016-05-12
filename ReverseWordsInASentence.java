import java.util.Scanner;

public class ReverseWordsInASentence {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String userInput = console.nextLine();
        String[] arr = userInput.split("\\s+");
        StringBuilder sb  = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[arr.length - 1 - i]);
            sb.append(" ");
        }

        System.out.println(sb.toString());
    }
}
