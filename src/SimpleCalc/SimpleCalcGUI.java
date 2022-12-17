package SimpleCalc;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalcGUI extends  JFrame{
    JFrame frame = new JFrame("Simple Calculator");
    private JPanel PanelMain;
    private JTextField tfNumber1;
    private JComboBox cbOperations;
    private JButton compute;
    private JTextField tfNumber2;
    private JTextField lblResult;

   public void SimpleCal(){
           compute.addActionListener(new ActionListener() {
               @Override
               public void actionPerformed(ActionEvent e) {
                   int num1 = Integer.parseInt(tfNumber1.getText());
                   int num2 = Integer.parseInt(tfNumber2.getText());
                   int res = 0;
                   String operation = (String)cbOperations.getSelectedItem();
                   if(operation.compareTo("+") == 0){
                       res = num1 + num2;
                   }else if(operation.compareTo("-") == 0){
                       res = num1 - num2;
                   }else if(operation.compareTo("*") == 0){
                       res = num1 * num2;
                   }else if(operation.compareTo("/") == 0){
                       res = num1 / num2;
                   }
                   lblResult.setText(String.valueOf(res));
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
