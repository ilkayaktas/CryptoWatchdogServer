package com.ilkayaktas.cryptowatchdogserver.controller.api.centralbank.model;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Created by aselsan on 23.12.2017 at 14:52.
 */

@Root(name = "Currency")
public class Currency {
    @Attribute
    public String CrossOrder;

    @Attribute
    public String Kod;

    @Attribute
    public String CurrencyCode;

    @Element
    public String Unit;

    @Element
    public String Isim;

    @Element
    public String CurrencyName;

    @Element(required=false)
    public String ForexBuying;

    @Element(required=false)
    public String ForexSelling;

    @Element(required=false)
    public String BanknoteBuying;

    @Element(required=false)
    public String BanknoteSelling;

    @Element(required=false)
    public String CrossRateUSD;

    @Element(required=false)
    public String CrossRateOther;

}