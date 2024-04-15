/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package comissionerpkgFairooz;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author ASUS
 */
public class InternationalCoopertionSceneController implements Initializable {

    @FXML
    private TextField nameTextField;
    @FXML
    private TextField idTextField;
    @FXML
    private TableColumn<Employee,String> idTableColumn;
    @FXML
    private TableColumn<Employee,String> nameTableColumn;
    @FXML
    private TableColumn<Employee,String> departmentTableColumn;
    @FXML
    private TableColumn<Employee,String> reportTableColumn1;
    @FXML
    private TableColumn<Employee,String> idTableColumn1;
    @FXML
    private ComboBox<String> departmentCombobox;
    @FXML
    private TableView<Employee> tableView;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        departmentComboBox.getItems().add("IT");
        departmentComboBox.getItems().add("Investor");
        departmentComboBox.getItems().add("Market Analyst")
    }    

    @FXML
    private void addReortMouseOnClicked(ActionEvent event) {
    }
    
}
