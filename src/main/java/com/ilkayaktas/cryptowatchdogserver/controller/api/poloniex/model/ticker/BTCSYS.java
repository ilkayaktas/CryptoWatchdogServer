
package com.ilkayaktas.cryptowatchdogserver.controller.api.poloniex.model.ticker;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BTCSYS {

    @SerializedName("id")
    @Expose
    public int id;
    @SerializedName("last")
    @Expose
    public String last;
    @SerializedName("lowestAsk")
    @Expose
    public String lowestAsk;
    @SerializedName("highestBid")
    @Expose
    public String highestBid;
    @SerializedName("percentChange")
    @Expose
    public String percentChange;
    @SerializedName("baseVolume")
    @Expose
    public String baseVolume;
    @SerializedName("quoteVolume")
    @Expose
    public String quoteVolume;
    @SerializedName("isFrozen")
    @Expose
    public String isFrozen;
    @SerializedName("high24hr")
    @Expose
    public String high24hr;
    @SerializedName("low24hr")
    @Expose
    public String low24hr;

}
