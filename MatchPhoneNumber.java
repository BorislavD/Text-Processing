import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchPhoneNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Pattern pattern = Pattern.compile("^\\+359(\\s|-)2\\1([0-9]{3})\\1([0-9]{4})$");

        while(!input.equals("end")){
            Matcher matcher = pattern.matcher(input);
            if(matcher.find()){
                String phoneNumber = matcher.group(0);

                System.out.println(phoneNumber);
            }

            input = scanner.nextLine();
        }
    }
}
