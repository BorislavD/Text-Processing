import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UseYourChainsBuddy {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();

        Pattern pattern = Pattern.compile("<p>.*?<\\/p>");
        Matcher matcher = pattern.matcher(line);

        String result = "";
        StringBuilder sb = new StringBuilder();

        while (matcher.find()) {
            result = matcher.group(0);
            String str = result.replaceAll("<p>", "");
            str = str.replaceAll("</p>", "");
            str = str.replaceAll("[^a-z0-9\\s+]", " ");
            str = str.replaceAll("\\s+", " ");
            char[] charArray = str.toCharArray();
            for (int i = 0; i < charArray.length; i++) {
                if (charArray[i] >= 'a' && charArray[i] <= 'm') {
                    charArray[i] = (char) (charArray[i] + 13);
                } else if (charArray[i] >= 'n' && charArray[i] <= 'z') {
                    charArray[i] = (char) (charArray[i] - 13);
                }

                sb.append(charArray[i]);
            }
        }
        System.out.println(sb);
    }
}

