package com.ilkayaktas.cryptowatchdogserver.controller.api.bitfinex.model;


import com.ilkayaktas.cryptowatchdogserver.model.app.Ticker;
import com.ilkayaktas.cryptowatchdogserver.model.utils.PriceUtils;

import java.util.Locale;

/**
 * Created by aselsan on 17.12.2017 at 02:24.
 */

public class BitfinexParser {
    public static Ticker parse(BitfinexTicker ticker, String currencyPair) {


        if(currencyPair.endsWith("btc")){
            return Ticker.builder()
                    .last(PriceUtils.formatPrice(ticker.lastPrice))
                    .symbol(currencyPair.split("btc")[0].toUpperCase(Locale.ENGLISH))
                    .icon(currencyPair.split("btc")[0])
                    .percentChange("0")
                    .highestBid(ticker.bid)
                    .volume("0")
                    .exchangeType(Ticker.ExchangeType.BTC)
                    .build();

        } else if(currencyPair.endsWith("usd")){
            return Ticker.builder()
                    .last(PriceUtils.formatPrice(ticker.lastPrice))
                    .symbol(currencyPair.split("usd")[0].toUpperCase(Locale.ENGLISH))
                    .icon(currencyPair.split("usd")[0])
                    .percentChange("0")
                    .highestBid(ticker.bid)
                    .volume("0")
                    .exchangeType(Ticker.ExchangeType.DOLAR)
                    .build();

        } else{
            return null;
        }

    }
}
