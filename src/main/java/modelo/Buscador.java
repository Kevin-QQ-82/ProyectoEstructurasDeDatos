/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import TDAs.CircularDoublyLinkedList;
import TDAs.Node;
import java.util.Date;

/**
 *
 * @author anton
 */
public class Buscador {
    public static CircularDoublyLinkedList<Juego> buscarTitulo(CircularDoublyLinkedList<Juego> juegos,String busqueda){
        if(!juegos.isEmpty()){
            CircularDoublyLinkedList<Juego> salida = new CircularDoublyLinkedList<>();
            Node<Juego> juegoac= juegos.getTail() ;
            for(int i = 0 ; i<juegos.size();i++){
                juegoac= juegoac.getNext();
                if(juegoac.getVal().getTitulo().contains(busqueda)){
                    salida.addLast(juegoac.getVal());
                }
            }
            return salida;
        }else{
        return juegos;
        }
    }
    public static CircularDoublyLinkedList<Juego> buscarLanzamiento(CircularDoublyLinkedList<Juego> juegos,Date busqueda){
        if(!juegos.isEmpty()){
            CircularDoublyLinkedList<Juego> salida = new CircularDoublyLinkedList<>();
            Node<Juego> juegoac= juegos.getTail() ;
            for(int i = 0 ; i<juegos.size();i++){
                juegoac= juegoac.getNext();
                if(juegoac.getVal().getFecha_l()==busqueda){
                    salida.addLast(juegoac.getVal());
                }
            }
            return salida;
        }else{
        return juegos;
        }
    }
}

