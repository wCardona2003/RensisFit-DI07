/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rensis.models;

/**
 *
 * @author Wilde
 * Clase para la deficición del objeto usuario
 */
public class Usuari {
    
    //Variables
    private int Id;
    private String Nom;
    private String Email;
    private String PasswordHash;
    private Boolean Instructor;
    
    //Constructor
    public Usuari(){}

    
   //Getters and Setters
    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPasswordHash() {
        return PasswordHash;
    }

    public void setPasswordHash(String PasswordHash) {
        this.PasswordHash = PasswordHash;
    }

    public Boolean getInstructor() {
        return Instructor;
    }

    public void setInstructor(Boolean Instructor) {
        this.Instructor = Instructor;
    }
    
    //Method to know if this Usuari instance is an Instructor
    public Boolean isInstructor(){
        if(this.Instructor){
            return true;
        } else {
            return false;
        }
    }
}
