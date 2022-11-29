/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import TDAs.List;
import javafx.scene.image.Image;

//import javax.swing.ImageIcon;

import TDAs.ArrayList;
import TDAs.CircularDoublyLinkedList;
import java.util.PriorityQueue;
import java.util.Iterator;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import static modelo.Reseña.cargarReseñas;


/**
 *
 * @author Olivier MZ
 */
public class Juego {

    private String Titulo;
    private String Descripcion;
    private ArrayList<Image> Screenshot;

    private enum Genero {
        ACCION, ESTRATEGIA, HORROR, INDIE, DEPORTES, MULTIJUGADOR
    };
    private String Desarrolladores;
    private PriorityQueue<Reseña> Reseñas;
    private Date fecha_l;

    public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/YYYY");

    public Juego(String Titulo, String Descripcion, Genero genero, ArrayList<Image> Screenshot, String Desarrolladores, PriorityQueue<Reseña> Reseñas, String fecha) {
        try {
            this.Titulo = Titulo;
            this.Descripcion = Descripcion;
            this.Screenshot = null;
            this.Desarrolladores = Desarrolladores;
            this.Reseñas = null;
            this.fecha_l = sdf.parse(fecha);
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
    }

    //Carga todos los juegos en una Lista Circular Doblemente Enlazada
    public static TDAs.List<Juego> cargarJuegos() {
        TDAs.List<Juego> juegos = new CircularDoublyLinkedList<>();
        juegos.addFirst(new Juego("Apex Lengeds", "Apex Legends is the award-winning, free-to-play Hero Shooter from Respawn Entertainment. Master an ever-growing roster of legendary characters with powerful abilities, and experience strategic squad play and innovative gameplay in the next evolution of Hero Shooter and Battle Royale.", Genero.ACCION, null, "EA Electronics", cargarReseña("Apex Legends"), "2020/11/4"));
        juegos.addLast(new Juego("Doom Eternal", "Hell’s armies have invaded Earth. Become the Slayer in an epic single-player campaign to conquer demons across dimensions and stop the final destruction of humanity. The only thing they fear... is you", Genero.ACCION, null, "Bethesda Softworks", cargarReseña("Doom Eternal"), "2020-Mar-4"));
        juegos.addLast(new Juego("COD Warzone 2.0", "Welcome to Warzone™ 2.0, the massive free-to-play combat arena which now features the brand-new map, Al Mazrah.", Genero.ACCION, null, "Activision", cargarReseña("Warzone 2.0"), "2022-Nov-16"));
        juegos.addLast(new Juego("FIFA 23", "Experience the excitement of the biggest tournament in football with EA SPORTS™ FIFA 23 and the men’s FIFA World Cup™ update, available on November 9 at no additional cost!", Genero.DEPORTES, null, "EA Electronics", cargarReseña("FIFA 23"), "2022-Sep-19"));
        juegos.addLast(new Juego("Terraria", "Dig, fight, explore, build! Nothing is impossible in this action-packed adventure game. Four Pack also available!", Genero.ACCION, null, "Re-Logic", cargarReseña("Terraria"), "2011-May-16"));
        juegos.addLast(new Juego("Stray", "Lost, alone and separated from family, a stray cat must untangle an ancient mystery to escape a long-forgotten cybercity and find their way home.", Genero.INDIE, null, "Annapurna Interactive", cargarReseña("Stray"), "2022-Jul-19"));
        juegos.addLast(new Juego("Dead by Daylight", "Dead by Daylight is a multiplayer (4vs1) horror game where one player takes on the role of the savage Killer, and the other four players play as Survivors, trying to escape the Killer and avoid being caught and killed.", Genero.HORROR, null, "Behaviour Interactive Inc.", cargarReseña("Dead by Daylight"), "2016-Jun-14"));
        juegos.addLast(new Juego("NBA 2k23", "Rise to the occasion in NBA 2K23. Showcase your talent in MyCAREER. Pair All-Stars with timeless legends in MyTEAM. Build your own dynasty in MyGM, or guide the NBA in a new direction with MyLEAGUE. Take on NBA or WNBA teams in PLAY NOW and feel true-to-life gameplay.", Genero.DEPORTES, null, "EA Electronics", cargarReseña("NBA 2k23"), "2022-Sep-22"));
        juegos.addLast(new Juego("Brawlhalla", "An epic platform fighter for up to 8 players online or local. Try casual free-for-alls, ranked matches, or invite friends to a private room. And it's free! Play cross-platform with millions of players on PlayStation, Xbox, Nintendo Switch, iOS, Android & Steam! Frequent updates. Over fifty Legends.", Genero.MULTIJUGADOR, null, "Ubisoft", cargarReseña("Brawlhalla"), "2017-Oct-17"));

        return juegos;
    }

    public static PriorityQueue<Reseña> cargarReseña(String nombre) {
        PriorityQueue reseñas = new PriorityQueue();
        ArrayList<Reseña> reseñastotales= cargarReseñas();
        // Buscar un block de notas o escribir un método en especifico en Reseña que las cree
        Iterator<Reseña> it = reseñastotales.iterator();
        while(it.hasNext()){
            
        }
       
        return reseñas;
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

    public ArrayList<Image> getScreenshot() {
        return Screenshot;
    }

    public String getDesarrolladores() {
        return Desarrolladores;
    }

    public void setDesarrolladores(String Desarrolladores) {
        this.Desarrolladores = Desarrolladores;
    }

    public PriorityQueue<Reseña> getReseñas() {
        return Reseñas;
    }
}