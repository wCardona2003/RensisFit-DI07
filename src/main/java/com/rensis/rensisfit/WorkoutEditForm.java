/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.rensis.rensisfit;

import com.rensis.data.DataAccess;
import com.rensis.models.Exercici;
import com.rensis.models.Usuari;
import com.rensis.models.Workout;
import com.rensis.styles.*;
import java.awt.Component;
import java.awt.Dimension;

import javax.swing.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import org.jdesktop.swingx.JXDatePicker;

/**
 *
 * @author Wilde
 * Clase para la creación del formulario que permite editar un workout
 */
public class WorkoutEditForm extends javax.swing.JDialog {

    private final MainScreen mainScreen;
    private final ArrayList<Exercici> allExercises;
    private final Usuari user;
    private JXDatePicker picker = null;
    private final ArrayList<Exercici> selectedExercises = new ArrayList<>();
    private final SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSSSSS");

    private Optional<Workout> selectedWorkout = Optional.empty();
    private String action = "create";

    /**
     * Constructor for creating a new workout.
     */
    public WorkoutEditForm(java.awt.Frame parent, boolean modal, Usuari user) {
        super(parent, modal);
        this.allExercises = Optional.ofNullable(DataAccess.getAllExercicis()).orElse(new ArrayList<>());
        this.user = user;
        this.mainScreen = (MainScreen) parent;

        setUndecorated(true);
        initComponents();
        setLocationRelativeTo(mainScreen);

        initComboBox();
        initDatePicker();
        applyStyles();

        deleteButton.setVisible(false); // Hide delete button on new workouts
    }

    /**
    * Constructor for editing an existing workout.
    */
    public WorkoutEditForm(java.awt.Frame parent, boolean modal, Usuari user, Workout workout) {
        super(parent, modal);
        this.allExercises = Optional.ofNullable(DataAccess.getAllExercicis()).orElse(new ArrayList<>());
        this.user = user;
        this.mainScreen = (MainScreen) parent;
        this.selectedWorkout = Optional.of(workout);
        this.action = "edit";

        // Avoid NullPointerException
        selectedExercises.addAll(Optional.ofNullable(DataAccess.getExercicisPerWorkout(workout)).orElse(new ArrayList<>()));

        setUndecorated(true);
        initComponents();
        setLocationRelativeTo(mainScreen);

        // Initialize combo box with exercises
        initComboBox();
        
        // Initialize Date Picker
        initDatePicker();
        
        // Apply styles
        applyStyles();

        addExsitingWorkout.setVisible(false);
        workoutName.setText(workout.getComments());

        try {
            picker.setDate(dateFormatter.parse(workout.getForDate()));
        } catch (ParseException e) {
            picker.setDate(Calendar.getInstance().getTime());
        }

        loadSelectedExercises();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        editPanel = new javax.swing.JPanel();
        saveButton = new RoundedButton("");
        exitButton = new RoundedButton("");
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        uploadPhotoPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        removePhotoButton = new RoundedButton("");
        exerciseSelector = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        scrollPaneDateFor = new javax.swing.JScrollPane();
        dateForPanel = new javax.swing.JPanel();
        addExerciseButton = new RoundedButton("");
        jLabel6 = new javax.swing.JLabel();
        workoutName = new RoundedTextField(1);
        exerciseListScrollPane = new javax.swing.JScrollPane();
        exerciseListPanel = new javax.swing.JPanel();
        removeExerciseButton = new RoundedButton("");
        deleteButton = new RoundedButton("");
        addExsitingWorkout = new RoundedButton("");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        editPanel.setBackground(new java.awt.Color(230, 230, 230));
        editPanel.setFont(new java.awt.Font("Poppins Medium", 0, 24)); // NOI18N
        editPanel.setMaximumSize(new java.awt.Dimension(898, 328));
        editPanel.setMinimumSize(new java.awt.Dimension(898, 328));
        editPanel.setPreferredSize(new java.awt.Dimension(898, 328));

        saveButton.setBackground(new java.awt.Color(254, 194, 209));
        saveButton.setFont(UIStyles.getFont(18));
        saveButton.setForeground(new java.awt.Color(0, 0, 0));
        saveButton.setText("Save Workout");
        saveButton.setBorder(null);
        saveButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        saveButton.setFocusable(false);
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        exitButton.setBackground(new java.awt.Color(254, 194, 209));
        exitButton.setFont(UIStyles.getFont(18));
        exitButton.setForeground(new java.awt.Color(0, 0, 0));
        exitButton.setText("Exit");
        exitButton.setBorder(null);
        exitButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitButton.setFocusable(false);
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(UIStyles.getFont(24));
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Name");

        jLabel2.setFont(UIStyles.getFont(36));
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Adding workout");

        uploadPhotoPanel.setBackground(new java.awt.Color(130, 130, 130));
        uploadPhotoPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        uploadPhotoPanel.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        uploadPhotoPanel.setMinimumSize(new java.awt.Dimension(80, 16));

        jLabel4.setFont(UIStyles.getFont(18));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Click to upload");

        javax.swing.GroupLayout uploadPhotoPanelLayout = new javax.swing.GroupLayout(uploadPhotoPanel);
        uploadPhotoPanel.setLayout(uploadPhotoPanelLayout);
        uploadPhotoPanelLayout.setHorizontalGroup(
            uploadPhotoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
            .addGroup(uploadPhotoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(uploadPhotoPanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        uploadPhotoPanelLayout.setVerticalGroup(
            uploadPhotoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
            .addGroup(uploadPhotoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(uploadPhotoPanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jLabel3.setFont(UIStyles.getFont(24));
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Photo");

        removePhotoButton.setBackground(new java.awt.Color(254, 194, 209));
        removePhotoButton.setFont(UIStyles.getFont(18));
        removePhotoButton.setForeground(new java.awt.Color(0, 0, 0));
        removePhotoButton.setText("Remove");
        removePhotoButton.setBorder(null);
        removePhotoButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        removePhotoButton.setFocusable(false);

        exerciseSelector.setFont(UIStyles.getFont(18));

        jLabel5.setFont(UIStyles.getFont(24));
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Exercises List");

        scrollPaneDateFor.setBorder(null);
        scrollPaneDateFor.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPaneDateFor.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        dateForPanel.setBackground(new java.awt.Color(230, 230, 230));
        dateForPanel.setLayout(new java.awt.GridLayout(DataAccess.getAllExercicis().size(), 1));
        scrollPaneDateFor.setViewportView(dateForPanel);

        addExerciseButton.setBackground(new java.awt.Color(254, 194, 209));
        addExerciseButton.setFont(UIStyles.getFont(18));
        addExerciseButton.setForeground(new java.awt.Color(0, 0, 0));
        addExerciseButton.setText("Add");
        addExerciseButton.setBorder(null);
        addExerciseButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addExerciseButton.setFocusable(false);
        addExerciseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addExerciseButtonActionPerformed(evt);
            }
        });

        jLabel6.setFont(UIStyles.getFont(24));
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("For date");

        workoutName.setFont(UIStyles.getFont(18));
        workoutName.setBorder(null);

        exerciseListScrollPane.setBorder(null);

        exerciseListPanel.setLayout(new java.awt.GridLayout(allExercises.size(), 1));
        exerciseListScrollPane.setViewportView(exerciseListPanel);

        removeExerciseButton.setBackground(new java.awt.Color(254, 194, 209));
        removeExerciseButton.setFont(UIStyles.getFont(18));
        removeExerciseButton.setForeground(new java.awt.Color(0, 0, 0));
        removeExerciseButton.setText("Remove");
        removeExerciseButton.setBorder(null);
        removeExerciseButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        removeExerciseButton.setFocusable(false);
        removeExerciseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeExerciseButtonActionPerformed(evt);
            }
        });

        deleteButton.setBackground(new java.awt.Color(255, 102, 102));
        deleteButton.setFont(UIStyles.getFont(18));
        deleteButton.setForeground(new java.awt.Color(255, 255, 255));
        deleteButton.setText("Delete Workout");
        deleteButton.setBorder(null);
        deleteButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteButton.setFocusable(false);
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        addExsitingWorkout.setBackground(new java.awt.Color(254, 194, 209));
        addExsitingWorkout.setFont(UIStyles.getFont(18));
        addExsitingWorkout.setForeground(new java.awt.Color(0, 0, 0));
        addExsitingWorkout.setText("Add existing workout");
        addExsitingWorkout.setBorder(null);
        addExsitingWorkout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addExsitingWorkout.setFocusable(false);
        addExsitingWorkout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addExsitingWorkoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout editPanelLayout = new javax.swing.GroupLayout(editPanel);
        editPanel.setLayout(editPanelLayout);
        editPanelLayout.setHorizontalGroup(
            editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(editPanelLayout.createSequentialGroup()
                        .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(editPanelLayout.createSequentialGroup()
                                .addComponent(removePhotoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(editPanelLayout.createSequentialGroup()
                                .addComponent(uploadPhotoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(editPanelLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel6)
                                            .addComponent(scrollPaneDateFor, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editPanelLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(workoutName, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5)))
                        .addGap(18, 18, 18))
                    .addGroup(editPanelLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(136, 136, 136)))
                .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editPanelLayout.createSequentialGroup()
                        .addComponent(addExerciseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(removeExerciseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(exerciseListScrollPane)
                    .addComponent(exerciseSelector, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addExsitingWorkout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        editPanelLayout.setVerticalGroup(
            editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3))
                    .addComponent(addExsitingWorkout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editPanelLayout.createSequentialGroup()
                        .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(exerciseSelector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(removeExerciseButton, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                            .addComponent(addExerciseButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(exerciseListScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(74, Short.MAX_VALUE))
                    .addGroup(editPanelLayout.createSequentialGroup()
                        .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(editPanelLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(workoutName, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(scrollPaneDateFor, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11))
                            .addComponent(uploadPhotoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(removePhotoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(editPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(editPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

        // Apply styles to our form
        private void applyStyles() {
            editPanel.setBorder(UIStyles.DEFAULT_BORDER_2PX);
            uploadPhotoPanel.setBorder(UIStyles.DEFAULT_BORDER_2PX);
            saveButton.setBorder(UIStyles.DEFAULT_BORDER_2PX_BUTTON);
            exitButton.setBorder(UIStyles.DEFAULT_BORDER_2PX_BUTTON);
            removePhotoButton.setBorder(UIStyles.DEFAULT_BORDER_2PX_BUTTON);
            addExerciseButton.setBorder(UIStyles.DEFAULT_BORDER_2PX_BUTTON);
            removeExerciseButton.setBorder(UIStyles.DEFAULT_BORDER_2PX_BUTTON);
            deleteButton.setBorder(UIStyles.DEFAULT_BORDER_2PX_BUTTON);
            picker.setBorder(UIStyles.DEFAULT_BORDER_2PX);
            workoutName.setBorder(UIStyles.DEFAULT_BORDER_2PX);
            exerciseListScrollPane.setBorder(UIStyles.DEFAULT_BORDER_2PX);
            exerciseSelector.setBorder(UIStyles.DEFAULT_BORDER_2PX);
            addExsitingWorkout.setBorder(UIStyles.DEFAULT_BORDER_2PX);
        }


    // Helper method to initialize the combo box with exercise options
    private void initComboBox() {
        DefaultComboBoxModel model = new DefaultComboBoxModel<>(RensisFit.exerciciArrayListToString(allExercises));
        exerciseSelector.setModel(model);
    }
    
    // Initialize date picker
    private void initDatePicker() {
        picker = new JXDatePicker();
        picker.setDate(Calendar.getInstance().getTime());
        picker.setFormats(dateFormatter);
        dateForPanel.add(picker);
    }
    
    // Method to load the exercises already selected for editing
    private void loadSelectedExercises() {
        for (Exercici e : selectedExercises) {
            addExercisePanel(e);
        }
    }
    
    // Add Excercise to user panel
    private void addExercisePanel(Exercici e) {
        JPanel selectedPanel = new JPanel();
        selectedPanel.setPreferredSize(new Dimension(100, 20));
        JLabel selectedPanelLabel = new JLabel(e.getNomExercici(), SwingConstants.CENTER);
        selectedPanelLabel.setFont(UIStyles.getFont(18));
        selectedPanel.add(selectedPanelLabel);
        exerciseListPanel.add(selectedPanel);
        exerciseListPanel.revalidate();
        exerciseListPanel.repaint();
    }

    // Method when the Save button is clicked for adding or editing a workout
    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        String workoutText = workoutName.getText().trim();
        if (workoutText.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Workout name cannot be empty.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (selectedExercises.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please add at least one exercise.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (action.equals("edit")) {
            selectedWorkout.ifPresent(workout -> {
                workout.setComments(workoutText);
                workout.setForDate(dateFormatter.format(picker.getDate()));
                DataAccess.updateWorkout(workout, selectedExercises);
            });
        } else {
            Workout newWorkout = new Workout();
            newWorkout.setComments(workoutText);
            newWorkout.setIdUsuari(user.getId());
            newWorkout.setForDate(dateFormatter.format(picker.getDate()));
            DataAccess.insertWorkout(newWorkout, selectedExercises);
        }

        setVisible(false);
    }//GEN-LAST:event_saveButtonActionPerformed
    
    // Method when the Cancel button is clicked
    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        setVisible(false);
    }//GEN-LAST:event_exitButtonActionPerformed
    
    // Method when the Add Exercise button is clicked
    private void addExerciseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addExerciseButtonActionPerformed
        String selectedExerciseName = (String) exerciseSelector.getSelectedItem();
        allExercises.stream()
            .filter(e -> e.getNomExercici().equals(selectedExerciseName) && !selectedExercises.contains(e))
            .findFirst()
            .ifPresent(e -> {
                selectedExercises.add(e);
                addExercisePanel(e);
            });
    }//GEN-LAST:event_addExerciseButtonActionPerformed

    // Method to remove an exercise from exercises lists
    private void removeExerciseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeExerciseButtonActionPerformed
        String selectedExerciseName = (String) exerciseSelector.getSelectedItem();
        selectedExercises.stream()
            .filter(e -> e.getNomExercici().equals(selectedExerciseName))
            .findFirst()
            .ifPresent(exerciseToRemove -> {
                selectedExercises.remove(exerciseToRemove);
                for (Component c : exerciseListPanel.getComponents()) {
                    if (c instanceof JPanel panel) {
                        if (panel.getComponent(0) instanceof JLabel label && label.getText().equals(selectedExerciseName)) {
                            exerciseListPanel.remove(panel);
                            break;
                        }
                    }
                }
                exerciseListPanel.revalidate();
                exerciseListPanel.repaint();
            });
    }//GEN-LAST:event_removeExerciseButtonActionPerformed
    
    // Method when Delete button clicked to delete a workout
    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        selectedWorkout.ifPresent(workout -> {
            DataAccess.deleteWorkout(workout.getId());
            setVisible(false);
        });
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void addExsitingWorkoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addExsitingWorkoutActionPerformed
        new ExistingWorkoutForm(this.mainScreen, true, user.getId()).setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_addExsitingWorkoutActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addExerciseButton;
    private javax.swing.JButton addExsitingWorkout;
    private javax.swing.JPanel dateForPanel;
    private javax.swing.JButton deleteButton;
    private javax.swing.JPanel editPanel;
    private javax.swing.JPanel exerciseListPanel;
    private javax.swing.JScrollPane exerciseListScrollPane;
    private javax.swing.JComboBox<String> exerciseSelector;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton removeExerciseButton;
    private javax.swing.JButton removePhotoButton;
    private javax.swing.JButton saveButton;
    private javax.swing.JScrollPane scrollPaneDateFor;
    private javax.swing.JPanel uploadPhotoPanel;
    private javax.swing.JTextField workoutName;
    // End of variables declaration//GEN-END:variables
}
