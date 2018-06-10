package com.ilkayaktas.cryptowatchdogserver.controller.api.bittrex.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by aselsan on 17.12.2017 at 01:33.
 */

public class Result {
    @SerializedName("Bid")
    @Expose
    public double bid;
    @SerializedName("Ask")
    @Expose
    public double ask;
    @SerializedName("Last")
    @Expose
    public double last;

    public String tickerName;

}
