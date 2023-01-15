import java.util.Scanner;

public class ex_6_6 {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the Matrix size :");
        int matrix_size_row = keyboard.nextInt();
        int matrix_size_col = keyboard.nextInt();

        int[][] mat_A = new int[matrix_size_row][matrix_size_col];
        int[][] mat_B = new int[matrix_size_row][matrix_size_col];
        int[][] mat_sum = new int[matrix_size_row][matrix_size_col];

        System.out.println("Enter the Matrix A");
        for(int i = 0;i<matrix_size_row;i++){
            for(int j = 0;j<matrix_size_col;j++){
                mat_A[i][j] = keyboard.nextInt();
            }
        }
        System.out.println("Enter the Matrix B");
        
        for(int i = 0;i<matrix_size_row;i++){
            for(int j = 0;j<matrix_size_col;j++){
                mat_B[i][j] = keyboard.nextInt();
            }
        }

// Sum matrix

        for(int i = 0;i<matrix_size_row;i++){
            for(int j = 0;j<matrix_size_col;j++)
            {
                mat_sum[i][j] = mat_A[i][j] + mat_B[i][j];
            }
        }
        System.out.println("The Sum of the Matrix A and Matrix B is : ");

        for(int i = 0;i<matrix_size_row;i++){
            for(int j = 0;j<matrix_size_col;j++)
            {
               System.out.print(mat_sum[i][j]+" "); 
            }
            System.out.println();
        }

        keyboard.close();
    }
}
