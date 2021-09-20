
package com;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class register extends JFrame{
    public register(){ 
         Font f = new Font("Serif", Font.BOLD, 30);
        //header
        JPanel heading;
        heading = new JPanel();
        heading.setBackground(Color.darkGray);
        
        heading.setBounds(0,0,800,100);
        JLabel name = new JLabel("REGISTER");
        
        name.setForeground(Color.WHITE);
        name.setFont(f);
        heading.add(name);
        
        JPanel body = new JPanel();
        body.setLayout(null);
        body.setSize(400,350);
        body.setBackground(Color.LIGHT_GRAY);
        body.setBounds(180,175,400,350);
        
        JTextField n = new JTextField(10);    
        JTextField e = new JTextField(10);   
        JTextField a = new JTextField(10);
        JTextField nu = new JTextField(10);
        JPasswordField pa = new JPasswordField(10);
        JPasswordField c = new JPasswordField(10);
        
        JLabel name1=new JLabel("Name",JLabel.RIGHT);
        JLabel email=new JLabel("Email",JLabel.RIGHT);
        JLabel address=new JLabel("Address",JLabel.RIGHT);
        JLabel num=new JLabel("Contact no.",JLabel.RIGHT);
        JLabel pass=new JLabel("Password",JLabel.RIGHT);
        JLabel cpass=new JLabel("Confirm Password",JLabel.RIGHT);
        
        JFrame fm=new JFrame();
        
        JButton b= new JButton("REGISTER!!!");
        b.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 JOptionPane.showMessageDialog(fm,"Succesfully Registered");
                 login lg=new login();
                 lg.setVisible(true);
                         
            }
         });
        
        
        body.setLayout(new GridLayout(7,10,50,10));
        body.add(name1);
        body.add(n);
        body.add(email);
        body.add(e);
        body.add(address);
        body.add(a);
        body.add(num);
        body.add(nu);
        body.add(pass);
        body.add(pa);
        body.add(cpass);
        body.add(c);
        body.add(b);
        
        setSize(800,600);
        setLayout(null);
        setTitle("REGISTER");
        add(heading);
        add(body);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args){
        new register();
    }

//    public void actionPerformed(ActionEvent e) {
//        
//        
//        JLabel la= new JLabel("YOU HAVE SUCCESSFULLY REGISTERED!!");
//        JButton b=new JButton("OK");
//        b.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.exit(0);
//            }
//        });
//        
//        JPanel p =new JPanel();
//        p.setLayout(new GridLayout(2, 0,10,10));
//        p.setBackground(Color.yellow);
//        p.add(la);
//        p.add(b);
//        
//        JFrame  f= new JFrame();
//        f.setSize(100,100);        
//        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        f.setTitle("Register");
//        f.setContentPane(p);
//        
//        f.pack();
//        f.setVisible(true);
//    }
    }

