package com.ilkayaktas.cryptowatchdogserver.controller.api.hitbtc.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by aselsan on 19.12.2017 at 23:07.
 */

public class HitBTCTicker {
    @SerializedName("ask")
    @Expose
    public String ask;
    @SerializedName("bid")
    @Expose
    public String bid;
    @SerializedName("last")
    @Expose
    public String last;
    @SerializedName("open")
    @Expose
    public String open;
    @SerializedName("low")
    @Expose
    public String low;
    @SerializedName("high")
    @Expose
    public String high;
    @SerializedName("volume")
    @Expose
    public String volume;
    @SerializedName("volumeQuote")
    @Expose
    public String volumeQuote;
    @SerializedName("timestamp")
    @Expose
    public String timestamp;
    @SerializedName("symbol")
    @Expose
    public String symbol;
}
