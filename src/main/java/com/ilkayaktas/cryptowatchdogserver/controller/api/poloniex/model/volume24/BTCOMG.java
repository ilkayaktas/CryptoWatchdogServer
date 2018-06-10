
package com.ilkayaktas.cryptowatchdogserver.controller.api.poloniex.model.volume24;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BTCOMG {

    @SerializedName("BTC")
    @Expose
    public String bTC;
    @SerializedName("OMG")
    @Expose
    public String oMG;

}
