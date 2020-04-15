/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine;

/**
 *
 * @author Brayan
 */
public class Pelicula {
    private String nombre, director, año;

    public Pelicula(String n, String d, String a) {
        nombre=n;
        director=d;
        año=a;
    }
    public String toString(){ 
        return ("Nombre: "+nombre+"\n Director: "+director+"\n Año: "+año); 
    }   
}
