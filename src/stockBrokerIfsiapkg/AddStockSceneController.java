/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package stockBrokerIfsiapkg;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import java.io.FileWriter;
import java.io.IOException;

/**
 * FXML Controller class
 *
 * @author HP
 */
public class AddStockSceneController implements Initializable {

    @FXML
    private TextField stockIDTextField;
    @FXML
    private TextField companyNameTextField;
    @FXML
    private TextField oldPriceTextField;
    @FXML
    private TextField newPriceTextField;
    @FXML
    private TableView<String> mainTableView;
    @FXML
    private TableColumn<Integer, ?> stockIDTableView;
    @FXML
    private TableColumn<?, ?> companyNameTableView;
    @FXML
    private TableColumn<?, ?> oldPriceTableView;
    @FXML
    private TableColumn<?, ?> newPriceTableView;
    @FXML
    private Label notificationLabel;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void addNewStockToListonAction(ActionEvent event) {
        // Step 1: Store Data in Backend
        int stockID;
        String companyName;
        double newPrice, oldPrice;

        try {
            stockID = Integer.parseInt(stockIDTextField.getText());
            companyName = companyNameTextField.getText();
            newPrice = Double.parseDouble(newPriceTextField.getText());
            oldPrice = Double.parseDouble(oldPriceTextField.getText());

            // Step 2: Stock Class New Data Entry
            if (stockIDTextField.getText().isEmpty() || companyNameTextField.getText().isEmpty() || newPriceTextField.getText().isEmpty() || oldPriceTextField.getText().isEmpty()) {
                notificationLabel.setText("**Please Fill All the required Field!!**");
            } else {
//                notificationText.setText("**Good To Go!!**");
                File f = null;
                FileWriter fw = null;

                try {

                    f = new File("StockList.txt");

                    if(f.exists()) fw = new FileWriter(f,true);
                    else fw = new FileWriter(f);

                    String NewStock;
                    NewStock=  stockID + "&&" + companyName + "&&" + newPrice + "&&" + oldPrice + "\n";
                    fw.write(NewStock);
                    fw.close();


                } catch (IOException ex) {
                    System.out.println("Error in AddDataToEmployeeDatabase method!! file Writing failed");
                }
            }

            // Step 3: Save in text file store
        } catch (NumberFormatException e) {
            notificationLabel.setText("**Invalid input! Please enter valid numbers.**");
        }
        
    }

    @FXML
    private void LoadListOfStocksOnClick(ActionEvent event) {
    }
    
}
