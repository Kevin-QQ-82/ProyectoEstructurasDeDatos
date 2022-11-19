/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.Date;
import java.util.List;
import javafx.scene.image.Image;

/**
 *
 * @author Olivier MZ
 */
public class Reseña {
    private String Titulo;
    private String Contenido;
    private List<Image> Screenshots;
    private int Puntuacion;
    private String Autor;
    private Date Fecha;

    public Reseña(String Titulo, String Contenido, List<Image> Screenshots, int Puntuacion, String Autor, Date Fecha) {
        this.Titulo = Titulo;
        this.Contenido = Contenido;
        this.Screenshots = Screenshots;
        this.Puntuacion = Puntuacion;
        this.Autor = Autor;
        this.Fecha = Fecha;
    }

    
    
    
    
    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getContenido() {
        return Contenido;
    }

    public void setContenido(String Contenido) {
        this.Contenido = Contenido;
    }

    public List<Image> getScreenshots() {
        return Screenshots;
    }

    public void setScreenshots(List<Image> Screenshots) {
        this.Screenshots = Screenshots;
    }

    public int getPuntuacion() {
        return Puntuacion;
    }

    public void setPuntuacion(int Puntuacion) {
        this.Puntuacion = Puntuacion;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }
    
}
