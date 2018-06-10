
package com.ilkayaktas.cryptowatchdogserver.controller.api.poloniex.model.volume24;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class USDTLTC {

    @SerializedName("USDT")
    @Expose
    public String uSDT;
    @SerializedName("LTC")
    @Expose
    public String lTC;

}
