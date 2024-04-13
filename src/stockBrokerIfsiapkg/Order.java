package stockBrokerIfsiapkg;

public class Order {
    private String orderType;
    private String orderStatus;
    // Other order details as needed

    public Order(String orderType) {
        this.orderType = orderType;
        this.orderStatus = "Pending"; // Initial status
    }

    public void validateOrder() {
        // Validate order details logic
        // If valid, set orderStatus to "Valid", else set it to "Invalid"
    }

    public void fetchMarketData() {
        // Fetch real-time market data logic
    }

    public void executeOrder() {
        // Execute buy/sell order logic
    }

    public void verifyFunds() {
        // Verify client's available funds logic
    }
    
    
}
