/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package stockBrokerIfsiapkg;

import java.io.File;
import java.io.FileNotFoundException;
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
import java.util.Scanner;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


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
    private TableView<StockList> mainTableView;
    @FXML
    private TableColumn<StockList, String > stockIDTableView;
    @FXML
    private TableColumn<StockList, String> companyNameTableView;
    @FXML
    private TableColumn<StockList, String> oldPriceTableView;
    @FXML
    private TableColumn<StockList, String> newPriceTableView;
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
    private void LoadListOfStocksOnClick() {
        /*stockIDTableView.setCellValueFactory(new PropertyValueFactory<StockList,String>("StockId"));
        companyNameTableView.setCellValueFactory(new PropertyValueFactory<StockList,String>("CompanyName"));
        oldPriceTableView.setCellValueFactory(new PropertyValueFactory<StockList,String>("OldPrice"));
        newPriceTableView.setCellValueFactory(new PropertyValueFactory<StockList,String>("NewPrice"));
        mainTableView.setItems(getListData());*/
        stockIDTableView.setCellValueFactory(cellData -> cellData.getValue().getStockID());
        companyNameTableView.setCellValueFactory(cellData -> cellData.getValue().getCompanyName());
        oldPriceTableView.setCellValueFactory(cellData -> cellData.getValue().getOldPrice());
        newPriceTableView.setCellValueFactory(cellData -> cellData.getValue().getNewPrice());
        mainTableView.setItems(getListData());
        
    
        
        
        
    }
    public ObservableList<StockList> getListData(){
        ObservableList<StockList> obList = FXCollections.observableArrayList();
         
        System.out.println("In getListData!!");
        File f = null;
        Scanner sc;
        String s1,s2,s3,s4,addStr;
        String str;
        String[] tokens;
        int count =1;
        try {
            f = new File("StockList.txt");
            System.out.println("Reading StockList.txt!!");
            sc = new Scanner(f);
            if (f.exists()) {

                while (sc.hasNextLine()) {
                    str = sc.nextLine();
                    System.out.println("Reading StockList.txt!!"+str);
                    tokens = str.split("&&");
                    s1=tokens[0];
                    s2=tokens[1];
                    s3=tokens[2];
                    s4=tokens[3];
            obList.add(new StockList(s1, s2, s3, s4));        
                }
                
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error in getListdata!!File reading failed!!");
        }finally {
            return obList ;

        }

    }

    @FXML
    private void backToDashboard(ActionEvent event) throws IOException {
        Parent scene2Parent = FXMLLoader.load(getClass().getResource("StockBrokerDashboardScene.fxml"));
        Scene scene2 = new Scene(scene2Parent);
        //stage.setScene(scene2);
        Stage s2 = new Stage(); s2.setScene(scene2);  s2.show();
    }
    
    
    
}
