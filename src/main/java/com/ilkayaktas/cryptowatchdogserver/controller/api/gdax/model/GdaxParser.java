package com.ilkayaktas.cryptowatchdogserver.controller.api.gdax.model;


import com.ilkayaktas.cryptowatchdogserver.controller.api.gdax.model.GdaxTicker;
import com.ilkayaktas.cryptowatchdogserver.model.app.Ticker;
import com.ilkayaktas.cryptowatchdogserver.model.utils.PriceUtils;

import java.util.Locale;

/**
 * Created by aselsan on 17.12.2017 at 02:40.
 */

public class GdaxParser {
    public static Ticker parse(GdaxTicker ticker, String productID) {
        return Ticker.builder()
                .last(PriceUtils.formatPrice(ticker.price))
                .symbol(productID.split("-")[0])
                .icon(productID.split("-")[0].toLowerCase(Locale.ENGLISH))
                .percentChange("0")
                .highestBid(ticker.bid)
                .volume(ticker.volume)
                .exchangeType(Ticker.ExchangeType.DOLAR)
                .build();

    }
}
