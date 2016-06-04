import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReplaceATag {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        StringBuilder sb = new StringBuilder();

        while(!line.equals("end")){
            sb.append(line);
            line = reader.readLine();
        }

        String result = sb.toString().replaceAll("<a", "[URL");
        result = result.replaceAll("</a>", "[/URL]");
        System.out.println(result);

    }
}
