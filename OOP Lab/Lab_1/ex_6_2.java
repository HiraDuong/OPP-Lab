import java.util.Scanner;



public class ex_6_2 {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is your name? ");
        String name = keyboard.nextLine();
        System.out.println("How old are you? ");
        int old = keyboard.nextInt();
        System.out.println("How tall are you (m) ?");
        double tall = keyboard.nextDouble();

        System.out.println("Your name is : " + name);
        System.out.println("Your old is : " + old);
        System.out.println("Your height is : " + tall+" m");
        
        keyboard.close();
        
        System.exit(0);
    }
}
