package com.example.recetario;

public class Recetas {

    private String nombreReceta;
    private String ingredientesRecetas;
    private String Preparacion;
    private String Receta;
    private int Thumbnail;


    public Recetas(String nombre, String ingredientesReceta, String preparacion, String receta, int thumbnail){

        nombreReceta = nombre;
        ingredientesRecetas = ingredientesReceta;
        Preparacion = preparacion;
        Receta = receta;
        Thumbnail = thumbnail;

    }


    public  String getNombreReceta(){

        return nombreReceta;
    }
    public String getingredientesRecetas(){
        return ingredientesRecetas;
    }

    public String getPreparacion(){
        return Preparacion;
    }

    public String getReceta(){
        return Receta;
    }

    public int getThumbnail(){
        return Thumbnail;
    }
}
