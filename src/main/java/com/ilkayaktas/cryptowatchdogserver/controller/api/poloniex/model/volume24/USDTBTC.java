
package com.ilkayaktas.cryptowatchdogserver.controller.api.poloniex.model.volume24;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class USDTBTC {

    @SerializedName("USDT")
    @Expose
    public String uSDT;
    @SerializedName("BTC")
    @Expose
    public String bTC;

}
