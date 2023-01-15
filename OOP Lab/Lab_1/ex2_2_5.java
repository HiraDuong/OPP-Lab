import javax.swing.JOptionPane;

public class ex2_2_5 {
    public static void main (String[] args){
        String strnum1,strnum2;
        String strNotification = "The result of  ";
        String strNotification2 = "num1 and num 2 is : ";

        strnum1 = JOptionPane.showInputDialog(null, "Please input the first number",JOptionPane.INFORMATION_MESSAGE);

        double num1 = Double.parseDouble(strnum1);


      

        strnum2 = JOptionPane.showInputDialog(null, "Please input the second number",JOptionPane.INFORMATION_MESSAGE);

        

        double num2 = Double.parseDouble(strnum2);

        // add
        JOptionPane.showMessageDialog(null, (strNotification+"Sum of " + strNotification2 + (num1+num2)), "Add", JOptionPane.INFORMATION_MESSAGE);

        // Difference
        JOptionPane.showMessageDialog(null, (strNotification+"Deference of " + strNotification2 + (num1-num2)), "Deference", JOptionPane.INFORMATION_MESSAGE);

        //Multiplication
        JOptionPane.showMessageDialog(null, (strNotification+"Multiplication of " + strNotification2 + (num1*num2)), "Mul", JOptionPane.INFORMATION_MESSAGE);

        // Divide
        JOptionPane.showMessageDialog(null, (strNotification+"Divide of " + strNotification2 + (num1/num2)), "Divide", JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
        
        
    }
}
