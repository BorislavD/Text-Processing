import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = scanner.nextLine().split("\\s+");
        String str1 = arr[0];
        String str2 = arr[1];

        int sum = 0;
        int multiplication = 1;

        if (str1.length() == str2.length()) {
            for (int i = 0; i < str1.length(); i++) {
                multiplication = str1.charAt(i) * str2.charAt(i);
                sum += multiplication;
            }

        } else if (str1.length() > str2.length()) {
            for (int i = 0; i < str2.length(); i++) {
                multiplication = str1.charAt(i) * str2.charAt(i);
                sum += multiplication;
            }
            String str1LongerThanStr2 = str1.substring(str2.length());
            for (int i = 0; i < str1LongerThanStr2.length(); i++) {
                sum += str1LongerThanStr2.charAt(i);
            }

        } else if (str1.length() < str2.length()) {
            for (int i = 0; i < str1.length(); i++) {
                multiplication = str1.charAt(i) * str2.charAt(i);
                sum += multiplication;
            }

            String str2LongerThanStr1 = str2.substring(str1.length());

            for (int i = 0; i < str2LongerThanStr1.length(); i++) {
                sum += str2LongerThanStr1.charAt(i);
            }
        }

        System.out.println(sum);
    }
}
