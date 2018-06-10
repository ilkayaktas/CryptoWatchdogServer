package com.ilkayaktas.cryptowatchdogserver.controller.api.bittrex.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by aselsan on 17.12.2017 at 01:32.
 */

public class BittrexTicker {

    @SerializedName("result")
    @Expose
    public Result result;
}
