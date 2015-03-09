/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jom.scan;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


/**
 *
 * @author Juan
 */
public class scanning{
  JPanel panel1;
  JButton jb1, jb2, jb3;
  
  public void scanning(){
        JFrame frame = new JFrame("Panel");
        frame.setLayout(null);
        
        gridJP();
        
        jb1.setBounds(10, 5, 10, 5);
        jb2.setBounds(30, 5, 10, 5);
        jb2.setBounds(40, 5, 10, 5);
        
        frame.add(panel1);
        
        frame.setLocation(100, 50);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
  
  public void 
  
  public void gridJP(){
      panel1 = new JPanel(new GridLayout(3, 1, 5, 7));
      jb1 = new JButton("B1"); 
      jb2 = new JButton("B2");
      jb3 = new JButton("B3");
      
      panel1.add(jb1);
      panel1.add(jb2);
      panel1.add(jb3);
      
      panel1.setVisible(true);
  }
  
  public static void main(){
  
  }
}

