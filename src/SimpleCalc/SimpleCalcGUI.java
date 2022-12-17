package SimpleCalc;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalcGUI extends  JFrame{
    JFrame frame = new JFrame("Simple Calculator");
    private JPanel PanelMain;
    private JTextField tfAreaInput1;
    private JComboBox cbOperations;
    private JButton computeResultButton;
    private JTextField tfAreaInput2;
    private JTextField tfResult;

   public void SimpleCal(){
       cbOperations = new JComboBox<>(new String[] {"+", "-", "*", "/"});
           computeResultButton.addActionListener(new ActionListener() {
               @Override
               public void actionPerformed(ActionEvent e) {
                   int num1 = Integer.parseInt(tfAreaInput1.getText());
                   int num2 = Integer.parseInt(tfAreaInput2.getText());
                   int res = 0;
                   String operation = (String)cbOperations.getSelectedItem();

                   if(operation.equals("+")){
                       res = num1 + num2;
                   }else if(operation.equals("-")){
                       res = num1 - num2;
                   }else if(operation.equals("*")){
                       res = num1 * num2;
                   }else if(operation.equals("/")){
                       res = num1 / num2;
                   }
          }
     });
   }
    public static void main(String[] args) {
        SimpleCalcGUI s = new SimpleCalcGUI();
        s.setContentPane(s.PanelMain);
        s.setDefaultCloseOperation(EXIT_ON_CLOSE);
        s.setVisible(true);
        s.setSize(500, 200);
        s.SimpleCal();
    }
}
