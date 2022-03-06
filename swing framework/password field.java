import java.awt.*;
import javax.swing.*;
public class Main extends JFrame{
public Main(String title){
super(title);
}

public static void main(String[] args){
Main f=new Main("Main");
JPasswordField t=new JPasswordField();
t.setBackground(Color.BLACK);
t.setForeground(Color.WHITE);
t.setBounds(50, 50, 1080, 500);
f.setLayout(null);
f.add(t);
f.setDefaultCloseOperation(Main.EXIT_ON_CLOSE);
f.setVisible(true);
}}