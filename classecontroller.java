/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIclasse;

import edu.project.entities.classe;
import edu.project.servicies.classeService;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author User
 */
public class classecontroller implements Initializable {

    @FXML
    private AnchorPane anchorpaneCLASSE;
    @FXML
    private TableView<classe> tableClasseclasse;
    @FXML
    private TableColumn<?, ?> id_classe;
    @FXML
    private TableColumn<?, ?> libelle_cla;
    @FXML
    private TableColumn<?, ?> description_classe;
    @FXML
    private TextField TextfieldLibelle;
    @FXML
    private TextField TextFieldDescription;
    @FXML
    private Label Rlibelle;
    @FXML
    private Label Rdescription;
    @FXML
    private Button ajouterClasse;
    @FXML
    private Button modifierClasse;
    @FXML
    private Button supprimerClasse;
    @FXML
    private Button rechercheClasse;
    @FXML
    private Button retourClasse;

    
    ObservableList<classe> clas = FXCollections.observableArrayList();
    classeService css = new classeService();
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       inti(); // TODO
    }    
 private void inti(){
        try {
            clas= (ObservableList<classe>) css.afficherClasse();
             id_classe.setCellValueFactory(new PropertyValueFactory<>("id_classe"));
        libelle_cla.setCellValueFactory(new PropertyValueFactory<>("libelle_cla"));
        description_classe.setCellValueFactory(new PropertyValueFactory<>("description_classe"));

        tableClasseclasse.setItems((clas) );
        } catch (SQLException ex) {
            Logger.getLogger(classecontroller.class.getName()).log(Level.SEVERE, null, ex);
        }
}
    @FXML
    private void rechercheClasse(ActionEvent event) {
    }

    @FXML
    private void retourClasse(ActionEvent event) {
    }

    @FXML
    private void ajouterClasse(ActionEvent event) {
    }

    @FXML
    private void modifierClasse(ActionEvent event) {
    }

    @FXML
    private void supprimerClasse(ActionEvent event) {
    }
    
}
