import java.awt.*;
import javax.swing.*;
public class Main extends JFrame{
public static void main(String[] args){
Main f=new Main("Title");
f.setBounds(100, 100, 720, 540);
ImageIcon im=new ImageIcon("abc.jpg");
f.setIconImage(im.getImage());
Container c=f.getContentPane();
c.setBackground(Color.RED);
f.setResizable(false);
f.setDefaultCloseOperation( Main.EXIT_ON_CLOSE);
f.setVisible(true);
}

public Main(String title){
super(title);
}}