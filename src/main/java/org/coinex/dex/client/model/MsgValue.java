package org.coinex.dex.client.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MsgValue {

    @SerializedName("from_address")
    private String fromAddress = "";

    @SerializedName("to_address")
    private String toAddress = "";

    @SerializedName("amount")
    private List<Coin> amount = null;

    @SerializedName("unlock_time")
    private String unlockTime = "";


    public String getFromAddress() {
        return fromAddress;
    }

    public void setFromAddress(String fromAddress) {
        this.fromAddress = fromAddress;
    }

    public String getToAddress() {
        return toAddress;
    }

    public void setToAddress(String toAddress) {
        this.toAddress = toAddress;
    }


    public List<Coin> getAmount() {
        return amount;
    }

    public void setAmount(List<Coin> amount) {
        this.amount = amount;
    }

    public String getUnlockTime() {
        return unlockTime;
    }

    public void setUnlockTime(String unlockTime) {
        this.unlockTime = unlockTime;
    }

}
