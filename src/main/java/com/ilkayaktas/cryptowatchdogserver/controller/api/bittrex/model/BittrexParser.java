package com.ilkayaktas.cryptowatchdogserver.controller.api.bittrex.model;

import com.ilkayaktas.cryptowatchdogserver.model.app.Ticker;
import com.ilkayaktas.cryptowatchdogserver.model.utils.PriceUtils;

import java.util.Locale;

/**
 * Created by aselsan on 17.12.2017 at 01:37.
 */

public class BittrexParser {
    public static Ticker parse(BittrexTicker ticker, String market){
        return Ticker.builder()
                .last(PriceUtils.formatPrice(ticker.result.last))
                .symbol(market.split("-")[1].toUpperCase(Locale.ENGLISH))
                .icon(market.split("-")[1])
                .percentChange("0")
                .highestBid(String.valueOf(ticker.result.bid))
                .volume("0")
                .exchangeType(Ticker.ExchangeType.DOLAR)
                .build();

    }

}
