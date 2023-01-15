import java.util.Scanner;

public class ex_6_3 {
   
        public static void main(String[] args) {
            Scanner keyboard = new Scanner(System.in);
            int rows = keyboard.nextInt();
            int  k = 0;

            for (int i = 1; i <= rows; ++i, k = 0) {
              for (int space = 1; space <= rows - i; ++space) {
                System.out.print("  ");
              }
        
              while (k != 2 * i - 1) {
                System.out.print("* ");
                ++k;
              }
        
              System.out.println();
            
            keyboard.close();
        
        }
    }
}
