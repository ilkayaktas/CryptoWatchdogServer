
package com.ilkayaktas.cryptowatchdogserver.controller.api.poloniex.model.volume24;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class USDTREP {

    @SerializedName("USDT")
    @Expose
    public String uSDT;
    @SerializedName("REP")
    @Expose
    public String rEP;

}
