
package com;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class home extends JFrame {
    home(){
        Font f = new Font("Serif", Font.BOLD, 30);
        JPanel p;
        p = new JPanel();
        p.setBackground(Color.darkGray);
        
        p.setBounds(0,0,800,100);
        JLabel name = new JLabel("Events Available");
        
        name.setForeground(Color.WHITE);
        name.setFont(f);
        p.add(name);
        
        JPanel body = new JPanel();
        body.setLayout(new GridBagLayout());
        body.setSize(400,350);
        body.setBackground(Color.LIGHT_GRAY);
        body.setBounds(180,175,400,350);
        
        JFrame fm=new JFrame();
        JButton book=new JButton("BOOK");
        book.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 JOptionPane.showMessageDialog(fm,"Succesfully booked");

            }
        });
        JButton book1=new JButton("BOOK");
        book1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 JOptionPane.showMessageDialog(fm,"Succesfully booked");

            }
        });
        JButton book2=new JButton("BOOK");
        book2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 JOptionPane.showMessageDialog(fm,"Succesfully booked");

            }
        });
        JButton book3=new JButton("BOOK");
        book3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 JOptionPane.showMessageDialog(fm,"Succesfully booked");

            }
        });
        JButton cancel=new JButton("CANCEL BOOKING");
        cancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JLabel la=new JLabel("Are you sure?",JLabel.CENTER);
                JButton b=new JButton("YES");
                b.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JOptionPane.showMessageDialog(fm,"Booking Cancelled");
                        System.exit(0);

                    }
                });
                fm.setLayout(new GridBagLayout());
                fm.setSize(250,100);
                fm.add(la);
                fm.add(b);
                fm.setVisible(true);

            }
        });
        

        
        //JLabel l=new JLabel("Event's Available",JLabel.LEFT);
        //l.setFont(new Font("Serif",Font.BOLD,20));
        JLabel event1=new JLabel("TEDx talks",JLabel.RIGHT);
        event1.setForeground(Color.red);
        JLabel event2=new JLabel("JAVA workshop",JLabel.RIGHT);
        event2.setForeground(Color.red);
        
        JLabel event3=new JLabel("Battle of the bands",JLabel.RIGHT);
        event3.setForeground(Color.red);
        JLabel event4=new JLabel("Sports Week",JLabel.RIGHT);
        event4.setForeground(Color.red);
        //p.add(l);

        body.setLayout(new GridLayout(5, 20, 10, 10));
        body.add(event1);
        body.add(book);
        body.add(event2);
        body.add(book1);
        body.add(event3);
        body.add(book2);
        body.add(event4);
        body.add(book3);
        body.add(cancel);
        
        setSize(800,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setTitle("HOMEPAGE");
        add(p);
        add(body);
        setResizable(false);
        setVisible(true);
       
    }

//    @Override
//    public void actionPerformed(ActionEvent e) {
//        JLabel la= new JLabel("ARE YOU SURE?");
//        JButton b=new JButton("YES");
//        b.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                JLabel la=new JLabel("BOOKING CANCELLED");
//                JButton bu=new JButton("OK");
//                bu.addActionListener(new ActionListener() {
//                    @Override
//                    public void actionPerformed(ActionEvent e) {
//                        System.exit(0);
//                    }
//                });
//                JPanel p =new JPanel();
//                p.setLayout(new GridLayout(2, 0,10,10));
//                p.setBackground(Color.gray);
//                p.add(la);
//                p.add(bu);
//                JFrame  f= new JFrame();
//                f.setSize(100,100);        
//                f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//                f.setTitle("Register");
//                f.setContentPane(p);
//                f.pack();
//                f.setVisible(true);
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
//        f.pack();
//        f.setVisible(true);
//    }
    public static void main(String[] args) {
        new home();
        
//        java.awt.EventQueue.invokeLater(new Runnable(){
//            @Override
//            public void run() {
//                new home().setVisible(true);
//            }
//        
//        });
    }
    
}