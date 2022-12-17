package FoodOrdering;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FoodOrderGUI extends JFrame{
    private JPanel PanelMain;
    private JCheckBox cPizza;
    private JRadioButton rbNone;
    private JButton orderButton;
    private JCheckBox cBurger;
    private JCheckBox cSoftdrinks;
    private JCheckBox cFries;
    private JCheckBox cTea;
    private JCheckBox cSundae;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;

    public void FoodOrderGUI() {
        orderButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double totalPrice = 0;

                if (cPizza.isSelected()) {
                    totalPrice += 100;
                }
                if (cBurger.isSelected()) {
                    totalPrice += 80;
                }
                if (cFries.isSelected()) {
                    totalPrice += 65;
                }
                if (cTea.isSelected()) {
                    totalPrice += 50;
                }
                if (cSundae.isSelected()) {
                    totalPrice += 40;
                }
                if (cSoftdrinks.isSelected()) {
                    totalPrice += 55;
                }
                if(rb5.isSelected()){
                    totalPrice *= 0.05;
                }
                if(rb10.isSelected()){
                    totalPrice *= 0.01;
                }
                if(rb15.isSelected()){
                    totalPrice *= 0.15;
                }
                JOptionPane.showMessageDialog(PanelMain,"The total price is " + totalPrice);
            }
        });
    }
    public static void main(String[] args) {
        FoodOrderGUI f  = new FoodOrderGUI();
        f.setContentPane(f.PanelMain);
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
        f.setVisible(true);
        f.setSize(800, 400);
        f.FoodOrderGUI();
    }
}
