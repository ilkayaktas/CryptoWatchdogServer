package com.ilkayaktas.cryptowatchdogserver.controller.api.bitstamp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by aselsan on 16.12.2017 at 14:44.
 */

public class BitstampTicker {
    @SerializedName("high")
    @Expose
    public String high;
    @SerializedName("last")
    @Expose
    public String last;
    @SerializedName("timestamp")
    @Expose
    public String timestamp;
    @SerializedName("bid")
    @Expose
    public String bid;
    @SerializedName("vwap")
    @Expose
    public String vwap;
    @SerializedName("volume")
    @Expose
    public String volume;
    @SerializedName("low")
    @Expose
    public String low;
    @SerializedName("ask")
    @Expose
    public String ask;
    @SerializedName("open")
    @Expose
    public String open;
}
