
package com.ilkayaktas.cryptowatchdogserver.controller.api.okex.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class OkexTicker {

    @SerializedName("date")
    @Expose
    public String date;
    @SerializedName("ticker")
    @Expose
    public Ticker ticker;

}
