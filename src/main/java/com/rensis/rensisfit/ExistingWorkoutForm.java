/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.rensis.rensisfit;

import com.rensis.data.DataAccess;
import com.rensis.models.Workout;
import com.rensis.styles.*;
import javax.swing.*;
import java.util.ArrayList;

/**
 *
 * @author Wilde
 * Clase para la creación del dialogo cuando existe un workout
 */
public class ExistingWorkoutForm extends javax.swing.JDialog {

    private MainScreen mainScreen;
    private ArrayList<Workout> workouts;
    private int userId;

    /**
     * Constructor for creating a new workout.
     * @param parent
     * @param modal
     */
    public ExistingWorkoutForm(java.awt.Frame parent, boolean modal, int userId) {
        super(parent, modal);
        this.mainScreen = (MainScreen) parent;
        this.workouts = DataAccess.getAllWorkouts();
        this.userId = userId;

        setUndecorated(true);
        initComponents();
        
        setLocationRelativeTo(mainScreen);
        
        // Styling
        editPanel.setBorder(UIStyles.DEFAULT_BORDER_2PX);
        workoutsComboBox.setBorder(UIStyles.DEFAULT_BORDER_2PX);
        addButton.setBorder(UIStyles.DEFAULT_BORDER_2PX_BUTTON);
        cancelButton.setBorder(UIStyles.DEFAULT_BORDER_2PX_BUTTON);
        
        // Initialize combo box with exercises
        initComboBox();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        editPanel = new javax.swing.JPanel();
        workoutsComboBox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        cancelButton = new RoundedButton("");
        addButton = new RoundedButton("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        editPanel.setBackground(new java.awt.Color(230, 230, 230));
        editPanel.setFont(new java.awt.Font("Poppins Medium", 0, 24)); // NOI18N
        editPanel.setMaximumSize(new java.awt.Dimension(898, 328));
        editPanel.setMinimumSize(new java.awt.Dimension(898, 328));
        editPanel.setPreferredSize(new java.awt.Dimension(898, 328));

        workoutsComboBox.setFont(UIStyles.getFont(18));
        workoutsComboBox.setForeground(new java.awt.Color(0, 0, 0));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(UIStyles.getFont(24));
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Workout");

        cancelButton.setBackground(new java.awt.Color(254, 194, 209));
        cancelButton.setFont(UIStyles.getFont(18));
        cancelButton.setForeground(new java.awt.Color(0, 0, 0));
        cancelButton.setText("Cancel");
        cancelButton.setBorder(null);
        cancelButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelButton.setFocusable(false);
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        addButton.setBackground(new java.awt.Color(254, 194, 209));
        addButton.setFont(UIStyles.getFont(18));
        addButton.setForeground(new java.awt.Color(0, 0, 0));
        addButton.setText("Add");
        addButton.setBorder(null);
        addButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addButton.setFocusable(false);
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout editPanelLayout = new javax.swing.GroupLayout(editPanel);
        editPanel.setLayout(editPanelLayout);
        editPanelLayout.setHorizontalGroup(
            editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(workoutsComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        editPanelLayout.setVerticalGroup(
            editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(workoutsComboBox)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(editPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(editPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        setVisible(false);
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        try {
                Workout workout = getWorkoutOption();

                // Verificar si el usuario ha seleccionado un workout válido
                if (workout == null || workout.getComments() == null || workout.getComments().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Por favor seleccione un workout valido.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                workout.setIdUsuari(userId);

                // Intentar insertar en la base de datos
                try {
                    DataAccess.insertWorkout(workout, DataAccess.getExercicisPerWorkout(workout));
                    JOptionPane.showMessageDialog(this, "Workout añadido correctamente", "Success", JOptionPane.INFORMATION_MESSAGE);
                    setVisible(false);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "Error al añadir workout: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
                    e.printStackTrace();
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Ha ocurido un error inesperado: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                ex.printStackTrace();
            }
    }//GEN-LAST:event_addButtonActionPerformed

    // Helper method to initialize the combo box with exercise options
    private void initComboBox() {
        DefaultComboBoxModel model = new DefaultComboBoxModel<>(RensisFit.workoutsArrayListToString(workouts));
        workoutsComboBox.setModel(model);
        for (String s : RensisFit.workoutsArrayListToString(workouts)){
            System.out.println(s);
        }
    }
    
    private Workout getWorkoutOption(){
        Object selectedItem = workoutsComboBox.getSelectedItem();

        if (selectedItem == null) {
            return null; // Retorna null si no hay nada seleccionado
        }

        String selectedWorkout = selectedItem.toString();

        for (Workout w : workouts) {
            if (w.getComments().equals(selectedWorkout)) {
                return w;
            }
        }

        return null; // Retorna null si no encuentra coincidencia
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton cancelButton;
    private javax.swing.JPanel editPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> workoutsComboBox;
    // End of variables declaration//GEN-END:variables
}
