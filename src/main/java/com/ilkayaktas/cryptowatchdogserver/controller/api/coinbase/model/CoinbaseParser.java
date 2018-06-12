package com.ilkayaktas.cryptowatchdogserver.controller.api.coinbase.model;


import com.ilkayaktas.cryptowatchdogserver.model.app.Ticker;
import com.ilkayaktas.cryptowatchdogserver.model.utils.PriceUtils;

import java.util.Locale;

/**
 * Created by aselsan on 19.12.2017 at 23:40.
 */

public class CoinbaseParser {
    public static Ticker parse(CoinbaseTicker ticker) {
        return Ticker.builder()
                .last(PriceUtils.formatPrice(ticker.data.rates.uSD))
                .symbol(ticker.data.currency)
                .icon(ticker.data.currency.toLowerCase(Locale.ENGLISH))
                .percentChange("0")
                .volume("0")
                .exchangeType(Ticker.ExchangeType.DOLAR)
                .otherCurrency(PriceUtils.formatPrice(ticker.data.rates.bTC))
                .otherCurrencyType(Ticker.ExchangeType.BTC)
                .build();

    }
}
