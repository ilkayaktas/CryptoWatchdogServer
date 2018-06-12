package com.ilkayaktas.cryptowatchdogserver.controller.api.binance.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.ToString;

/**
 * Created by aselsan on 20.12.2017 at 00:25.
 */
@ToString
public class BinanceTicker {
    @SerializedName("symbol")
    @Expose
    public String symbol;
    @SerializedName("price")
    @Expose
    public String price;
}
