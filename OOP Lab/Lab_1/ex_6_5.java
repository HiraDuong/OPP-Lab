import java.util.Scanner;



public class ex_6_5 {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Please Enter the number of Array");
        int sum = 0;
        int arr_num= keyboard.nextInt();
        int[] Arr = new int[arr_num];
        System.out.println("Please Enter the parts of Array");
        
        for (int i = 0;i<(arr_num);i++){
            Arr[i] = keyboard.nextInt();
            sum+=Arr[i];
        }

        for(int i = 0;i<arr_num-1;i++){
            for(int j = i+1;j<arr_num;j++){
                if(Arr[i]>Arr[j]){
                    int tmp = Arr[i];
                    Arr[i] = Arr[j];
                    Arr[j] = tmp;
                }
            }
        }

        System.out.println("Array is" );
        for (int i = 0;i<(arr_num);i++){
           System.out.print(Arr[i] + " ");
        }
        System.out.println("\nAverage is " +(double) (sum/arr_num));

        keyboard.close();
    }
}
