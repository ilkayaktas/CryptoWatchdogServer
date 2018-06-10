
package com.ilkayaktas.cryptowatchdogserver.controller.api.poloniex.model.volume24;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BTCVIA {

    @SerializedName("BTC")
    @Expose
    public String bTC;
    @SerializedName("VIA")
    @Expose
    public String vIA;

}
