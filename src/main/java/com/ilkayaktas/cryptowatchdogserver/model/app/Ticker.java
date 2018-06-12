package com.ilkayaktas.cryptowatchdogserver.model.app;

import lombok.Builder;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by aselsan on 14.12.2017 at 02:44.
 */

@Data
@Builder
public class Ticker {
    @Builder.Default private long created = System.currentTimeMillis();
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
    public String percentChange;
    public String percent1Hour;
    public String percent24Hour;
    public String percent7Days;

    public ExchangeType exchangeType;
    public String otherCurrency;
    public ExchangeType otherCurrencyType;

    public enum ExchangeType{
        DOLAR ("USD"),
        TL("TL"),
        JPY("JPY"),
        BTC("BTC");

        private final String value;

        ExchangeType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        // Reverse-lookup map for getting a day from an abbreviation
        private static final Map<String, ExchangeType> lookup = new HashMap<>();

        static {
            for (ExchangeType d : ExchangeType.values()) {
                lookup.put(d.getValue(), d);
            }
        }

        public static ExchangeType getByValue(String value){
            return lookup.get(value);
        }
    }
}
