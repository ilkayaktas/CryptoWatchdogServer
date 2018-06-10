
package com.ilkayaktas.cryptowatchdogserver.controller.api.okex.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Ticker {

    @SerializedName("high")
    @Expose
    public String high;
    @SerializedName("vol")
    @Expose
    public String vol;
    @SerializedName("last")
    @Expose
    public String last;
    @SerializedName("low")
    @Expose
    public String low;
    @SerializedName("buy")
    @Expose
    public String buy;
    @SerializedName("sell")
    @Expose
    public String sell;

}
