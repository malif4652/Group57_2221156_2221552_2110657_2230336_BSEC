/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author USER
 */
public class MainAppFxmlMainSceneController implements Initializable {

    @FXML
    private TextField loginUserIdTextField;
    @FXML
    private PasswordField loginPasswordPasswordField;
    @FXML
    private TextField signupUserIdTextField;
    @FXML
    private PasswordField signupPasswordPasswordField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void loginButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void signupButtonOnClick(ActionEvent event) {
    }
    
}
