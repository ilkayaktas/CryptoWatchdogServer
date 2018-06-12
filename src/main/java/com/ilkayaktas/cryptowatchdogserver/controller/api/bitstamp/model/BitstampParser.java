package com.ilkayaktas.cryptowatchdogserver.controller.api.bitstamp.model;


import com.ilkayaktas.cryptowatchdogserver.model.app.Ticker;
import com.ilkayaktas.cryptowatchdogserver.model.utils.PriceUtils;

import java.util.Locale;

/**
 * Created by aselsan on 16.12.2017 at 14:49.
 */

public class BitstampParser {
    public static Ticker parse(BitstampTicker ticker, String currency_pair){

        if(currency_pair.endsWith("btc")){
            return parseBTC(ticker, currency_pair.split("btc")[0], Ticker.ExchangeType.BTC);
        } else if(currency_pair.endsWith("usd")){
            return parseBTC(ticker, currency_pair.split("usd")[0], Ticker.ExchangeType.DOLAR);
        } else{
            return null;
        }
    }

    private static Ticker parseBTC(BitstampTicker ticker, String symbol, Ticker.ExchangeType exchangeType) {
        return Ticker.builder()
                .last(PriceUtils.formatPrice(ticker.last))
                .symbol(symbol.toUpperCase(Locale.ENGLISH))
                .icon(symbol)
                .percentChange("0")
                .high24hr(ticker.high)
                .highestBid(ticker.bid)
                .volume(ticker.volume)
                .exchangeType(exchangeType)
                .build();
    }
}
