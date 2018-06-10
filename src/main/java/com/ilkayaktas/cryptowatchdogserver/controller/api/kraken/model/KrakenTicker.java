
package com.ilkayaktas.cryptowatchdogserver.controller.api.kraken.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class KrakenTicker {

    @SerializedName("error")
    @Expose
    public List<Object> error = null;
    @SerializedName("result")
    @Expose
    public Result result;

}
