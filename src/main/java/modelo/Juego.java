/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.List;
import javafx.scene.image.Image;

/**
 *
 * @author Olivier MZ
 */
public class Juego {
    private String Titulo;
    private String Descripcion;
    private List<Image> Screenshot;
    private enum Generos{ACCION,ESTRATEGIA,HORROR,INDIE,DEPORTES,MULTIJUGADOR} ;
    private String Desarrolladores;
    private List<Reseña> Reseñas;

    public Juego(String Titulo, String Descripcion, List<Image> Screenshot, String Desarrolladores, List<Reseña> Reseñas) {
        this.Titulo = Titulo;
        this.Descripcion = Descripcion;
        this.Screenshot = Screenshot;
        this.Desarrolladores = Desarrolladores;
        this.Reseñas = Reseñas;
    }

    
    
    
    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public List<Image> getScreenshot() {
        return Screenshot;
    }

    public void setScreenshot(List<Image> Screenshot) {
        this.Screenshot = Screenshot;
    }

    public String getDesarrolladores() {
        return Desarrolladores;
    }

    public void setDesarrolladores(String Desarrolladores) {
        this.Desarrolladores = Desarrolladores;
    }

    public List<Reseña> getReseñas() {
        return Reseñas;
    }

    public void setReseñas(List<Reseña> Reseñas) {
        this.Reseñas = Reseñas;
    }
    
}
