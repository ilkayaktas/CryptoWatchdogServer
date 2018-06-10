
package com.ilkayaktas.cryptowatchdogserver.controller.api.poloniex.model.volume24;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class USDTSTR {

    @SerializedName("USDT")
    @Expose
    public String uSDT;
    @SerializedName("STR")
    @Expose
    public String sTR;

}
