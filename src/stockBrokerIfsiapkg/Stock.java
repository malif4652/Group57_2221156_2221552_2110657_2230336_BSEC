
package stockBrokerIfsiapkg;

//import java.util.ArrayList;
//import java.util.List;

public class Stock {
    private String stockId;
    private int quantity;
    private double newPrice;
    private double oldPrice;
    

    public Stock(String stockId, int quantity, double newPrice, double oldPrice) {
        this.stockId = stockId;
        this.quantity = quantity;
        this.newPrice = newPrice;
        this.oldPrice = oldPrice;
    }

    @Override
    public String toString() {
        return "Stock{" + "stockId=" + stockId + ", quantity=" + quantity + ", newPrice=" + newPrice + ", oldPrice=" + oldPrice + '}';
    }

  

/*public class DummyStockInput {
    public static void main(String[] args) {
        // Dummy data input
        List<Stock> stockList = new ArrayList<>();

        // Inputting dummy stock data
        Stock stock1 = new Stock("ABC", 100, 50.0, 45.0);
        Stock stock2 = new Stock("XYZ", 200, 75.0, 70.0);

        stockList.add(stock1);
        stockList.add(stock2);

        // Displaying the inputted stock data
        System.out.println("Stock Data:");
        for (Stock stock : stockList) {
            System.out.println(stock);
        }
    }*/

    public String getStockId() {
        return stockId;
    }

    public void setStockId(String stockId) {
        this.stockId = stockId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getNewPrice() {
        return newPrice;
    }

    public void setNewPrice(double newPrice) {
        this.newPrice = newPrice;
    }

    public double getOldPrice() {
        return oldPrice;
    }

    public void setOldPrice(double oldPrice) {
        this.oldPrice = oldPrice;
    }
}