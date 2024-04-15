
package stockBrokerIfsiapkg;
import javafx.beans.property.SimpleStringProperty;

public class StockList {

    SimpleStringProperty StockID, CompanyName, OldPrice,NewPrice;

    public StockList(String Sid, String Cname, String Oprice, String Nprice) {
        this.StockID = new SimpleStringProperty(Sid);
        this.CompanyName = new SimpleStringProperty(Cname);
        this.OldPrice = new SimpleStringProperty( Oprice);
        this.NewPrice = new SimpleStringProperty(Nprice);
        
        
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
    
}

    