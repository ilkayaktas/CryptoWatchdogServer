package com.ilkayaktas.cryptowatchdogserver.controller.api.bitflyer.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by aselsan on 17.12.2017 at 00:55.
 */

public class BitflyerTicker {
    @SerializedName("product_code")
    @Expose
    public String productCode;
    @SerializedName("timestamp")
    @Expose
    public String timestamp;
    @SerializedName("tick_id")
    @Expose
    public int tickId;
    @SerializedName("best_bid")
    @Expose
    public double bestBid;
    @SerializedName("best_ask")
    @Expose
    public double bestAsk;
    @SerializedName("best_bid_size")
    @Expose
    public double bestBidSize;
    @SerializedName("best_ask_size")
    @Expose
    public double bestAskSize;
    @SerializedName("total_bid_depth")
    @Expose
    public double totalBidDepth;
    @SerializedName("total_ask_depth")
    @Expose
    public double totalAskDepth;
    @SerializedName("ltp")
    @Expose
    public double ltp;
    @SerializedName("volume")
    @Expose
    public double volume;
    @SerializedName("volume_by_product")
    @Expose
    public double volumeByProduct;

}
