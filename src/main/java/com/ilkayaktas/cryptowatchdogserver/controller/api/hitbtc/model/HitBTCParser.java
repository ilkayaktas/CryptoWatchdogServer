package com.ilkayaktas.cryptowatchdogserver.controller.api.hitbtc.model;


import com.ilkayaktas.cryptowatchdogserver.controller.api.hitbtc.model.HitBTCTicker;
import com.ilkayaktas.cryptowatchdogserver.model.app.Ticker;
import com.ilkayaktas.cryptowatchdogserver.model.utils.PriceUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/**
 * Created by aselsan on 19.12.2017 at 23:13.
 */

public class HitBTCParser {
    public static List<Ticker> parse(HitBTCTicker[] tickerList){
        List<Ticker> localTickers = new ArrayList<>();

        for (HitBTCTicker ticker : tickerList) {
            if(ticker.symbol.endsWith("USD")){
                localTickers.add(Ticker.builder()
                        .last(PriceUtils.formatPrice(ticker.last))
                        .symbol(ticker.symbol.split("USD")[0])
                        .icon(ticker.symbol.split("USD")[0].toLowerCase(Locale.ENGLISH))
                        .percentChange("0")
                        .volume(String.valueOf(ticker.volume))
                        .exchangeType(Ticker.ExchangeType.DOLAR)
                        .build());
            }
        }

        return localTickers;
    }

    public static Ticker parse(HitBTCTicker[] tickerList, String symbol){
        List<Ticker> localTickers = parse(tickerList);

        for (Ticker ticker : localTickers) {
            if(ticker.symbol.equals(symbol)){
                return ticker;
            }
        }
        return null;
    }

}
