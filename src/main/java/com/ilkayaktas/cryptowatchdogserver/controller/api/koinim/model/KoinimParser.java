package com.ilkayaktas.cryptowatchdogserver.controller.api.koinim.model;


import com.ilkayaktas.cryptowatchdogserver.controller.api.koinim.model.KoinimTicker;
import com.ilkayaktas.cryptowatchdogserver.model.app.Ticker;
import com.ilkayaktas.cryptowatchdogserver.model.utils.PriceUtils;

import java.util.Locale;

/**
 * Created by aselsan on 3.01.2018 at 12:39.
 */

public class KoinimParser {

    private static String calculateAsDolar(double tlValue, double oneDolarPriceAsTl){
        return PriceUtils.formatPrice(tlValue / oneDolarPriceAsTl);
    }

    public static Ticker parse(KoinimTicker ticker, Double currency, String symbol) {
        return Ticker.builder()
                .last(PriceUtils.formatPrice(ticker.buy))
                .symbol(symbol)
                .icon(symbol.toLowerCase(Locale.ENGLISH))
                .percentChange(String.valueOf(ticker.changeRate))
                .volume(String.valueOf(ticker.volume))
                .exchangeType(Ticker.ExchangeType.TL)
                .otherCurrencyType(Ticker.ExchangeType.DOLAR)
                .otherCurrency(calculateAsDolar(ticker.buy, currency))
                .build();
    }

}
