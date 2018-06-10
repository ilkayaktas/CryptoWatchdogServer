
package com.ilkayaktas.cryptowatchdogserver.controller.api.paribu.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BTCTL {

    @SerializedName("last")
    @Expose
    public double last;
    @SerializedName("lowestAsk")
    @Expose
    public double lowestAsk;
    @SerializedName("highestBid")
    @Expose
    public double highestBid;
    @SerializedName("percentChange")
    @Expose
    public double percentChange;
    @SerializedName("volume")
    @Expose
    public double volume;
    @SerializedName("high24hr")
    @Expose
    public double high24hr;
    @SerializedName("low24hr")
    @Expose
    public double low24hr;

}
