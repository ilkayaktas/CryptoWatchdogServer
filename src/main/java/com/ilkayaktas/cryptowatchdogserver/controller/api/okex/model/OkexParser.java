package com.ilkayaktas.cryptowatchdogserver.controller.api.okex.model;


import com.ilkayaktas.cryptowatchdogserver.model.app.Ticker;
import com.ilkayaktas.cryptowatchdogserver.model.utils.PriceUtils;

import java.util.Locale;

/**
 * Created by aselsan on 18.01.2018 at 09:34.
 */

public class OkexParser {
    public static Ticker parse(OkexTicker ticker, String symbol, String pairSymbol) {
        return Ticker.builder()
                .last(PriceUtils.formatPrice(ticker.ticker.last))
                .symbol(symbol)
                .icon(symbol.toLowerCase(Locale.ENGLISH))
                .percentChange("0")
                .volume(ticker.ticker.vol)
                .exchangeType(Ticker.ExchangeType.getByValue(pairSymbol.toUpperCase(Locale.ENGLISH)))
                .build();
    }
}
