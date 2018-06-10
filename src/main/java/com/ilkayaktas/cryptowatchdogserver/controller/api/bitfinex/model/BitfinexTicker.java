package com.ilkayaktas.cryptowatchdogserver.controller.api.bitfinex.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by aselsan on 17.12.2017 at 02:18.
 */

public class BitfinexTicker {
    @SerializedName("mid")
    @Expose
    public String mid;
    @SerializedName("bid")
    @Expose
    public String bid;
    @SerializedName("ask")
    @Expose
    public String ask;
    @SerializedName("last_price")
    @Expose
    public String lastPrice;
    @SerializedName("low")
    @Expose
    public String low;
    @SerializedName("high")
    @Expose
    public String high;
    @SerializedName("volume")
    @Expose
    public String volume;
    @SerializedName("timestamp")
    @Expose
    public String timestamp;

}
