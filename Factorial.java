import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        int factorial = 1;
        while (n > 1) {
            factorial *= n;
            n--;
        }
//        while(true){
//            if(n > 1){
//                factorial *= n;
//                n--;
//            }
//            else{
//                break;
//            }
//        }

        System.out.println(factorial);
    }
}
