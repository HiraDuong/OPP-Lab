import javax.swing.JOptionPane;

public class ex_6_1 {
    public static void main(String[] args){
        int option = JOptionPane.showConfirmDialog(null, "Do you want to change to the first class ticket ?", "OPTION", 0);
        System.out.println("option : " + option);

        JOptionPane.showMessageDialog(null, "You've chosen : "+(option==JOptionPane.YES_OPTION? "Yes" : "No"), null, JOptionPane.INFORMATION_MESSAGE);
    }
}
