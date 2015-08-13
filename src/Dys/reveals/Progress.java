/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Dys.reveals;


import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

//CTRL + SHIFT + O pour gŽnŽrer les imports nŽcessaires
public class Progress extends JFrame{
private Thread t;
private JProgressBar bar;

 
public Progress(){      
  this.setSize(300, 80);
  this.setTitle("In progress ...");
  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  this.setLocationRelativeTo(null);      
    
  t = new Thread(new Traitement());
  bar  = new JProgressBar();
  bar.setMaximum(200);
  bar.setMinimum(0);
  bar.setStringPainted(true);
    
  this.getContentPane().add(bar, BorderLayout.CENTER);
  t = new Thread(new Traitement());
  t.start();  
      
  
  this.setVisible(true); 
  
}

class Traitement implements Runnable{   
  public void run(){
  //  launch.setEnabled(false);
       
    for(int val = 0; val <= 300; val++){
      bar.setValue(val);
      try {
        Thread.sleep(3);
      } catch (InterruptedException e) {
        // TODO Auto-generated catch block
      e.printStackTrace();
      }
    }
    dispose();
  }   
}

  
}
