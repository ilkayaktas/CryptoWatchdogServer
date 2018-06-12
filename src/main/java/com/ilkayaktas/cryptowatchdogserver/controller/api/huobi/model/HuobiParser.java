package com.ilkayaktas.cryptowatchdogserver.controller.api.huobi.model;


import com.ilkayaktas.cryptowatchdogserver.controller.api.huobi.model.HuobiTicker;
import com.ilkayaktas.cryptowatchdogserver.model.app.Ticker;
import com.ilkayaktas.cryptowatchdogserver.model.utils.PriceUtils;

import java.util.Locale;

/**
 * Created by ilkayaktas on 19.02.2018 at 15:52.
 */

public class HuobiParser {
    public static Ticker parse(HuobiTicker ticker, String base, String quota){
        return Ticker.builder()
                .last(PriceUtils.formatPrice(ticker.tick.amount))
                .symbol(base.toUpperCase(Locale.ENGLISH))
                .icon(base.toLowerCase(Locale.ENGLISH))
                .percentChange("0")
                .volume(PriceUtils.formatPrice(ticker.tick.vol))
                .exchangeType(Ticker.ExchangeType.DOLAR)
                .build();
    }
}
