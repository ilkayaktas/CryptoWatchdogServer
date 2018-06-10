
package com.ilkayaktas.cryptowatchdogserver.controller.api.bithumb.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class EOS {

    @SerializedName("opening_price")
    @Expose
    public String openingPrice;
    @SerializedName("closing_price")
    @Expose
    public String closingPrice;
    @SerializedName("min_price")
    @Expose
    public String minPrice;
    @SerializedName("max_price")
    @Expose
    public String maxPrice;
    @SerializedName("average_price")
    @Expose
    public String averagePrice;
    @SerializedName("units_traded")
    @Expose
    public String unitsTraded;
    @SerializedName("volume_1day")
    @Expose
    public String volume1day;
    @SerializedName("volume_7day")
    @Expose
    public String volume7day;
    @SerializedName("buy_price")
    @Expose
    public String buyPrice;
    @SerializedName("sell_price")
    @Expose
    public String sellPrice;

}
