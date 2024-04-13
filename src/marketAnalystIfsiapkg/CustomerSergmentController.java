/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package marketAnalystIfsiapkg;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CustomerSergmentController implements Initializable {

    @FXML
    private Label customerNameLabel;
    @FXML
    private Label customerStockQuantityLabel;
    @FXML
    private Label customerTypeLabel;
    @FXML
    private TextField recordedCustomerInfoTextField;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @Override
    public String toString() {
        return "FXMLController{" + "customerNameLabel=" + customerNameLabel + ", customerStockQuantityLabel=" + customerStockQuantityLabel + ", customerTypeLabel=" + customerTypeLabel + ", recordedCustomerInfoTextField=" + recordedCustomerInfoTextField + '}';
    }

    public Label getCustomerNameLabel() {
        return customerNameLabel;
    }

    public void setCustomerNameLabel(Label customerNameLabel) {
        this.customerNameLabel = customerNameLabel;
    }

    public Label getCustomerStockQuantityLabel() {
        return customerStockQuantityLabel;
    }

    public void setCustomerStockQuantityLabel(Label customerStockQuantityLabel) {
        this.customerStockQuantityLabel = customerStockQuantityLabel;
    }

    public Label getCustomerTypeLabel() {
        return customerTypeLabel;
    }

    public void setCustomerTypeLabel(Label customerTypeLabel) {
        this.customerTypeLabel = customerTypeLabel;
    }

    public TextField getRecordedCustomerInfoTextField() {
        return recordedCustomerInfoTextField;
    }

    public void setRecordedCustomerInfoTextField(TextField recordedCustomerInfoTextField) {
        this.recordedCustomerInfoTextField = recordedCustomerInfoTextField;
    }

    public CustomerSergmentController(Label customerNameLabel, Label customerStockQuantityLabel, Label customerTypeLabel, TextField recordedCustomerInfoTextField) {
        this.customerNameLabel = customerNameLabel;
        this.customerStockQuantityLabel = customerStockQuantityLabel;
        this.customerTypeLabel = customerTypeLabel;
        this.recordedCustomerInfoTextField = recordedCustomerInfoTextField;
    }

    @FXML
    private void recordCustomerInfoButtonOnClick(ActionEvent event) {
        
    }

    @FXML
    private void storeDataAsBinFileButtonOnClick(ActionEvent event) {
        
    }

    @FXML
    private void backToDashboardButtonOnClick(ActionEvent event) {
    }
    
}
