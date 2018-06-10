package com.ilkayaktas.cryptowatchdogserver.model.app;

import lombok.Data;

/**
 * Created by aselsan on 14.12.2017 at 02:44.
 */

@Data
public class Ticker {
    public String id;
    public String name;
    public String symbol;
    public String icon;
    public String last;
    public String lowestAsk;
    public String highestBid;
    public String volume;
    public String high24hr;
    public String low24hr;
    public String marketCap;
    public String percent1Hour;
    public String percent24Hour;
    public String percent7Days;
}
