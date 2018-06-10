package com.ilkayaktas.cryptowatchdogserver.controller.api.koinim.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by aselsan on 3.01.2018 at 11:50.
 */

public class KoinimTicker {
    @Expose
    public double sell;
    @SerializedName("high")
    @Expose
    public double high;
    @SerializedName("buy")
    @Expose
    public double buy;
    @SerializedName("change_rate")
    @Expose
    public double changeRate;
    @SerializedName("bid")
    @Expose
    public double bid;
    @SerializedName("wavg")
    @Expose
    public double wavg;
    @SerializedName("last_order")
    @Expose
    public double lastOrder;
    @SerializedName("volume")
    @Expose
    public double volume;
    @SerializedName("low")
    @Expose
    public double low;
    @SerializedName("ask")
    @Expose
    public double ask;
    @SerializedName("avg")
    @Expose
    public double avg;

}
