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
import io.swagger.client.model.Amount;
import io.swagger.client.model.BroadcastTxCommitResult;
import io.swagger.client.model.InlineResponse20029;
import io.swagger.client.model.InlineResponse20030;
import io.swagger.client.model.InlineResponse20031;
import io.swagger.client.model.InlineResponse20032;
import io.swagger.client.model.InlineResponse20033;
import io.swagger.client.model.StdTx;
import io.swagger.client.model.WithdrawRequestBody;
import io.swagger.client.model.WithdrawRequestBody1;
import io.swagger.client.model.WithdrawRequestBody2;
import io.swagger.client.model.WithdrawRequestBody3;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DistributionApi
 */
@Ignore
public class DistributionApiTest {

    private final DistributionApi api = new DistributionApi();

    
    /**
     * Donate to the community pool
     *
     * Donate some amount of cet to the community pool
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void donateToCommunityPoolTest() throws ApiException {
        String accAddress = null;
        Amount amount = null;
        StdTx response = api.donateToCommunityPool(accAddress, amount);

        // TODO: test validations
    }
    
    /**
     * Get the total rewards balance from all delegations
     *
     * Get the sum of all the rewards earned by delegations by a single delegator
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllRewardsTest() throws ApiException {
        String delegatorAddr = null;
        InlineResponse20029 response = api.getAllRewards(delegatorAddr);

        // TODO: test validations
    }
    
    /**
     * Community pool parameters
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCommunityPoolTest() throws ApiException {
        Object response = api.getCommunityPool();

        // TODO: test validations
    }
    
    /**
     * Validator distribution information
     *
     * Query the distribution information of a single validator
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDistributionInfoTest() throws ApiException {
        String validatorAddr = null;
        InlineResponse20032 response = api.getDistributionInfo(validatorAddr);

        // TODO: test validations
    }
    
    /**
     * Fee distribution parameters
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDistributionParamsTest() throws ApiException {
        InlineResponse20033 response = api.getDistributionParams();

        // TODO: test validations
    }
    
    /**
     * Fee distribution outstanding rewards of a single validator
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOutstandingRewardsTest() throws ApiException {
        String validatorAddr = null;
        Object response = api.getOutstandingRewards(validatorAddr);

        // TODO: test validations
    }
    
    /**
     * Query a delegation reward
     *
     * Query a single delegation reward by a delegator
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRewardByValidatorTest() throws ApiException {
        String delegatorAddr = null;
        String validatorAddr = null;
        InlineResponse20030 response = api.getRewardByValidator(delegatorAddr, validatorAddr);

        // TODO: test validations
    }
    
    /**
     * Commission and self-delegation rewards of a single validator
     *
     * Query the commission and self-delegation rewards of validator.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getValidatorRewardsTest() throws ApiException {
        String validatorAddr = null;
        InlineResponse20030 response = api.getValidatorRewards(validatorAddr);

        // TODO: test validations
    }
    
    /**
     * Get the rewards withdrawal address
     *
     * Get the delegations&#39; rewards withdrawal address. This is the address in which the user will receive the reward funds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getWithdrawAddressTest() throws ApiException {
        String delegatorAddr = null;
        InlineResponse20031 response = api.getWithdrawAddress(delegatorAddr);

        // TODO: test validations
    }
    
    /**
     * Replace the rewards withdrawal address
     *
     * Replace the delegations&#39; rewards withdrawal address for a new one.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void setWithdrawAddressTest() throws ApiException {
        String delegatorAddr = null;
        WithdrawRequestBody2 withdrawRequestBody = null;
        BroadcastTxCommitResult response = api.setWithdrawAddress(delegatorAddr, withdrawRequestBody);

        // TODO: test validations
    }
    
    /**
     * Withdraw all the delegator&#39;s delegation rewards
     *
     * Withdraw all the delegator&#39;s delegation rewards
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void withdrawAllRewardsTest() throws ApiException {
        String delegatorAddr = null;
        WithdrawRequestBody withdrawRequestBody = null;
        BroadcastTxCommitResult response = api.withdrawAllRewards(delegatorAddr, withdrawRequestBody);

        // TODO: test validations
    }
    
    /**
     * Withdraw the validator&#39;s rewards
     *
     * Withdraw the validator&#39;s self-delegation and commissions rewards
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void withdrawAllValidatorRewardsTest() throws ApiException {
        String validatorAddr = null;
        WithdrawRequestBody3 withdrawRequestBody = null;
        BroadcastTxCommitResult response = api.withdrawAllValidatorRewards(validatorAddr, withdrawRequestBody);

        // TODO: test validations
    }
    
    /**
     * Withdraw a delegation reward
     *
     * Withdraw a delegator&#39;s delegation reward from a single validator
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void withdrawRewardsByValidatorTest() throws ApiException {
        String delegatorAddr = null;
        String validatorAddr = null;
        WithdrawRequestBody1 withdrawRequestBody = null;
        BroadcastTxCommitResult response = api.withdrawRewardsByValidator(delegatorAddr, validatorAddr, withdrawRequestBody);

        // TODO: test validations
    }
    
}
