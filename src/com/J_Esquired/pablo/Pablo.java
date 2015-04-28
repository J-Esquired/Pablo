package com.J_Esquired.pablo;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Pablo
{
   static int width, height;
   static JFrame pabloFrame;
   static Graphics2D graphics;
   public Pablo()
   {
      super();
   }
   
   public static void main(String args[])
   {
      pabloFrame = new JFrame("beans");
      pabloFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      width = 1280;
      height = 720;
      pabloFrame.setSize(width, height);
      pabloFrame.setLayout(null);
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
      BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
      graphics = image.createGraphics();
      graphics.setColor(new Color(0xff0000));
      graphics.drawOval(50,70,70,50);
      graphics.draw(new java.awt.Rectangle(width, height));
      System.out.println("lol what");
      pabloFrame.getContentPane().add(new JLabel(new ImageIcon(image)));
//      JLabel wat = new JLabel(new ImageIcon("map_mockup.png"));
      JLabel wat = new JLabel("oh man");
      pabloFrame.getContentPane().add(wat);
      wat.setLocation(50,50);
      wat.setVisible(true);
//      pabloFrame.getContentPane().setBackground(new Color(0x00ff00));
   }
}
