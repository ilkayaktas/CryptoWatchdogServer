
package com.ilkayaktas.cryptowatchdogserver.controller.api.bithumb.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Data {

    @SerializedName("BTC")
    @Expose
    public BTC bTC;
    @SerializedName("ETH")
    @Expose
    public ETH eTH;
    @SerializedName("DASH")
    @Expose
    public DASH dASH;
    @SerializedName("LTC")
    @Expose
    public LTC lTC;
    @SerializedName("ETC")
    @Expose
    public com.ilkayaktas.cryptowatchdogserver.controller.api.bithumb.model.ETC eTC;
    @SerializedName("XRP")
    @Expose
    public com.ilkayaktas.cryptowatchdogserver.controller.api.bithumb.model.XRP xRP;
    @SerializedName("BCH")
    @Expose
    public BCH bCH;
    @SerializedName("XMR")
    @Expose
    public com.ilkayaktas.cryptowatchdogserver.controller.api.bithumb.model.XMR xMR;
    @SerializedName("ZEC")
    @Expose
    public com.ilkayaktas.cryptowatchdogserver.controller.api.bithumb.model.ZEC zEC;
    @SerializedName("QTUM")
    @Expose
    public com.ilkayaktas.cryptowatchdogserver.controller.api.bithumb.model.QTUM qTUM;
    @SerializedName("BTG")
    @Expose
    public BTG bTG;
    @SerializedName("EOS")
    @Expose
    public com.ilkayaktas.cryptowatchdogserver.controller.api.bithumb.model.EOS eOS;
    @SerializedName("date")
    @Expose
    public String date;

}
