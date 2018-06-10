
package com.ilkayaktas.cryptowatchdogserver.controller.api.poloniex.model.volume24;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class USDTDASH {

    @SerializedName("USDT")
    @Expose
    public String uSDT;
    @SerializedName("DASH")
    @Expose
    public String dASH;

}
