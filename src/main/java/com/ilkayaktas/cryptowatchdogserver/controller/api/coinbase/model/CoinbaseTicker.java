
package com.ilkayaktas.cryptowatchdogserver.controller.api.coinbase.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CoinbaseTicker {

    @SerializedName("data")
    @Expose
    public Data data;

}
