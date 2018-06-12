package com.ilkayaktas.cryptowatchdogserver.controller.api.bitflyer.model;


import com.ilkayaktas.cryptowatchdogserver.model.app.Ticker;
import com.ilkayaktas.cryptowatchdogserver.model.utils.PriceUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by aselsan on 17.12.2017 at 01:00.
 */

public class BitflyerParser {
    public static List<Ticker> parse(BitflyerTicker ticker){
        List<Ticker> localTickers = new ArrayList<>();

        localTickers.add(parseBTC(ticker));

        return localTickers;
    }

    public static Ticker parse(BitflyerTicker ticker, String symbol){
        if(symbol.equals("BTC")){
            return parseBTC(ticker);
        } else{
            return null;
        }
    }
    private static Ticker parseBTC(BitflyerTicker ticker) {
        return Ticker.builder()
                .last(PriceUtils.formatPrice(ticker.ltp))
                .symbol("BTC")
                .icon("btc")
                .percentChange("0")
                .highestBid(String.valueOf(ticker.bestBid))
                .volume(String.valueOf(ticker.volume))
                .exchangeType(Ticker.ExchangeType.JPY)
                .build();
    }
}
