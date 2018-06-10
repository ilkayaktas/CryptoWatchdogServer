
package com.ilkayaktas.cryptowatchdogserver.controller.api.bithumb.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BithumbTicker {

    @SerializedName("status")
    @Expose
    public String status;
    @SerializedName("data")
    @Expose
    public Data data;

}
