package com.umg.circlelines;

import java.awt.Graphics;
import javax.swing.JPanel;

public class PanelDraw extends JPanel {

  public void paintComponent(Graphics g) {
    super.paintComponent(g);

    DrawPrincipalCorner(g);
  }

  private void DrawPrincipalCorner(Graphics g) {

    int heigth = getHeight();
    int width = getWidth();

    int widthFactor = width / 15;
    int heightFactor = heigth / 15;
    int normalGrowX, superGrowX, normalGrowY, superGrowY;

    int i = 0;
    while (i < 15) {

      normalGrowX = widthFactor * i;
      normalGrowY = heightFactor * i;
      superGrowX = widthFactor * (i + 1);
      superGrowY = heightFactor * (i + 1);

      g.drawLine(0, normalGrowY, superGrowX, heigth);
      g.drawLine(normalGrowX, 0, width, superGrowY);
      g.drawLine(normalGrowX, heigth, width, heigth - superGrowY);
      g.drawLine(width - superGrowX, 0, 0, superGrowY);
      i++;
    }
  }
}
