
package modelo;

import TDAs.ArrayList;
import java.text.ParseException;
import java.util.Date;
import java.util.PriorityQueue;
import static modelo.Juego.sdf;



/**
 *
 * @author Olivier MZ
 */
public class Reseña {
    private String Titulo;
    private String NombreJuego;
    private String Contenido;
    private int Puntuacion;
    private String Autor;
    private Date Fecha;

    public Reseña(String Titulo, String NombreJuego,String Contenido, int Puntuacion, String Autor, String Fecha) {
        this.Titulo = Titulo;
        this.NombreJuego= NombreJuego;
        this.Contenido = Contenido;
        this.Puntuacion = Puntuacion;
        this.Autor = Autor;
        try {
            this.Fecha = sdf.parse(Fecha);
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
    }

    public static ArrayList<Reseña> cargarReseñas(){
        ArrayList<Reseña> c_reseña= new ArrayList<>();
        c_reseña.addFirst(new Reseña("Complejo!", "Apex Legends","El juego requiere de mucha habiliad y comunicacion",3,"Cosme Fulanito","15/8/2022"));
        c_reseña.addLast(new Reseña("Es DOOM, que más se puede decir?", "Doom Eternal","Solo una palabra, yo soy el DOOM GUY!!!",4,"Monty Bolainas","20/10/2022"));
        c_reseña.addLast(new Reseña("Matar demonions, claro que si!", "Doom Eternal","La esencia de Doom no se pierde nunca, y que mejor que esté tan bien optimizado",4,"Bartolomeo J","20/10/2022"));
        c_reseña.addLast(new Reseña("El chat de voz lo es todo", "COD Warzone 2.0","El chat de voz por proximidad es genial, garantizan mucha diversión y le da otro aire a este tipo de juegos",4,"Nelson Muntz","20/10/2022"));
        c_reseña.addLast(new Reseña("Algo más lento que su entrega anterior", "COD Warzone 2.0","El sistema de looteo no me termina de agradar",4,"Pepe Salas","20/10/2022"));
        c_reseña.addLast(new Reseña("Bugs y máß bugs", "FIFA 23","El mismo anticheat no deja jugar el juego, mal ahí EA",4,"Aquiles Alvarez","20/10/2022"));
        c_reseña.addLast(new Reseña("Otro Fifa más", "FIFA 23","Supongo que el FIFA no puede cambiar para EA",4,"Pancho Segura","20/10/2022"));
        c_reseña.addLast(new Reseña("Super bueno y recomendado", "Terraria","Un juego para entretenerse un montón de horas",4,"Perico de los Palotes","20/10/2022"));
        c_reseña.addLast(new Reseña("Ser un gato? Que genial!", "Stray","Un juego fuera de lo común, simplemente épico",4,"Orlando Quiñonez","20/10/2022"));
        c_reseña.addLast(new Reseña("Multijugador entretenido", "Dead by Daylight","La idea de que 4 jugadores cooperen para derrotar a otro es buena",4,"Jeremy Sarmiento","20/10/2022"));
        c_reseña.addLast(new Reseña("El Smash de los pobres", "Brawlhalla","Una autentica alternativa al Smash en PC",4,"Gonzalo Cooper","20/10/2022"));
        c_reseña.addLast(new Reseña("Entretenido con amigos", "Brawlhalla","Personajes balanceados y jugarlos con amigos, lo mejor de lejos",4,"Jose Mora","20/10/2022"));
        return c_reseña;
    }
    
    
    
    
    
    
    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }
    
    public String getNombreJuego(){
        return NombreJuego;
    }
    
    public String getContenido() {
        return Contenido;
    }

    public void setContenido(String Contenido) {
        this.Contenido = Contenido;
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
