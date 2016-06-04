import java.util.Scanner;

public class StringLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuilder sb = new StringBuilder(input);
        if(input.length() > 20){
            String str1 = input.substring(0, 20);
            System.out.println(str1);
        } else {
            for (int i = input.length(); i <20 ; i++) {
                sb.append("*");
            }
            System.out.println(sb);
        }

    }
}
