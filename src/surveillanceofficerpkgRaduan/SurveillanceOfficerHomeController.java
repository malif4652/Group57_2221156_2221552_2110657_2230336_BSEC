/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package surveillanceofficerpkgRaduan;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

/**
 * FXML Controller class
 *
 * @author raduan
 */
public class SurveillanceOfficerHomeController implements Initializable {

    @FXML
    private TableView<?> table;
    @FXML
    private TableColumn<?, ?> stockID;
    @FXML
    private TableColumn<?, ?> stockPrice;
    @FXML
    private TableColumn<?, ?> totalBought;
    @FXML
    private TableColumn<?, ?> totalPrice;
    @FXML
    private TableColumn<?, ?> totalSold;
    @FXML
    private TableColumn<?, ?> changesInprice;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    public SurveillanceOfficerHomeController() {
    }
    
}
