
package com.ilkayaktas.cryptowatchdogserver.controller.api.poloniex.model.volume24;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BTCBELA {

    @SerializedName("BTC")
    @Expose
    public String bTC;
    @SerializedName("BELA")
    @Expose
    public String bELA;

}
