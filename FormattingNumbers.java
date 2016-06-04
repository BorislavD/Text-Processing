import java.util.Scanner;

public class FormattingNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputNumbers = scanner.nextLine().split("\\s+");
        int a = Integer.parseInt(inputNumbers[0]);
        double b = Double.parseDouble(inputNumbers[1]);
        double c = Double.parseDouble(inputNumbers[2]);

        String aConvertedToHexademical = Integer.toHexString(a).toUpperCase();
        String aConvertedToBinary = Integer.toBinaryString(a).toUpperCase();

        int aConvertedToBinaryAsInt = Integer.parseInt(aConvertedToBinary);
        String result = String.format("|%-10s|%010d|%10.2f|%-10.3f|",
                aConvertedToHexademical,
                aConvertedToBinaryAsInt,
                b,
                c);
        System.out.println(result);
    }
}
