/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIclasse;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author User
 */
public class AjouterclasseController implements Initializable {

    @FXML
    private Label libelleclasse;
    @FXML
    private Label description;
    @FXML
    private TextField TextLibelle;
    @FXML
    private TextField TextDescription;
    @FXML
    private Button AjouterClasse;
    @FXML
    private Button AbondonnerClasse;
    @FXML
    private Button ReinitialiserClasse;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void AjouterClasse(ActionEvent event) {
    }

    @FXML
    private void AbondonnerClasse(ActionEvent event) {
    }

    @FXML
    private void ReinitialiserClasse(ActionEvent event) {
    }
    
}
