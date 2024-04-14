/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package marketAnalystIfsiapkg;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class CustomerSegmentController implements Initializable {

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
        return "FXMLController{" + "customerNameLabel=" + customerNameLabel + ", customerStockQuantityLabel=" +
                customerStockQuantityLabel + ", customerTypeLabel=" + customerTypeLabel + ", recordedCustomerInfoTextField=" + 
                recordedCustomerInfoTextField + '}';
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

    public CustomerSegmentController(Label customerNameLabel, Label customerStockQuantityLabel, Label customerTypeLabel, TextField recordedCustomerInfoTextField) {
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

    
    /*private void backToDashboardButtonOnClick(MouseEvent event) throw IOException {
        /*Parent fileChooserviewParent = FXMLLoader.load(getClass().
               getResource(name"MarketAnalystDashboardScene.fxml");
        Scene fileChooserViewScene = new Scene(fileChooserViewParent);
        Stage newWindow = new Stage();
        
        newWindow.setScene(MarketAnalystDashboard.fxml);
        newWindow.show();
        AnchorPane pane = FXMLLoader.load(getClass().getResource("EventBudgetApprovalScene.fxml"));
        rootpane.getChildren().setAll(pane);*/
    
       
    /*@FXML
    private void backToDashboardButtonOnClick(MouseEvent event)throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("LibraryDirectorDashboard.fxml"));
        rootpane.getChildren().setAll(pane);
    }*/
    @FXML
    private void backToDashboardButtonOnClick(ActionEvent event) throws IOException{
        Parent scene2Parent = FXMLLoader.load(getClass().getResource("MarketAnalystDashboardScene.fxml"));
        Scene scene2 = new Scene(scene2Parent);
        //stage.setScene(scene2);
        Stage s2 = new Stage(); s2.setScene(scene2);  s2.show();
    }
}
