package com.J_Esquired.pablo;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Pablo extends JPanel
{
   static JFrame pabloFrame;
   public Pablo()
   {
      super();
   }
   
   public static void main(String args[])
   {
      pabloFrame = new JFrame("beans");
      pabloFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      pabloFrame.setSize(1280, 720);
      pabloFrame.setVisible(true);
      try
      {
         Thread.sleep(2000);
      }
      catch (InterruptedException e)
      {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
   }
}
