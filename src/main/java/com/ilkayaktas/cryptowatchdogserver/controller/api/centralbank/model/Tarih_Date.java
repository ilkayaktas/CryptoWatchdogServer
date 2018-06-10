package com.ilkayaktas.cryptowatchdogserver.controller.api.centralbank.model;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.List;

/**
 * Created by aselsan on 23.12.2017 at 22:31.
 */

@Root(name = "Tarih_Date")
public class Tarih_Date {
    @Attribute
    public String Tarih;

    @Attribute
    public String Date;

    @Attribute
    public String Bulten_No;

    @ElementList(inline=true)
    public List<Currency> Currency;
}