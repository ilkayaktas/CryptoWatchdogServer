
package com.ilkayaktas.cryptowatchdogserver.controller.api.poloniex.model.volume24;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BTCVRC {

    @SerializedName("BTC")
    @Expose
    public String bTC;
    @SerializedName("VRC")
    @Expose
    public String vRC;

}
