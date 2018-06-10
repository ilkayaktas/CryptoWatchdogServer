package com.ilkayaktas.cryptowatchdogserver.controller.api.gdax.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by aselsan on 17.12.2017 at 02:34.
 */

public class GdaxTicker {
    @SerializedName("trade_id")
    @Expose
    public int tradeId;
    @SerializedName("price")
    @Expose
    public String price;
    @SerializedName("size")
    @Expose
    public String size;
    @SerializedName("bid")
    @Expose
    public String bid;
    @SerializedName("ask")
    @Expose
    public String ask;
    @SerializedName("volume")
    @Expose
    public String volume;
    @SerializedName("time")
    @Expose
    public String time;

    public String tickerName;
}
