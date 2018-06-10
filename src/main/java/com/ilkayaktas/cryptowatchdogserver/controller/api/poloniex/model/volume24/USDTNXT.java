
package com.ilkayaktas.cryptowatchdogserver.controller.api.poloniex.model.volume24;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class USDTNXT {

    @SerializedName("USDT")
    @Expose
    public String uSDT;
    @SerializedName("NXT")
    @Expose
    public String nXT;

}
