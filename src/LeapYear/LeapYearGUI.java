package LeapYear;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LeapYearGUI extends JFrame{
    JFrame frame = new JFrame("Leap Year Checker");

    private JPanel PanelMain;
    private JTextField tfArea;
    private JButton Button;

    public void yearChecker() {
        try{
            Button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int year = Integer.parseInt(tfArea.getText());

                    if(year % 4 == 0 || year % 100 == 0 || year % 400 == 0){
                        JOptionPane.showMessageDialog(PanelMain, "Leap Year");
                    }else{
                        JOptionPane.showMessageDialog(PanelMain,"Not Leap Year");
                    }
                }
            });
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(PanelMain,"Invalid Input");
        }
    }

    public static void main(String[] args) {
        LeapYearGUI l = new LeapYearGUI();
        l.setContentPane(l.PanelMain);
        l.setDefaultCloseOperation(EXIT_ON_CLOSE);
        l.setVisible(true);
        l.setSize(400, 200);
        l.yearChecker();
    }
}
