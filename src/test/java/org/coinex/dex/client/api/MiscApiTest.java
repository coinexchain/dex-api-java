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


package org.coinex.dex.client.api;

import org.coinex.dex.client.ApiException;
import org.coinex.dex.client.model.InlineResponse20053;
import org.coinex.dex.client.model.InlineResponse20054;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MiscApi
 */
@Ignore
public class MiscApiTest {

    private final MiscApi api = new MiscApi();

    
    /**
     * Query block time
     *
     * Query the block time up to given height
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void queryBlockTimesTest() throws ApiException {
        Long height = null;
        Integer count = null;
        List<Long> response = api.queryBlockTimes(height, count);

        // TODO: test validations
    }
    
    /**
     * Query donations info
     *
     * Query donations by DonateToCommunityPool or CommentToken
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void queryDonationTest() throws ApiException {
        Long time = null;
        Long sid = null;
        Integer count = null;
        InlineResponse20054 response = api.queryDonation(time, sid, count);

        // TODO: test validations
    }
    
    /**
     * Query least block info
     *
     * Query least block info
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void queryLastBlockTest() throws ApiException {
        InlineResponse20053 response = api.queryLastBlock();

        // TODO: test validations
    }
    
}
