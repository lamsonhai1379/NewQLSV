package com.SonHai.QLSV;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm extends JFrame implements ActionListener {

    private JPanel loginPanel ;
    private JPanel btnPanel;
    private JLabel usernameLabel ;
    private JLabel passwordLabel ;
    private JTextField usernameTextField ;
    private JPasswordField passwordField;
    private JButton btnLogin;

    public void setUI(){
        btnPanel = new JPanel();
        btnLogin = new JButton("LOGIN");

        usernameLabel = new JLabel("Username",JLabel.CENTER);
        passwordLabel = new JLabel("Password",JLabel.CENTER);

        usernameLabel.setLabelFor(usernameTextField);
        passwordLabel.setLabelFor(passwordField);

        usernameTextField = new JTextField(20);
        passwordField = new JPasswordField(20);

        passwordField.setEchoChar('*');

        usernameTextField.setBackground(Color.cyan);
        usernameTextField.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));
        passwordField.setBackground(Color.cyan);
        passwordField.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));

        btnPanel.setSize(100,20);
        btnPanel.add(btnLogin);

        loginPanel = new JPanel();
        loginPanel.setLayout(new GridLayout(2,2 ,5,5));
        loginPanel.setSize(300,50);
        loginPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        loginPanel.add(usernameLabel);
        loginPanel.add(usernameTextField);
        loginPanel.add(passwordLabel);
        loginPanel.add(passwordField);
        //loginPanel.add(btnLogin);


        this.setLayout(new GridLayout(2,1));
        this.getRootPane().setBorder(BorderFactory.createMatteBorder(6,6,6,6,Color.GREEN));
        this.add(loginPanel,BorderLayout.CENTER);
        this.add(btnPanel,BorderLayout.CENTER);
        this.setSize(350,150);
        this.pack();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //System.out.println(btnOK.getBounds());

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
