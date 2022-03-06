import java.awt.*;
import javax.swing.*;
public class Main extends JFrame{
public Main(String title){
super(title);
}

public static void main(String[] args){
Main f=new Main("Main");
Color c=new Color(0,200,250);
f.getContentPane().setBackground(c);
f.setDefaultCloseOperation(Main.EXIT_ON_CLOSE);
f.setVisible(true);
}}