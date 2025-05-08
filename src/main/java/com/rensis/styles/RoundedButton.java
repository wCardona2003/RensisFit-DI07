/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rensis.styles;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Wilde
 * Clase para definir el estilo de los botones redondeados
 */
public class RoundedButton extends JButton {
    private int cornerRadius = 20; // Ajusta el radio de curvatura

    public RoundedButton(String text) {
        super(text);
        setOpaque(false); // IMPORTANTE: Hace que el botón sea transparente
        setContentAreaFilled(false); // Evita que el fondo cubra el borde redondeado
        setFocusPainted(false); // Evita el borde al hacer clic
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Dibujar fondo redondeado con el color del botón
        g2.setColor(getBackground());
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), cornerRadius, cornerRadius);

        super.paintComponent(g); // Dibuja el texto correctamente
        g2.dispose();
    }
}