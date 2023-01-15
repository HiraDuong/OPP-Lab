
import java.lang.Math;
import javax.swing.JOptionPane;

public class ex_2_2_6 {
// solve bac nhat 1 an
        public static void solve1(double a,double b){
            if(a == 0) {
                if (b == 0) {
                    JOptionPane.showMessageDialog(null, "Phuong trinh vo so nghiem", "SOLVE", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Phuong trinh vo nghiem", "SOLVE", JOptionPane.INFORMATION_MESSAGE);

                }
            } else {
                double nghiem = (double)-b/a;
                JOptionPane.showMessageDialog(null, "Phuong trinh co nghiem la " + nghiem, "SOLVE", JOptionPane.INFORMATION_MESSAGE);
            }

        }
// giai hpt bac nhat 2 an
        public static void solve2(double a_1, double a_2,double b_1,double b_2,double c_1, double c_2){
           double D = a_1 * b_2 - a_2 * b_1;
           double Dx = c_1 * b_2 - c_2 * b_1;
           double Dy = a_1 * c_2 - a_2 * c_1;
            if (D == 0) {
              //nếu D = 0 và Dx + Dy = 0 thì phương trình vô số nghiệm, ngược lại thì vô nghiệm
              if (Dx + Dy == 0)
                JOptionPane.showMessageDialog(null, "He phuong trinh co vo so nghiem","RESULT",JOptionPane.INFORMATION_MESSAGE);
              else
                JOptionPane.showMessageDialog(null, "He phuong trinh co vo nghiem","RESULT",JOptionPane.INFORMATION_MESSAGE);
            }
            //tính x và y theo công thức
            else {
              double x = Dx / D;
              double y = Dy / D;
                JOptionPane.showMessageDialog(null, "He phuong trinh co nghiem (x,y) : "+"("+ x + " : " +y+")" ,"RESULT",JOptionPane.INFORMATION_MESSAGE);
            }
        }
// giai pt bac 2
        public static void solve3 (double a,double b, double c){
            double x1,x2;
            double delta =(double) b*b - 4*a*c;
            if(delta<0){
                x1=x2=0.0;
                 JOptionPane.showMessageDialog(null, "Phuong trinh vo nghiem ", "RESULT", JOptionPane.INFORMATION_MESSAGE);;
            }
            else if(delta==0){
                x1 = x2 = -b/(2*a);
                 JOptionPane.showMessageDialog(null, "Phuong trinh co nghiem kep la" + x1, "RESULT", JOptionPane.INFORMATION_MESSAGE);;
            }
            else{
                delta = Math.sqrt(delta);
                x1 = (-b + delta) / (2*a);
                x2 = (-b - delta) / (2*a);
                 JOptionPane.showMessageDialog(null, "Phuong trinh co 2 nghiem phan biet la" + x1 + " and "+ x2, "RESULT", JOptionPane.INFORMATION_MESSAGE);;
            }
        }
// MAIN
    public static void main(String[] args){
    //START    
        String str_a,str_b,str_c;
        String option;
        String str_input = "Please enter  input : ";
        String str_option = "Please choose the option\n 1 is for first-degree equation \n 2 is for -	The system of first-degree equations (linear system) with two variables\n 3 is for -	The second-degree equation with one variable \n ";
        option = JOptionPane.showInputDialog(null, str_option, "OPTION", JOptionPane.INFORMATION_MESSAGE);
        
    //OPTION
        switch(option){
            case "1" : {
                str_a = JOptionPane.showInputDialog(null, str_input, "ENTER a", JOptionPane.INFORMATION_MESSAGE);
                str_b = JOptionPane.showInputDialog(null, str_input, "ENTER b", JOptionPane.INFORMATION_MESSAGE);
                
                double a = Double.parseDouble(str_a);
                double b = Double.parseDouble(str_b);
                solve1(a, b);
                break;
            }
            case "2" : 
            {   
                String str_a_1 = JOptionPane.showInputDialog(null, str_input, "ENTER a_1", JOptionPane.INFORMATION_MESSAGE);
                String str_b_1 = JOptionPane.showInputDialog(null, str_input, "ENTER b_1", JOptionPane.INFORMATION_MESSAGE);
                String str_c_1 = JOptionPane.showInputDialog(null, str_input, "ENTER c_1", JOptionPane.INFORMATION_MESSAGE);
                String str_a_2 = JOptionPane.showInputDialog(null, str_input, "ENTER a_2", JOptionPane.INFORMATION_MESSAGE);
                String str_b_2 = JOptionPane.showInputDialog(null, str_input, "ENTER b_2", JOptionPane.INFORMATION_MESSAGE);
                String str_c_2 = JOptionPane.showInputDialog(null, str_input, "ENTER c_2", JOptionPane.INFORMATION_MESSAGE);
                
                double a_1 = Double.parseDouble(str_a_1);
                double b_1 = Double.parseDouble(str_b_1);
                double c_1 = Double.parseDouble(str_c_1);
                double a_2 = Double.parseDouble(str_a_2);
                double b_2 = Double.parseDouble(str_b_2);
                double c_2 = Double.parseDouble(str_c_2);
                

                solve2(a_1, a_2,b_1,b_2,c_1, c_2);
                break;
            }
            case "3" : {
                str_a = JOptionPane.showInputDialog(null, str_input, "ENTER a_1", JOptionPane.INFORMATION_MESSAGE);
                str_b = JOptionPane.showInputDialog(null, str_input, "ENTER b", JOptionPane.INFORMATION_MESSAGE);
                str_c = JOptionPane.showInputDialog(null, str_input, "ENTER c", JOptionPane.INFORMATION_MESSAGE);
                double a = Double.parseDouble(str_a);
                double b = Double.parseDouble(str_b);
                double c = Double.parseDouble(str_c);
                solve3(a,b,c);
                break;
            }
            default :
        }

        System.exit(0);
    }
}
