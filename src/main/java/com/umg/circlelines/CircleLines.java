package com.umg.circlelines;

import javax.swing.JFrame;

public class CircleLines {
  public static void main(String[] args) {

    PanelDraw panel = new PanelDraw();

    // Crea un objeto JFrame que contiene el marco
    JFrame app = new JFrame();

    app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    app.add(panel);
    app.setSize(1000,1000);
    app.setVisible(true);
  }
}
