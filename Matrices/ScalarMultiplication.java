import java.util.Scanner;

public class ScalarMultiplication{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int columns = sc.nextInt();

        int[][] matrix = new int[rows][columns];

        System.out.print("Enter scalar: ");
        int scalar = sc.nextInt();

        System.out.println("Enter elements of matrix:");

        for (int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){
                matrix[i][j] = matrix[i][j] * scalar;
            }
        }

        System.out.println("Resultant Matrix:");

        for (int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
