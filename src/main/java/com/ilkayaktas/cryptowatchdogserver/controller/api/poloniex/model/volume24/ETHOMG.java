
package com.ilkayaktas.cryptowatchdogserver.controller.api.poloniex.model.volume24;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ETHOMG {

    @SerializedName("ETH")
    @Expose
    public String eTH;
    @SerializedName("OMG")
    @Expose
    public String oMG;

}
