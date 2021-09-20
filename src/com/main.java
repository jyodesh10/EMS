/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class main extends JFrame{
    main(){
        // font
        Font f = new Font("Serif", Font.BOLD, 30);
        //header
        JPanel heading;
        heading = new JPanel();
        heading.setBackground(Color.darkGray);
        
        heading.setBounds(0,0,800,100);
        JLabel name = new JLabel("Event Management System");
        
        name.setForeground(Color.WHITE);
        name.setFont(f);
        heading.add(name);
        
        JPanel body = new JPanel();
        body.setLayout(new GridBagLayout());
        body.setSize(400,350);
        body.setBackground(Color.LIGHT_GRAY);
        body.setBounds(180,175,400,350);
        
        JButton b1=new JButton("LOG IN");
        b1.setPreferredSize(new Dimension(100,50));
        b1.setBounds(50,250,100,50);
        b1.setBackground(Color.gray);
        b1.setForeground(Color.white);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                login lg=new login();
                lg.setVisible(true);
            }
        });
        body.add(b1);
        
        JButton b2=new JButton("REGISTER");
        b2.setPreferredSize(new Dimension(100,50));
        b2.setBounds(50,250,100,50);
        b2.setBackground(Color.gray);
        b2.setForeground(Color.white);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                register rg=new register();
                rg.setVisible(true);
            }
        });
        body.add(b2);
        
        setSize(800,600);
        setLayout(null);
        setTitle("EMS");
        add(heading);
        add(body);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
	
    public static void main(String[] args)  {
        new main();
    }
}