import java.awt.event.*;
import javax.swing.*;
public class Main{
static JFrame f;
static JTextField t1, t2;
static JLabel l;
static JButton b;

public static void main(String[] args){
f=new JFrame("title");
t1=new JTextField();
t2=new JTextField();
b=new JButton("add");
l=new JLabel();
b.addActionListener(new handler());
f.setLayout(null);
f.setSize(720, 540);
t1.setBounds(10, 10, 200, 20);
t2.setBounds(10, 40, 200, 20);
b.setBounds(10, 70, 200, 20);
l.setBounds(10, 100, 200, 20);
f.add(t1);
f.add(t2);
f.add(b);
f.add(l);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f.setVisible(true);
}}

class handler implements ActionListener{
public void actionPerformed(ActionEvent e){
int n1, n2;
n1=Integer.parseInt(Main.t1.getText());
n2=Integer.parseInt(Main.t2.getText());
int value=n1+n2;
Main.l.setText("sum:"+value);
}}
