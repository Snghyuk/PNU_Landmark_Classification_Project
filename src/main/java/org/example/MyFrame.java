package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MyFrame extends JFrame {
//    Image background=new ImageIcon("src/image/test.jpg").getImage();
    JLabel label = new JLabel("Hello, World!");
    Container c;
    MyButton bt;
    MyLabel ml;
    MyFrame(){
        this.setTitle("Image Classification");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c = this.getContentPane();
        c.setLayout(null);

        ml = new MyLabel(c,this);
        MenuBar menuBar = new MenuBar(c,ml);
        setJMenuBar(menuBar.mb);


        this.setSize(1000,1000);
        this.setVisible(true);

        bt = new MyButton(c,this,ml);

        this.getContentPane().setBackground(Color.CYAN);
        this.setLocationRelativeTo(null);
    }



    /*public void paint(Graphics g) {//그리는 함수
        g.drawImage(background, 0, 0, null);//background를 그려줌
    }*/


}
