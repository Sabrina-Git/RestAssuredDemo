package endpoints;

public class TradeEndpoints {

    public static final String CREATE_ORDER = "/api/v1/orders";
    public static final String GET_ORDER = "/api/v1/orders/{orderId}";
    public static final String MODIFY_ORDER = "/api/v1/orders/{orderId}";
    public static final String CANCEL_ORDER = "/api/v1/orders/{orderId}/cancel";
    public static final String MARKET_DATA = "/api/v1/market-data/{symbol}";
    public static final String POSITIONS = "/api/v1/accounts/{accountNumber}/positions";
}
