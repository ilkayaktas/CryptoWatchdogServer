package com.ilkayaktas.cryptowatchdogserver.controller.api.btcc.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by aselsan on 17.12.2017 at 01:10.
 */

public class BTCCTicker {

    @SerializedName("ticker")
    @Expose
    public Ticker ticker;


}
