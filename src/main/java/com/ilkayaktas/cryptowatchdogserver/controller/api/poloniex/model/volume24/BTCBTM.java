
package com.ilkayaktas.cryptowatchdogserver.controller.api.poloniex.model.volume24;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BTCBTM {

    @SerializedName("BTC")
    @Expose
    public String bTC;
    @SerializedName("BTM")
    @Expose
    public String bTM;

}
