/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author jyode
 */
public class login extends JFrame {
    login(){
        Font f = new Font("Serif", Font.BOLD, 30);
        //header
        JPanel heading;
        heading = new JPanel();
        heading.setBackground(Color.darkGray);
        
        heading.setBounds(0,0,800,100);
        JLabel name = new JLabel("LOG IN");
        
        name.setForeground(Color.WHITE);
        name.setFont(f);
        heading.add(name);
        
        JPanel body = new JPanel();
        body.setLayout(null);
        body.setSize(400,350);
        body.setBackground(Color.LIGHT_GRAY);
        body.setBounds(180,175,400,350);
        
        JTextField e = new JTextField("Email");
        body.setLayout(null);
        e.setBounds(150,60,200,30);
        body.add(e);
        
        JPasswordField pa = new JPasswordField("Password");
        pa.setBounds(150,160,200,30);
        body.add(pa);

        
        JLabel email=new JLabel("EMAIL:",JLabel.LEFT);
        email.setFont(new Font("Serif",Font.BOLD,14));
        email.setForeground(Color.red);
        email.setBounds(50,50,200,50);
        body.add(email);
        
        JLabel password=new JLabel("PASSWORD:",JLabel.LEFT);
        password.setFont(new Font("Serif",Font.BOLD,14));
        password.setForeground(Color.red);
        password.setBounds(50, 150,200,50);
        body.add(password);
        
        JFrame frame=new JFrame();
        
        JButton b1=new JButton("LOG IN");
        b1.setPreferredSize(new Dimension(100,50));
        b1.setBounds(150,250,100,50);
        b1.setBackground(Color.gray);
        b1.setForeground(Color.white);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                   
                    home hm=new home();
                    hm.setVisible(true);
                
                
                }
        });
        body.add(b1);
        
        JPanel p = new JPanel();
        //p.setBackground(Color.yellow);
//        body.setLayout(new GridLayout(3,100,1,20));
//        body.add(email);
//        body.add(e);
//        body.add(password);
//        body.add(pa);
//        body.add(b);
        
        setSize(800,600);
        setLayout(null);
        setTitle("lOGIN");
        add(heading);
        add(body);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
    }
    
//    private void b1ActionPerformed(java.awt.event.ActionEvent evt){
//        //this.hide();
//        home hm=new home();
//        hm.setVisible(true);
//    }
            
       public static void main(String[] args) {
            new login();
//        java.awt.EventQueue.invokeLater(new Runnable(){
//            @Override
//            public void run() {
//                new home().setVisible(true);
//            }
//        
//        });
     }
    
}
