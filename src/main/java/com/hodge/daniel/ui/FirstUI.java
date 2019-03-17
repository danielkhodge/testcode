package com.hodge.daniel.ui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class FirstUI {
    private JTextField firstNameField;
    private JTextField lastNameField;
    private JCheckBox eligibleCheckBox;
    private JButton somethingButton;
    private JPanel myPane;
    private JButton openCalculatorButton;
    private JTextPane myTextPane;
    private JSpinner spinner1;
    private JPasswordField passwordField1;
    private JList list1;
    private JButton addItemToListButton;
    Process calc;

    public FirstUI() {
        somethingButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println(firstNameField.getText());
            }
        });
        openCalculatorButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    calc = Runtime.getRuntime().exec("calc");
                    calc.waitFor(15, TimeUnit.SECONDS);
                    calc.destroyForcibly();
                    JOptionPane.showConfirmDialog(FirstUI.this.myPane, "Hi this!");
                } catch (IOException | InterruptedException e1){
                    e1.printStackTrace();
                }
            }
        });
        addItemToListButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultListModel model = (DefaultListModel)list1.getModel();
                model.add(model.size(), "Random Number: " + Math.random());
            }
        });
    }

    public static void main(String[] srgs) {
        JFrame frame = new JFrame("My first Swing app");
        frame.setContentPane(new FirstUI().myPane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private void createUIComponents() {
        System.out.println("Hi customerCreate UI");
        list1 = new JList();
        list1.setModel(new DefaultListModel());
    }
}
