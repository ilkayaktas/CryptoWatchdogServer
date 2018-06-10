
package com.ilkayaktas.cryptowatchdogserver.controller.api.poloniex.model.volume24;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BTCXVC {

    @SerializedName("BTC")
    @Expose
    public String bTC;
    @SerializedName("XVC")
    @Expose
    public String xVC;

}
