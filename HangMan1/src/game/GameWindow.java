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
import java.lang.StringBuffer;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.border.EmptyBorder;
public class GameWindow extends JFrame implements ActionListener
{
int len,count,rnd,chance,flag;
 String word[]={"JAPAN","QATAR","SYRIA","MONGOLIA","BAHAMAS","INDIA","PAKISTHAN","AUSTRALIA","AFGHANISTHAN","CHINA"};
 HashMap hintlist = new HashMap();


    Random rd;
    StringBuffer blanks;
String result;

JButton a,b,c,d,e,f,g,h,i,j,k,l,n,m,o,p,q,r,s,t,u,v,w,x,y,z;
JLabel lblword,lblmessage,lblhint,HINT,lbltimer,timer;
JPanel keypad,key1, key2, key3,screen, notify;
 
public GameWindow()
{
        
count=0;
chance=0;
rd=new Random();
blanks =  new StringBuffer();

a=new JButton("A");
b=new JButton("B");
c=new JButton("C");
d=new JButton("D");
e=new JButton("E");
f=new JButton("F");
g=new JButton("G");
h=new JButton("H");
i=new JButton("I");
j=new JButton("J");
k=new JButton("K");
l=new JButton("L");
m=new JButton("M");
n=new JButton("N");
o=new JButton("O");
p=new JButton("P");
q=new JButton("Q");
r=new JButton("R");
s=new JButton("S");
t=new JButton("T");
u=new JButton("U");
v=new JButton("V");
w=new JButton("W");
x=new JButton("X");
y=new JButton("Y");
z=new JButton("Z");
    a.addActionListener(this);
    b.addActionListener(this);
    c.addActionListener(this);
    d.addActionListener(this);
    e.addActionListener(this);
    f.addActionListener(this);
    g.addActionListener(this);
    h.addActionListener(this);
    i.addActionListener(this);
    j.addActionListener(this);
    k.addActionListener(this);
    l.addActionListener(this);
    m.addActionListener(this);
    n.addActionListener(this);
    n.addActionListener(this);
    o.addActionListener(this);
    p.addActionListener(this);
    q.addActionListener(this);
    r.addActionListener(this);
    s.addActionListener(this);
    t.addActionListener(this);
    u.addActionListener(this);
    v.addActionListener(this);
    w.addActionListener(this);
    x.addActionListener(this);
    y.addActionListener(this);
    z.addActionListener(this);
        a.setBackground(Color.white);
        b.setBackground(Color.white);
        c.setBackground(Color.white);
        d.setBackground(Color.white);
        e.setBackground(Color.white);
        f.setBackground(Color.white);
        g.setBackground(Color.white);
        h.setBackground(Color.white);
        i.setBackground(Color.white);
        j.setBackground(Color.white);
        k.setBackground(Color.white);
        l.setBackground(Color.white);
        m.setBackground(Color.white);
        n.setBackground(Color.white);
        o.setBackground(Color.white);
        p.setBackground(Color.white);
        q.setBackground(Color.white);
        r.setBackground(Color.white);
        s.setBackground(Color.white);
        t.setBackground(Color.white);
        u.setBackground(Color.white);
        v.setBackground(Color.white);
        w.setBackground(Color.white);
        x.setBackground(Color.white);
        y.setBackground(Color.white);
        z.setBackground(Color.white);
   
hintlist.put("INDIA","Capital-Delhi");
hintlist.put("JAPAN","Capital-Tokyo");
hintlist.put("QATAR","Capital-Doha");
hintlist.put("SYRIA","Capital-Damascus");
hintlist.put("MONGOLIA","Capital-Ulaanbaatar");
hintlist.put("BAHAMAS","Capital-Nassau");
hintlist.put("PAKISTHAN", "Capital-Istanbull");
hintlist.put("AUSTRALIA","Capital-Canberra");
hintlist.put("AFGHANISTHAN","Capital-Kabul");
hintlist.put("CHINA","Capital-Beijing");
lblmessage=new JLabel("Guess The Country Name?");
 lblmessage.setFont(new Font("agency fb",Font.BOLD,30));
 lbltimer=new JLabel();
 lbltimer.setFont(new Font("Agency fb",Font.BOLD,20));
  lbltimer.setForeground(Color.white);
  timer=new JLabel("TIME LEFT: ");
 timer.setFont(new Font("Agency fb",Font.BOLD,20));
  timer.setForeground(Color.white);
 lblword= new JLabel();
 lblword.setFont(new Font("agency fb",Font.BOLD,35));
 lblword.setForeground(Color.white);
 HINT= new JLabel("HINT:  ");
 HINT.setFont(new Font("agency fb",Font.BOLD,20));
 HINT.setForeground(Color.white);
 lblhint= new JLabel();
 lblhint.setFont(new Font("agency fb",Font.BOLD,20));
  lblhint.setForeground(Color.white);
  lblhint.setBorder(new EmptyBorder(0,40,0,0));
   lbltimer.setBorder(new EmptyBorder(0,80,0,0));
   timer.setBorder(new EmptyBorder(0,10,0,0));
notify = new JPanel();
notify.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,0,0)));

screen =new JPanel();
screen.setBackground(Color.BLUE);
screen.setSize(0,100);

keypad= new JPanel();
keypad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,0,0)));
keypad.setBackground(Color.BLACK);
keypad.setSize(100, 200);
key1= new JPanel();
key1.setBackground(Color.BLACK);

key2= new JPanel();
key2.setBackground(Color.BLACK);
key3= new JPanel();
key3.setBackground(Color.BLACK);

setTitle("HangMan Game");
setSize(500,450);
setVisible(true);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

}
public void TimerThread() {
    try {
      Runnable r=new Runnable() {
        public void run() {
          startTimer();
    }
      };
    Thread Timer=new Thread(r,"Timer Thread");
    Timer.start();
    } catch(Exception exc) {
      JOptionPane.showMessageDialog(new JFrame(),exc);
    }
  }

  public void startTimer() {
    try {
      for(int i=60;i>=0;i--){
      lbltimer.setText(""+i + " seconds");
      
      if(i==30)
      {
          JOptionPane.showMessageDialog(this, "Only " + i + " Seconds left!! hurry up!!");
          lbltimer.setForeground(Color.RED);
      
      }
      Thread.sleep(1000);
    }
    } catch(Exception exc) {
      JOptionPane.showMessageDialog(new JFrame(),exc);
    }
  }

 public void AddComponent(){
     GridBagConstraints gc= new GridBagConstraints();
     notify.setLayout(new FlowLayout());
     notify.add(lblmessage);
     screen.setLayout(new GridBagLayout());

     gc.gridx=0;
    gc.gridy=1;
    gc.fill=gc.HORIZONTAL;

     screen.add(lblword,gc);
     gc.gridx=0;
    gc.gridy=2;
    gc.fill=gc.HORIZONTAL;
  
      screen.add(HINT,gc);
       gc.gridx=0;
    gc.gridy=2;
    gc.fill=gc.HORIZONTAL;
     screen.add(lblhint,gc);
      gc.gridx=0;
     gc.gridy=3;
     gc.fill=gc.HORIZONTAL;
     screen.add(lbltimer,gc);
      gc.gridx=0;
     gc.gridy=3;
     gc.fill=gc.HORIZONTAL;
     screen.add(timer,gc);
     keypad.setLayout(new GridBagLayout());

     keypad.setLayout(new GridBagLayout());
     key1.setLayout(new FlowLayout());
     key1.add(q);
     key1.add(w);
     key1.add(e);
     key1.add(r);
     key1.add(t);
     key1.add(y);
     key1.add(u);
     key1.add(i);
     key1.add(o);
     key1.add(p);
     gc.gridx=0;
     gc.gridy=0;
     keypad.add(key1,gc);
        
     
     key2.setLayout(new FlowLayout());
     key2.add(a);
     key2.add(s);
     key2.add(d);
     key2.add(f);
     key2.add(g);
     key2.add(h);
     key2.add(j);
     key2.add(k);
     key2.add(l);
     gc.gridx=0;
     gc.gridy=1;
     keypad.add(key2,gc);
     
     key3.setLayout(new FlowLayout());
     key3.add(z);
     key3.add(x);
     key3.add(c);
     key3.add(v);
     key3.add(b);
     key3.add(n);
     key3.add(m);
     gc.gridx=0;
     gc.gridy=2;
     keypad.add(key3,gc);
     setLayout(new BorderLayout());
     add(notify,BorderLayout.NORTH);
     add(screen,BorderLayout.CENTER);
     add(keypad,BorderLayout.SOUTH);
     }
public void StartGame()
{
AddComponent();
rnd=rd.nextInt(10);
len=word[rnd].length();
String hint=word[rnd];
TimerThread();
for(int j=0;j<len;j++)
{
  
blanks.append("_ ");
}
lblhint.setText(hintlist.get(hint).toString());
lblword.setText(blanks.toString());

}
public void actionPerformed(ActionEvent ae)
{
JButton jb = (JButton) ae.getSource();
String letter = ae.getActionCommand();
flag=0;
for(int loop=0;loop<len;loop++)
{
if(letter.charAt(0)==word[rnd].charAt(loop))
{
flag=1;
blanks.replace((loop*2),((loop*2)+1), letter);
count++;

}
}
result=blanks.toString();

if(flag==1)
{
        lblword.setText(blanks.toString());
        jb.setBackground(Color.GREEN);
        jb.setEnabled(false);
    
 }
    else
    {
        jb.setBackground(Color.RED);
        jb.setEnabled(false);
        chance++;
    }

if(!result.contains("_"))
{
    
JOptionPane.showMessageDialog(this, "Congrats!! you guessed the word correctly");
 int n= JOptionPane.showConfirmDialog(this, "Do  you want to play again?", "Restart Game", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
if(n == JOptionPane.YES_OPTION)
        {
            GameWindow oj= new GameWindow();
            oj.StartGame();
            this.dispose();
        }
else
{
this.dispose();
Menu obj = new Menu();
obj.addcomponent();
this.dispose();
}
}
if(chance>5)
{
 JOptionPane.showMessageDialog(this, "Sorry you lost your chances");
 int n= JOptionPane.showConfirmDialog(this, "Do  you want to play again?", "Restart Game", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
if(n == JOptionPane.YES_OPTION)
        {
            GameWindow oj= new GameWindow();
            oj.StartGame();
            this.dispose();
        }
else
{
this.dispose();
Menu obj = new Menu();
obj.addcomponent();
this.dispose();
}   
}
}

 }





