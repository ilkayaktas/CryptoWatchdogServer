
package com.ilkayaktas.cryptowatchdogserver.controller.api.huobi.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class HuobiTicker {

    @SerializedName("status")
    @Expose
    public String status;
    @SerializedName("ch")
    @Expose
    public String ch;
    @SerializedName("ts")
    @Expose
    public Long ts;
    @SerializedName("tick")
    @Expose
    public Tick tick;

}
