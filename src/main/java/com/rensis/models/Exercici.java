/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rensis.models;

/**
 *
 * @author Wilde
 * Clase para la deficición del objeto ejercicio
 */
public class Exercici {
    
    //Variables
    private int Id;
    private String NomExercici;
    private String Descripcio;
    private String DemoFoto;
    
    //Constructor
    public Exercici(){
    
    }
    
    //Getters and Setters
    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNomExercici() {
        return NomExercici;
    }

    public void setNomExercici(String NomExercici) {
        this.NomExercici = NomExercici;
    }

    public String getDescripcio() {
        return Descripcio;
    }

    public void setDescripcio(String Descripcio) {
        this.Descripcio = Descripcio;
    }

    public String getDemoFoto() {
        return DemoFoto;
    }

    public void setDemoFoto(String DemoFoto) {
        this.DemoFoto = DemoFoto;
    }
    
    
}
