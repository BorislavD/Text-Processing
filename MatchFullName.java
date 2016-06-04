import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchFullName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Pattern pattern = Pattern.compile("^([A-Z][a-z]+)\\s([A-Z][a-z]+)$");

        while(!input.equals("end")){
            Matcher matcher = pattern.matcher(input);
            if(matcher.find()){
                String firstName = matcher.group(1);
                String familyName = matcher.group(2);
                System.out.println(firstName + " " + familyName);
            }


            input = scanner.nextLine();
        }
    }
}
