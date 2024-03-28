/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package investorpkgAlif;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

/**
 * FXML Controller class
 *
 * @author USER
 */
public class InvestorFxmlMainSceneController implements Initializable {

    @FXML
    private TableView<?> realTimeStockDataTableview;
    @FXML
    private TableColumn<?, ?> stockIdTableColumn;
    @FXML
    private TableColumn<?, ?> stockPricesTableColumn;
    @FXML
    private TableColumn<?, ?> volumeTableColumn;
    @FXML
    private TableColumn<?, ?> marketIndicesTableColumn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void managePortfolioButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void TransactionHistoryButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void notificationAndAlertButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void faqAndTutorialButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void getBrokerButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void researchAndAnalysisButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void complaintBoxButtonOnClick(ActionEvent event) {
    }
    
}
