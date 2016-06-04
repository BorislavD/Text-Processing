import java.util.Scanner;

public class TargetPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] dimensions = scanner.nextLine().split("\\s+");
        int rows = Integer.parseInt(dimensions[0]);
        int cols = Integer.parseInt(dimensions[1]);
        String snake = scanner.nextLine();
        String[] shotparameters = scanner.nextLine().split("\\s+");
        int impactRow = Integer.parseInt(shotparameters[0]);
        int impactColumn = Integer.parseInt(shotparameters[1]);
        int radius = Integer.parseInt(shotparameters[2]);
        int currentIndex = 0;

        char[][] matrix = new char[rows][cols];
        for (int row = matrix.length - 1; row >= 0; row--) {
            if (row % 2 == 0) {
                for (int col = matrix[0].length - 1; col >= 0; col--) {
                    if (currentIndex >= snake.length()) {
                        currentIndex = 0;
                    }
                    matrix[row][col] = snake.charAt(currentIndex);
                    currentIndex++;
                }
            } else {
                for (int col = 0; col < matrix[0].length; col++) {
                    if (currentIndex >= snake.length()) {
                        currentIndex = 0;
                    }
                    matrix[row][col] = snake.charAt(currentIndex);
                    currentIndex++;
                }
            }
        }

        //Shooting and replacing the shot area with a space
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                if (radius * radius >= Math.pow(col - impactColumn, 2) + Math.pow(row - impactRow, 2)) {
                    matrix[row][col] = ' ';
                }
            }
        }

        //Falling down
        for (int col = 0; col < matrix[0].length; col++) {
            while (true) {
                boolean hasFallen = false;
                for (int row = 1; row < matrix.length; row++) {
                    char topChar = matrix[row - 1][col];
                    char currentChar = matrix[row][col];
                    if (currentChar == ' ' && topChar != ' ') {
                        matrix[row][col] = topChar;
                        matrix[row - 1][col] = ' ';
                        hasFallen = true;
                    }
                }

                if(!hasFallen){
                    break;
                }
            }
        }


        // Print the output matrix
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                System.out.print(matrix[row][col]);
            }
            System.out.println();
        }
    }
}
