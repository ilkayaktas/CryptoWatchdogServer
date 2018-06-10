
package com.ilkayaktas.cryptowatchdogserver.controller.api.poloniex.model.volume24;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ETHETC {

    @SerializedName("ETH")
    @Expose
    public String eTH;
    @SerializedName("ETC")
    @Expose
    public String eTC;

}
