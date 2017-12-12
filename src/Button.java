/**
 * @Author:Shea Salloum
 * @Date;December
 *
 */

import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Button implements ActionListener {
    private JFrame frame;
    private JPanel panel;
    private JLabel label;
    private JLabel output;
    private JTextField textField;
    private JTextField textField2;
    private JButton button;

    public Button() {
        frame = new JFrame("Calculator");
        frame.setVisible(true);
        frame.setSize(500, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        panel.setBackground(Color.CYAN);
        frame.add(panel);

        label = new JLabel();
        label.setText("Enter Num");
        label.setForeground(Color.BLACK);

        output = new JLabel();
        output.setText("Total");

        textField = new JTextField(5);
        textField2 = new JTextField(5);

        button = new JButton("ADD");
        button.addActionListener(this);

        panel.add(label);
        panel.add(textField);
        panel.add(textField2);
        panel.add(button);
        panel.add(output);

        frame.add(panel);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(textField.getText()+ textField2.getText());
        double num1= Double.parseDouble(textField.getText());
        double num2= Double.parseDouble(textField2.getText());
        double sum = num1 + num2 ;
        System.out.println("Total is " + sum);
    }
}
