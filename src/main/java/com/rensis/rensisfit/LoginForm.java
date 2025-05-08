/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.rensis.rensisfit;
import com.rensis.styles.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Wilde
 * Clase para la creación del formulario de inicio de sesión
 */
public class LoginForm extends javax.swing.JDialog {

    private MainScreen mainScreen;

    // Login form class
    public LoginForm(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        
        // Setting undecorated form
        setUndecorated(true);
        
        // Setting parent variable
        this.mainScreen = (MainScreen)parent;
        initComponents();
        
        // Styling the components borders
        loginPanel.setBorder(UIStyles.DEFAULT_BORDER_3PX);
        emailField.setBorder(UIStyles.DEFAULT_BORDER_3PX);
        passwordField.setBorder(UIStyles.DEFAULT_BORDER_3PX);
        loginButton.setBorder(UIStyles.DEFAULT_BORDER_3PX);
        cancelButton.setBorder(UIStyles.DEFAULT_BORDER_3PX);
        
        // Setting location of the form
        setLocationRelativeTo(mainScreen);
        
        passwordField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    login();
                }
            }
        });
    
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginPanel = new RoundedPanel();
        emailLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        emailField = new RoundedTextField(1);
        loginButton = new RoundedButton("");
        cancelButton = new RoundedButton("");
        passwordField = new RoundedPasswordField(1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        loginPanel.setBackground(new java.awt.Color(230, 230, 230));
        loginPanel.setFont(new java.awt.Font("Poppins Medium", 0, 24)); // NOI18N

        emailLabel.setFont(UIStyles.getFont(28)
        );
        emailLabel.setForeground(new java.awt.Color(0, 0, 0));
        emailLabel.setText("Email");

        passwordLabel.setFont(UIStyles.getFont(28));
        passwordLabel.setForeground(new java.awt.Color(0, 0, 0));
        passwordLabel.setText("Password");

        emailField.setBackground(new java.awt.Color(255, 255, 255));
        emailField.setFont(UIStyles.getFont(28));
        emailField.setForeground(new java.awt.Color(0, 0, 0));
        emailField.setMaximumSize(new java.awt.Dimension(64, 22));

        loginButton.setBackground(new java.awt.Color(254, 194, 209));
        loginButton.setFont(UIStyles.getFont(28));
        loginButton.setForeground(new java.awt.Color(0, 0, 0));
        loginButton.setText("Login");
        loginButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginButton.setFocusable(false);
        loginButton.setMaximumSize(new java.awt.Dimension(104, 55));
        loginButton.setMinimumSize(new java.awt.Dimension(104, 55));
        loginButton.setPreferredSize(new java.awt.Dimension(104, 55));
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        cancelButton.setBackground(new java.awt.Color(103, 103, 103));
        cancelButton.setFont(UIStyles.getFont(28));
        cancelButton.setForeground(new java.awt.Color(255, 255, 255));
        cancelButton.setText("Cancel");
        cancelButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelButton.setFocusable(false);
        cancelButton.setMaximumSize(new java.awt.Dimension(130, 55));
        cancelButton.setMinimumSize(new java.awt.Dimension(130, 55));
        cancelButton.setPreferredSize(new java.awt.Dimension(130, 55));
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        passwordField.setBackground(new java.awt.Color(255, 255, 255));
        passwordField.setFont(UIStyles.getFont(28));
        passwordField.setForeground(new java.awt.Color(0, 0, 0));
        passwordField.setMaximumSize(new java.awt.Dimension(64, 22));

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(emailLabel)
                    .addComponent(passwordLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(emailField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                        .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(passwordField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 97, Short.MAX_VALUE))
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(emailLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(emailField, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLabel)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        
        // Resetting the form
        emailField.setText("");
        passwordField.setText("");
        
        // Hiding the form
        setVisible(false);
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        login();
    }//GEN-LAST:event_loginButtonActionPerformed

    /*
    *
    * Metodo para inicio de sesión
    *
    *
    */
    private void login(){
        // Obtener valores del formulario
        char[] passwordArray = passwordField.getPassword();
        String email = emailField.getText();
        String password = new String(passwordArray); // Convertir a String seguro

        // Validations
        if (email.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese su email y contraseña.", "Error", JOptionPane.ERROR_MESSAGE);
            return; // Salir del método si hay campos vacíos
        }

        // Validate email format
        if (!isValidEmail(email)) {
            JOptionPane.showMessageDialog(this, "Ingrese un email válido.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Calling login handler
        mainScreen.loginHandler(email, password.toCharArray()); // Usar toCharArray() para mayor seguridad

        // Cleaning password field for security reasons
        passwordField.setText("");

        // Hide form after login try
        setVisible(false);
    }
    
    private boolean isValidEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{1,}$";
        return email.matches(emailRegex);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton cancelButton;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JButton loginButton;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    // End of variables declaration//GEN-END:variables
}
