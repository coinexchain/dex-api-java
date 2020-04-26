/*
 * CET-Lite for CoinEx Chain
 * A REST interface for state queries, transaction generation and broadcasting.
 *
 * OpenAPI spec version: 3.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.StdTx;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MarketApi
 */
@Ignore
public class MarketApiTest {

    private final MarketApi api = new MarketApi();

    /**
     * Cancel the order
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cancelOrderTest() throws ApiException {
        Object body = null;
        StdTx response = api.cancelOrder(body);

        // TODO: test validations
    }
    /**
     * Cancel the trading-pair
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cancelTradingPairTest() throws ApiException {
        Object body = null;
        StdTx response = api.cancelTradingPair(body);

        // TODO: test validations
    }
    /**
     * Create GTE order in blockchain
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createGteOrderTest() throws ApiException {
        Object body = null;
        StdTx response = api.createGteOrder(body);

        // TODO: test validations
    }
    /**
     * Create IOC order in blockchain
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createIocOrderTest() throws ApiException {
        Object body = null;
        StdTx response = api.createIocOrder(body);

        // TODO: test validations
    }
    /**
     * Create trading-pair in blockchain
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createTradingPairTest() throws ApiException {
        Object body = null;
        StdTx response = api.createTradingPair(body);

        // TODO: test validations
    }
    /**
     * Get the current market parameters
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMarketParamsTest() throws ApiException {
        Object response = api.getMarketParams();

        // TODO: test validations
    }
    /**
     * Query order info
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOrderTest() throws ApiException {
        String orderId = null;
        Object response = api.getOrder(orderId);

        // TODO: test validations
    }
    /**
     * Query user order-id list
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOrdersTest() throws ApiException {
        String address = null;
        Object response = api.getOrders(address);

        // TODO: test validations
    }
    /**
     * Query trading-pair&#x27;s orderbook
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOrdersInMarketTest() throws ApiException {
        String stock = null;
        String money = null;
        Object response = api.getOrdersInMarket(stock, money);

        // TODO: test validations
    }
    /**
     * Query trading-pair info
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTradingPairTest() throws ApiException {
        String stock = null;
        String money = null;
        Object response = api.getTradingPair(stock, money);

        // TODO: test validations
    }
    /**
     * Modify the price precision of the trading pair in the dex
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void modifyPricePrecisionTest() throws ApiException {
        Object body = null;
        StdTx response = api.modifyPricePrecision(body);

        // TODO: test validations
    }
    /**
     * Query all trading-pair infos in blockchain
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void queryTradingPairsTest() throws ApiException {
        Object response = api.queryTradingPairs();

        // TODO: test validations
    }
}
