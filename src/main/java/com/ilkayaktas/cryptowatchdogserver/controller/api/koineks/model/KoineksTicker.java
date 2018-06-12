
package com.ilkayaktas.cryptowatchdogserver.controller.api.koineks.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class KoineksTicker {

    @SerializedName("BTC")
    @Expose
    public BTC bTC;
    @SerializedName("ETH")
    @Expose
    public ETH eTH;
    @SerializedName("LTC")
    @Expose
    public LTC lTC;
    @SerializedName("DASH")
    @Expose
    public DASH dASH;
    @SerializedName("DOGE")
    @Expose
    public DOGE dOGE;

}
