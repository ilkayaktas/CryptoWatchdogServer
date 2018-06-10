
package com.ilkayaktas.cryptowatchdogserver.controller.api.huobi.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Tick {

    @SerializedName("amount")
    @Expose
    public Double amount;
    @SerializedName("open")
    @Expose
    public Double open;
    @SerializedName("close")
    @Expose
    public Double close;
    @SerializedName("high")
    @Expose
    public Double high;
    @SerializedName("id")
    @Expose
    public Long id;
    @SerializedName("count")
    @Expose
    public Long count;
    @SerializedName("low")
    @Expose
    public Double low;
    @SerializedName("version")
    @Expose
    public Long version;
    @SerializedName("ask")
    @Expose
    public List<Double> ask = null;
    @SerializedName("vol")
    @Expose
    public Double vol;
    @SerializedName("bid")
    @Expose
    public List<Double> bid = null;

}
