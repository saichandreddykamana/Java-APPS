/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

/**
 *
 * @author user
 */
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.border.EmptyBorder;
public class Menu extends JFrame implements ActionListener{
    JButton opt1;
    JButton opt2;
    JButton opt3;
    JLabel name,icon;
ImageIcon image,image1,image2;   
    public Menu()
    {
    
        opt1=new JButton("Play Game");
        opt2=new JButton("Instructions");
        opt3=new JButton("Exit");
      image=new ImageIcon("Images\\play.png");
      icon=new JLabel(new ImageIcon("Images\\guess.png"));
    icon.setBorder(new EmptyBorder(20,0,0,0));
      opt1.addActionListener(this);
       opt1.setIcon(image);
        opt1.setBackground(Color.white);
        opt2.addActionListener(this);
        opt2.setBackground(Color.white);
        image1=new ImageIcon("Images\\instructions.png");
       opt2.setIcon(image1);
        opt3.addActionListener(this);
    opt3.setBackground(Color.white);
     image2=new ImageIcon("Images\\exit.jpg");
       opt3.setIcon(image2);    
    
    name = new JLabel("HangMan");
    name.setFont(new Font("Agency fb", Font.BOLD,50));
    name.setForeground(Color.WHITE);
    setTitle("HangMan Game");
   getContentPane().setBackground(Color.BLACK);
    setSize(400,400);
    setResizable(false);
    setVisible(true);
    
    }
public void addcomponent()
{
    setLayout(new GridBagLayout());
    GridBagConstraints c= new GridBagConstraints();
    c.gridx=0;
    c.gridy=0;
    
    c.weighty=0.1;
    c.anchor=c.CENTER;
    
    add(icon,c);
    c.gridx=0;
    c.gridy=1;
    c.weighty=0.5;
    c.anchor=c.CENTER;
    add(name,c);
    
    c.gridx=0;
    c.gridy=2;
    c.fill=c.HORIZONTAL;
    add(opt1,c);

    c.gridx=0;
    c.gridy=3;
    c.fill=c.HORIZONTAL;
    add(opt2,c);

    c.gridx=0;
    c.gridy=4;
    c.fill=c.HORIZONTAL;
    add(opt3,c);
}

    @Override
    public void actionPerformed(ActionEvent ae) {
       if(ae.getSource()==opt1)
       {
           GameWindow oj= new GameWindow();
           oj.StartGame();
           this.dispose();
       }
       else if(ae.getSource()==opt2)
       {
           JOptionPane.showMessageDialog(this,"1. You Can Guess the Word By Clicking The Character From The Virtual Keypad. \n2. You Can Select a Maximum of 5 incorrect letters. \n3. The Incorrect guess Will Be Highlighted With Red Color, and the right one will be highlighted with Green Color.","Instructions", JOptionPane.INFORMATION_MESSAGE);
           
       }
       else if(ae.getSource()==opt3)
       {
           System.exit(0);
       }
    }
}
