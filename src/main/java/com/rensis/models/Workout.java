/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rensis.models;

/**
 *
 * @author Wilde
 * Clase para la deficición del objeto workout
 */
public class Workout {
    
    //Variables
    private int Id;
    private String ForDate;
    private int IdUsuari;
    private String Comments;
    
    //Constructor
    public Workout(){
    
    }

    //Getters and Setters
    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getForDate() {
        return ForDate;
    }

    public void setForDate(String ForDate) {
        this.ForDate = ForDate;
    }

    public int getIdUsuari() {
        return IdUsuari;
    }

    public void setIdUsuari(int IdUsuari) {
        this.IdUsuari = IdUsuari;
    }
    
    //Method to get the comments of the workout
    public String getComments(){
        if(this.Comments != null || this.Comments != ""){
            return this.Comments;
        } else {
            return "No comments";
        }
        
    }

    public void setComments(String comments){
        this.Comments = comments;
    }
    
}
    
    
