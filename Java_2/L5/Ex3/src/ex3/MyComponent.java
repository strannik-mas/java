/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3;

import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.ImageIO;
import javax.swing.*;

public class MyComponent extends JComponent {
    BufferedImage img;
    Image       scImg;
    public MyComponent(InputStream in) {
        try {
            img = ImageIO.read(in);
            scImg = img.getScaledInstance(500, 400, Image.SCALE_DEFAULT);
        } catch (IOException ex) {
            System.out.println("Image error! "+ex);
        }
    }
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.drawImage(scImg, 0, 0, null);
    }
}
