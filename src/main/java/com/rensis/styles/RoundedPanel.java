/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rensis.styles;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author Wilde
 * Clase para definir el estilo redondeado de los paneles
 */
public class RoundedPanel extends JPanel {
    private int cornerRadius = 25; // Ajusta el radio de las esquinas

    public RoundedPanel() {
        setOpaque(false); // Hace que el fondo respete la curvatura
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Dibujar fondo redondeado
        g2.setColor(getBackground());
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), cornerRadius, cornerRadius);

        super.paintComponent(g);
        g2.dispose();
    }
}