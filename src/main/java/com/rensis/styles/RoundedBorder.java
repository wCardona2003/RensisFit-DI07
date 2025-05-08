/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rensis.styles;

import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.RoundRectangle2D;
import javax.swing.border.AbstractBorder;
import java.awt.Color;
import java.awt.Insets;

/**
 *
 * @author Wilde
 * Clase para definir el estilo de los bordes redondeados
 */
public class RoundedBorder extends AbstractBorder {
    private final Color borderColor;
    private final int borderThickness;
    private final int cornerRadius;

    public RoundedBorder(Color borderColor, int borderThickness, int cornerRadius) {
        this.borderColor = borderColor;
        this.borderThickness = borderThickness;
        this.cornerRadius = cornerRadius;
    }

    @Override
    public void paintBorder(java.awt.Component c, Graphics g, int x, int y, int width, int height) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(borderColor);
        g2.setStroke(new BasicStroke(borderThickness));
        g2.draw(new RoundRectangle2D.Float(x + borderThickness / 2f, y + borderThickness / 2f, 
                width - borderThickness, height - borderThickness, cornerRadius, cornerRadius));
    }

    @Override
    public Insets getBorderInsets(java.awt.Component c) {
        return new Insets(cornerRadius, cornerRadius, cornerRadius, cornerRadius);
    }

    @Override
    public Insets getBorderInsets(java.awt.Component c, Insets insets) {
        insets.left = insets.right = insets.top = insets.bottom = cornerRadius;
        return insets;
    }
}
