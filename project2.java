/*
* File: Project1.java
* Author: Edilson Hernandez
* Date: April 6, 2018
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Project2 extends JFrame {
  public Project2() {
    setTitle("Three Address Generator");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
    setLayout(new GridLayout(3,1));

    JPanel expressionPanel = new JPanel();
    expressionPanel.setLayout(new GridLayout(1,2));
    JLabel expressionLabel = new JLabel("Enter Postfix Expression");
    JTextField expressionField = new JTextField("");
    expressionPanel.add(expressionLabel);
    expressionPanel.add(expressionField);
    add(expressionPanel);

    JButton eval = new JButton("Construct Tree");
    add(eval);

    JPanel infixPanel = new JPanel();
    infixPanel.setLayout(new GridLayout(1,2));
    JLabel infixLabel = new JLabel("Infix Expression");
    JTextField infixResult = new JTextField("");
    infixResult.setBackground(Color.LIGHT_GRAY);
    infixResult.setEditable(false);
    infixPanel.add(infixLabel);
    infixPanel.add(infixResult);
    add(infixPanel);

    pack();
    setVisible(true);
    setSize(500,150);
  }

  public static void main(String[] args) {
    new Project2();
  }
}
