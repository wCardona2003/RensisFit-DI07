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
 * Clase para definir el estilo redondeado del campo de texto
 */
public class RoundedTextField extends JTextField {
    private int cornerRadius = 15; // Ajusta el radio de las esquinas

    public RoundedTextField(int columns) {
        super(columns);
        setOpaque(false);
        setBorder(new EmptyBorder(5, 10, 5, 10)); // Margen interno para que el texto no toque el borde
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Dibujar fondo con esquinas redondeadas
        g2.setColor(getBackground());
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), cornerRadius, cornerRadius);

        super.paintComponent(g);
        g2.dispose();
    }

}
