import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExctractHyperlinks {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        StringBuilder sb = new StringBuilder();
        Pattern pattern = Pattern.compile("<a[^>]+href\\s*=\\s*(?:\"([^\"]*)\"|'([^']*)'|([^\\s>]*))[^>]*>");

        while (!line.equals("END")) {
            sb.append(line);
            line = reader.readLine();
        }

        Matcher matcher = pattern.matcher(sb);
        while (matcher.find()) {
            if (matcher.group(1) != null) {
                System.out.println(matcher.group(1));
            }

            if (matcher.group(2) != null) {
                System.out.println(matcher.group(2));
            }

            if (matcher.group(3) != null) {
                System.out.println(matcher.group(3));
            }
        }
    }
}
