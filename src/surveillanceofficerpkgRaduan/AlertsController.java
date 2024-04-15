/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package surveillanceofficerpkgRaduan;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

/**
 * FXML Controller class
 *
 * @author raduan
 */
public class AlertsController implements Initializable {

    @FXML
    private TextArea notificationList;
    @FXML
    private Button homePage;
    @FXML
    private Button recentBuyers;
    @FXML
    private Button recentSellers;
    @FXML
    private Button recentWithdraws;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    public AlertsController() {
    }
    private static final Logger LOG = Logger.getLogger(AlertsController.class.getName());

    @FXML
    private void goToHomePageOnClick(ActionEvent event) {
    }

    @FXML
    private void recentBuyersOnClick(ActionEvent event) {
    }

    @FXML
    private void recentSellersOnClick(ActionEvent event) {
    }

    @FXML
    private void recentWithdrawsOnClick(ActionEvent event) {
    }
    
}
