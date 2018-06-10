
package com.ilkayaktas.cryptowatchdogserver.controller.api.poloniex.model.volume24;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ETHGNT {

    @SerializedName("ETH")
    @Expose
    public String eTH;
    @SerializedName("GNT")
    @Expose
    public String gNT;

}
