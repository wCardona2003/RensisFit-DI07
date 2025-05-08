/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rensis.styles;
import java.awt.Color;
import javax.swing.border.Border;
import java.awt.Font;
import java.awt.FontFormatException;
import java.io.IOException;
import java.io.InputStream;


/**
 *
 * @author Wilde
 * Clase para definir los estilos de la aplicación
 */
public class UIStyles {
    
    // Generated with chatGPT cause didn't knew how to import a local font file
    public static final Font POPPINS;
    
    static {
        // Setting temporary font to null to avoid an error if file not found
        Font tempFont = null;
        
        // Trying to get the font file
        try (InputStream fontStream = UIStyles.class.getResourceAsStream("/fonts/Poppins-Medium.ttf")) {
            if (fontStream != null) {
                // Creating a new font with our file
                tempFont = Font.createFont(Font.TRUETYPE_FONT, fontStream);
            } else {
                throw new IOException("No se pudo encontrar el archivo de fuente.");
            }
            //Endif
            
        } catch (FontFormatException | IOException e) {
            e.printStackTrace();
        }
        
        // If all went good we set our global font variable
        POPPINS = tempFont;
    }
    
    // Method to get out font with an specific size
    public static Font getFont(float size){
        if(POPPINS != null){
            // Helped by stack overflow to get deriveFont utility "https://stackoverflow.com/questions/1043872/are-there-any-built-in-methods-in-java-to-increase-font-size"
            return POPPINS.deriveFont(size);
        } else {
            return null;
        }
        // Endif
    }
    
    // Global variables for border styles
    public static final Border DEFAULT_BORDER_2PX = javax.swing.BorderFactory.createLineBorder(Color.BLACK, 2);
    public static final Border DEFAULT_BORDER_2PX_BUTTON = new RoundedBorder(Color.BLACK, 2, 10);
    public static final Border DEFAULT_BORDER_3PX = new RoundedBorder(Color.BLACK, 3, 10);
    public static final Border BOTTOM_BORDER = javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, Color.BLACK);
    public static final Border BOTTOM_RIGHT_BORDER = javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 2, Color.BLACK);
    public static final Border NO_TOP_BORDER = javax.swing.BorderFactory.createMatteBorder(0, 2, 2, 2, Color.BLACK);
    public static final Border NO_BOTTOM_BORDER = javax.swing.BorderFactory.createMatteBorder(2, 2, 0, 2, Color.BLACK);
    public static final Border NO_LEFT_RIGHT_BORDER = javax.swing.BorderFactory.createMatteBorder(2, 0, 2, 0, Color.BLACK);
    public static final Border NO_TOP_BOTTOM_BORDER = javax.swing.BorderFactory.createMatteBorder(0, 2, 0, 2, Color.BLACK);
    public static final Border NO_TOP_LEFT_BORDER = javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, Color.BLACK);
    
}
