package com.ilkayaktas.cryptowatchdogserver.controller.api.btcc.model;


import com.ilkayaktas.cryptowatchdogserver.model.app.Ticker;
import com.ilkayaktas.cryptowatchdogserver.model.utils.PriceUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by aselsan on 17.12.2017 at 01:14.
 */

public class BTCCParser {
    public static List<Ticker> parse(BTCCTicker ticker){
        List<Ticker> localTickers = new ArrayList<>();

        localTickers.add(parseBTC(ticker));

        return localTickers;
    }

    public static Ticker parse(BTCCTicker ticker, String symbol){
        if(symbol.equals("BTC")){
            return parseBTC(ticker);
        } else{
            return null;
        }
    }

    private static Ticker parseBTC(BTCCTicker ticker) {
        return Ticker.builder()
                .last(PriceUtils.formatPrice(ticker.ticker.last))
                .symbol("BTC")
                .icon("btc")
                .percentChange("0")
                .high24hr(String.valueOf(ticker.ticker.high))
                .highestBid(String.valueOf(ticker.ticker.bidPrice))
                .volume(String.valueOf(ticker.ticker.volume))
                .exchangeType(Ticker.ExchangeType.DOLAR)
                .build();
    }
}
