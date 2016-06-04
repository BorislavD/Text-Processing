import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Pattern pattern = Pattern.compile("[^_.-]\\b[a-zA-Z0-9]+[\\w\\-\\.]*[a-zA-Z0-9]+\\b@\\b[a-zA-Z]+[a-zA-Z\\.-]*[a-zA-Z]*\\b");
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            String str = matcher.group(0);
            System.out.println(str);
        }

    }
}
