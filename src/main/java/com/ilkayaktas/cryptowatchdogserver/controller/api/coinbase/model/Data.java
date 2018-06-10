
package com.ilkayaktas.cryptowatchdogserver.controller.api.coinbase.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Data {

    @SerializedName("currency")
    @Expose
    public String currency;
    @SerializedName("rates")
    @Expose
    public Rates rates;

}
