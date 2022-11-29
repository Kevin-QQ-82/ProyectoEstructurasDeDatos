/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package espol.grupo_05;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/*
 * FXML Controller class
 *
 * @author quint
 */
public class CatalogoController implements Initializable {


    @FXML
    private Button btnAnterior;
    @FXML
    private Label labelNombreJuego;
    @FXML
    private Button btnSiguiente;
    @FXML
    private Label cantidadTotal;
    @FXML
    private ImageView imgviewJUEGO;
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
  /*  
    private void mostrarDetalle() {

        //mostrar la foto y nombre del empleado en la seccion derecha
        InputStream input = null;
        
        try {
            String fileName = App.pathImg + j.getTitulo() + ".png";//armar la ruta de la foto
            
            labelNombreJuego.setText(j.getTitulo());
            //abrir el stream de la imagen de la persona
            input = App.class.getResource(fileName).openStream();

            //crear la imagen 
            Image image = new Image(input, 300, 300, false, false);
            imgviewJUEGO.setImage(image);

        } catch (Exception ex) {
            System.out.println("no se encuentra archivo de imagen");

        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException ex) {
                    System.out.println("no se pudo cerrar");
                }
            }
        }
    }
    
*/
}
