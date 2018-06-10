package com.ilkayaktas.cryptowatchdogserver.controller.api.btcc.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by aselsan on 17.12.2017 at 01:26.
 */

public class Ticker {
    @SerializedName("BidPrice")
    @Expose
    public double bidPrice;
    @SerializedName("AskPrice")
    @Expose
    public double askPrice;
    @SerializedName("Open")
    @Expose
    public double open;
    @SerializedName("High")
    @Expose
    public double high;
    @SerializedName("Low")
    @Expose
    public double low;
    @SerializedName("Last")
    @Expose
    public double last;
    @SerializedName("LastQuantity")
    @Expose
    public double lastQuantity;
    @SerializedName("PrevCls")
    @Expose
    public double prevCls;
    @SerializedName("Volume")
    @Expose
    public double volume;
    @SerializedName("Volume24H")
    @Expose
    public double volume24H;
    @SerializedName("ExecutionLimitDown")
    @Expose
    public double executionLimitDown;
    @SerializedName("ExecutionLimitUp")
    @Expose
    public double executionLimitUp;
}
