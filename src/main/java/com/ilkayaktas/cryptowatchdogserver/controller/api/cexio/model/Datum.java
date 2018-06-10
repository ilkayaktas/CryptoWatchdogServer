
package com.ilkayaktas.cryptowatchdogserver.controller.api.cexio.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Datum {

    @SerializedName("timestamp")
    @Expose
    public String timestamp;
    @SerializedName("pair")
    @Expose
    public String pair;
    @SerializedName("low")
    @Expose
    public String low;
    @SerializedName("high")
    @Expose
    public String high;
    @SerializedName("last")
    @Expose
    public String last;
    @SerializedName("volume")
    @Expose
    public String volume;
    @SerializedName("volume30d")
    @Expose
    public String volume30d;
    @SerializedName("bid")
    @Expose
    public double bid;
    @SerializedName("ask")
    @Expose
    public double ask;

}
