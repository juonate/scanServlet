/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jom.scan;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;
/**
 *
 * @author Juan
 */
class ClipedPanel
  extends JPanel
{
  private Image image;
  int imageWidth;
  int imageHeight;
  BufferedImage imageb;
  Dimension size;
  Rectangle clip;
  boolean showClip;
  
  ClipedPanel(Image image)
  {
    this.image = image;
    this.imageWidth = image.getWidth(null);
    this.imageHeight = image.getHeight(null);
    
    this.imageb = ((BufferedImage)image);
    this.size = new Dimension(this.imageb.getWidth(), this.imageb.getHeight());
    this.showClip = false;
  }
  
  protected void paintComponent(Graphics g)
  {
    super.paintComponent(g);
    Graphics2D g2 = (Graphics2D)g;
    g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, 
      RenderingHints.VALUE_ANTIALIAS_ON);
    int x = (getWidth() - this.size.width) / 2;
    int y = (getHeight() - this.size.height) / 2;
    



    g2.drawImage(this.imageb, x, y, this);
  }
  
  public ClipedPanel getPanel()
  {
    return this;
  }
}
