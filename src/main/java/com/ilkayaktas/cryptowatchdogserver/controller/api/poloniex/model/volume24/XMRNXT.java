
package com.ilkayaktas.cryptowatchdogserver.controller.api.poloniex.model.volume24;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class XMRNXT {

    @SerializedName("XMR")
    @Expose
    public String xMR;
    @SerializedName("NXT")
    @Expose
    public String nXT;

}
