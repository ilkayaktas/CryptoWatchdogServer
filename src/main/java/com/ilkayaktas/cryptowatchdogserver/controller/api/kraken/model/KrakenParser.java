package com.ilkayaktas.cryptowatchdogserver.controller.api.kraken.model;


import com.ilkayaktas.cryptowatchdogserver.controller.api.kraken.model.KrakenTicker;
import com.ilkayaktas.cryptowatchdogserver.model.app.Ticker;
import com.ilkayaktas.cryptowatchdogserver.model.utils.PriceUtils;

import java.util.Locale;

/**
 * Created by ilkayaktas on 19.02.2018 at 15:52.
 */

public class KrakenParser {
    public static Ticker parse(KrakenTicker ticker, String symbolPair){
        return Ticker.builder()
                .last(PriceUtils.formatPrice(ticker.result.c.get(0)))
                .symbol(symbolPair.replace("USD",""))
                .icon(symbolPair.replace("USD","").toLowerCase(Locale.ENGLISH))
                .percentChange("0")
                .volume(PriceUtils.formatPrice(ticker.result.c.get(1)))
                .exchangeType(Ticker.ExchangeType.DOLAR)
                .build();
    }
}
