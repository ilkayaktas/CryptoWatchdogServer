
package com.ilkayaktas.cryptowatchdogserver.controller.api.koineks.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DOGE {

    @SerializedName("short_code")
    @Expose
    public String shortCode;
    @SerializedName("name")
    @Expose
    public String name;
    @SerializedName("currency")
    @Expose
    public String currency;
    @SerializedName("current")
    @Expose
    public String current;
    @SerializedName("change_amount")
    @Expose
    public String changeAmount;
    @SerializedName("change_percentage")
    @Expose
    public String changePercentage;
    @SerializedName("high")
    @Expose
    public String high;
    @SerializedName("low")
    @Expose
    public String low;
    @SerializedName("volume")
    @Expose
    public double volume;
    @SerializedName("ask")
    @Expose
    public String ask;
    @SerializedName("bid")
    @Expose
    public String bid;
    @SerializedName("timestamp")
    @Expose
    public String timestamp;

}
