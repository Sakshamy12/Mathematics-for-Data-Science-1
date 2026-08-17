import java.util.Scanner;

public class MatrixDeterminant{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of matrix: ");
        int n = sc.nextInt();

        double[][] matrix = new double[n][n];

        System.out.println("Enter elements of matrix:");

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                matrix[i][j] = sc.nextDouble();
            }
        }

        double determinant = 1;

        for (int i = 0; i < n; i++){
            int pivot = i;

            for (int j = i + 1; j < n; j++){
                if (Math.abs(matrix[j][i]) > Math.abs(matrix[pivot][i])){
                    pivot = j;
                }
            }

            if (matrix[pivot][i] == 0){
                determinant = 0;
                break;
            }

            if (pivot != i){
                double[] temp = matrix[i];
                matrix[i] = matrix[pivot];
                matrix[pivot] = temp;

                determinant = -determinant;
            }

            determinant *= matrix[i][i];

            for (int j = i + 1; j < n; j++){
                double factor = matrix[j][i] / matrix[i][i];

                for (int k = i; k < n; k++){
                    matrix[j][k] -= factor * matrix[i][k];
                }
            }
        }
        System.out.println("Determinant = " + determinant);
    }
}
