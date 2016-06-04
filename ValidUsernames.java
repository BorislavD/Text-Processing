import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidUsernames {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        String[] userNames = line.split("\\s+|\\/|\\\\|\\(|\\)");

        Pattern pattern = Pattern.compile("\\b[A-Za-z][\\w]{2,25}\\b");

        ArrayList<String> validUserNames = new ArrayList<>();

        for (String userName : userNames) {
            Matcher matcher = pattern.matcher(userName);
            if (matcher.find()) {
                validUserNames.add(userName);
            }
        }

        int max = 0;

        String[] consecutiveValidUserNames = new String[2];

        for (int i = 0; i < validUserNames.size()-1; i++) {
            int current = validUserNames.get(i).length() +
                    validUserNames.get(i+1).length();
            if (current > max) {
                max = current;
                consecutiveValidUserNames[0] = validUserNames.get(i);
                consecutiveValidUserNames[1] = validUserNames.get(i+1);
            }
        }

        for (String string : consecutiveValidUserNames) {
            System.out.println(string);
        }
    }
}
