/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.rensis.rensisfit;

import com.rensis.models.Exercici;
import com.rensis.models.Workout;
import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author Wilde
 * clase Main de la aplicación
 */
public class RensisFit {
    
    public static void main(String[] args) {
        // Initialize main screen
        MainScreen mainScreen = new MainScreen();

        // Configuration
        mainScreen.setLocationRelativeTo(null);
        mainScreen.setVisible(true);
        mainScreen.setResizable(false);
    }
    
    public static String[] exerciciArrayListToString(ArrayList<Exercici> exercisesArrayList) {
        if (exercisesArrayList == null || exercisesArrayList.isEmpty()) {
            return new String[]{"--Select--"};
        }

        // Convert to String()
        String[] formattedList = new String[exercisesArrayList.size() + 1];
        formattedList[0] = "--Select--";

        int i = 1;
        for (Exercici e : exercisesArrayList) {
            formattedList[i++] = e.getNomExercici();
        }
        
        return formattedList;
    }
    
    public static String[] workoutsArrayListToString(ArrayList<Workout> workoutsArrayList) {
        if (workoutsArrayList == null || workoutsArrayList.isEmpty()) {
            return new String[]{"--Select--"};
        }

        // Avoid duplicated options using HasSet
        HashSet<String> uniqueComments = new HashSet<>();
        uniqueComments.add("--Select--");

        for (Workout w : workoutsArrayList) {
            String comment = w.getComments();
            if (comment != null && !comment.trim().isEmpty()) {
                uniqueComments.add(comment.trim()); // Evitar espacios innecesarios
            }
        }

        // HashSet to String[]
        return uniqueComments.toArray(new String[0]);
    }
}