package com.ilkayaktas.cryptowatchdogserver.controller.api.btcturk.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BTCTurkTicker {

    @SerializedName("pair")
    @Expose
    public String pair;
    @SerializedName("high")
    @Expose
    public double high;
    @SerializedName("last")
    @Expose
    public double last;
    @SerializedName("timestamp")
    @Expose
    public double timestamp;
    @SerializedName("bid")
    @Expose
    public double bid;
    @SerializedName("volume")
    @Expose
    public double volume;
    @SerializedName("low")
    @Expose
    public double low;
    @SerializedName("ask")
    @Expose
    public double ask;
    @SerializedName("open")
    @Expose
    public double open;
    @SerializedName("average")
    @Expose
    public double average;


}
