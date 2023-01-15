import java.awt.ComponentOrientation;

import java.awt.*;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class NumberGrid extends JFrame{
    private JButton[] btnNumber = new JButton[10];
    private JButton btnDelete,btnReset;
    private JTextField tfDisplay;

    public NumberGrid(){
        tfDisplay = new JTextField();
        tfDisplay.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);

        JPanel panelButtons = new JPanel(new GridLayout(4,3));
        addButtons(panelButtons);

        Container cp = getContentPane();
        cp.setLayout(new BorderLayout());
        cp.add(tfDisplay,BorderLayout.NORTH);
        cp.add(panelButtons,BorderLayout.CENTER);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Number Grid");
        setSize(200,200);
        setVisible(true);
    }

    void addButtons(JPanel panelButtons){
        ButtonListener btnListener = new ButtonListener();
        for (int i= 1;i<=9;i++){
            btnNumber[i]=new JButton(""+i);
            panelButtons.add(btnNumber[i]);
            btnNumber[i].addActionListener(btnListener);
        }

        btnDelete = new JButton("DEL");
        panelButtons.add(btnDelete);
        btnDelete.addActionListener(btnListener);

        btnNumber[0] = new JButton("0");
        panelButtons.add(btnNumber[0]);
        btnNumber[0].addActionListener(btnListener);

        btnReset = new JButton("C");
        panelButtons.add(btnReset);
        btnReset.addActionListener(btnListener);

    }

    private class ButtonListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            String button = e.getActionCommand();
            if(button.charAt(0)>='0' && button.charAt(0)<=9){
                tfDisplay.setText(tfDisplay.getText()+button);
            }
            else if (button.equals("DEL")){
                // handles the "DEL" case
            }
            else{
                // handles the "C" case
            }
        }
    }
}
