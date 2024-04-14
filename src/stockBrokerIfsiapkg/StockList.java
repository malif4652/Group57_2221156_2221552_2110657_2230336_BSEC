/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stockBrokerIfsiapkg;
import javafx.beans.property.SimpleStringProperty;

public class StockList {

    SimpleStringProperty StockID, CompanyName, OldPrice,NewPrice;

    public StockList(String AppiD, String EmpId, String day, String StDate) {
        this.StockID = new SimpleStringProperty(StockID);
        this.CompanyName = new SimpleStringProperty(Name);
        this.OldPrice = new SimpleStringProperty(Price1);
        this.NewPrice = new SimpleStringProperty(Price2);

        
    }

    public SimpleStringProperty getStockID() {
        return StockID;
    }

    public void setStockID(SimpleStringProperty StockID) {
        this.StockID = StockID;
    }

    public SimpleStringProperty getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(SimpleStringProperty CompanyName) {
        this.CompanyName = CompanyName;
    }

    public SimpleStringProperty getOldPrice() {
        return OldPrice;
    }

    public void setOldPrice(SimpleStringProperty OldPrice) {
        this.OldPrice = OldPrice;
    }

    public SimpleStringProperty getNewPrice() {
        return NewPrice;
    }

    public void setNewPrice(SimpleStringProperty NewPrice) {
        this.NewPrice = NewPrice;
    }
    
    
    
    public SimpleStringProperty StockID() {
        return StockID;
    }


    public SimpleStringProperty CompanyName() {
        return CompanyName;
    }


    public SimpleStringProperty OldPrice() {
        return OldPrice;
    }

    public SimpleStringProperty NewPrice() {
        return NewPrice;
    }

    