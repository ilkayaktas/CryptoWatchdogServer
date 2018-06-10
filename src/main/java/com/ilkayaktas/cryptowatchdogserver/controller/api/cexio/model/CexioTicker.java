
package com.ilkayaktas.cryptowatchdogserver.controller.api.cexio.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CexioTicker {

    @SerializedName("e")
    @Expose
    public String e;
    @SerializedName("ok")
    @Expose
    public String ok;
    @SerializedName("data")
    @Expose
    public List<Datum> data = null;

}
