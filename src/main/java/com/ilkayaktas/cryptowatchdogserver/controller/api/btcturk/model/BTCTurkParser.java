package com.ilkayaktas.cryptowatchdogserver.controller.api.btcturk.model;


import com.ilkayaktas.cryptowatchdogserver.model.app.Ticker;
import com.ilkayaktas.cryptowatchdogserver.model.utils.PriceUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by aselsan on 16.12.2017 at 01:58.
 */

public class BTCTurkParser {
    public static List<Ticker> parse(BTCTurkTicker[] tickerList, Double currency){
        List<Ticker> localTickers = new ArrayList<>();

        localTickers.add(parseBTC(tickerList[0], currency));

        localTickers.add(parseETH(tickerList[2], currency));

        return localTickers;
    }

    public static Ticker parse(BTCTurkTicker[] btcTurkTicker, Double currency, String symbol){
        if(symbol.equals("BTC")){
            return parseBTC(btcTurkTicker[0], currency);
        } else if(symbol.equals("ETH")){
            return parseETH(btcTurkTicker[2], currency);
        } else{
            return null;
        }

    }

    private static Ticker parseETH(BTCTurkTicker btcTurkTicker, Double currency) {
        return Ticker.builder()
                .last(PriceUtils.formatPrice(btcTurkTicker.last))
                .symbol("ETH")
                .icon("eth")
                .percentChange("0")
                .high24hr(String.valueOf(btcTurkTicker.high))
                .volume(String.valueOf(btcTurkTicker.volume))
                .exchangeType(Ticker.ExchangeType.TL)
                .otherCurrencyType(Ticker.ExchangeType.DOLAR)
                .otherCurrency(calculateAsDolar(btcTurkTicker.last, currency))
                .build();
    }

    private static Ticker parseBTC(BTCTurkTicker btcTurkTicker, Double currency) {
        return Ticker.builder()
                .last(PriceUtils.formatPrice(btcTurkTicker.last))
                .symbol("BTC")
                .icon("btc")
                .percentChange("0")
                .high24hr(String.valueOf(btcTurkTicker.high))
                .volume(String.valueOf(btcTurkTicker.volume))
                .exchangeType(Ticker.ExchangeType.TL)
                .otherCurrencyType(Ticker.ExchangeType.DOLAR)
                .otherCurrency(calculateAsDolar(btcTurkTicker.last, currency))
                .build();
    }

    private static Ticker parseOther(BTCTurkTicker btcTurkTicker, Double currency){
        return Ticker.builder()
                .last(PriceUtils.formatPrice(btcTurkTicker.last))
                .symbol("ETH")
                .icon("eth")
                .percentChange("0")
                .high24hr(String.valueOf(btcTurkTicker.high))
                .volume(String.valueOf(btcTurkTicker.volume))
                .exchangeType(Ticker.ExchangeType.BTC)
                .otherCurrencyType(Ticker.ExchangeType.DOLAR)
                .otherCurrency(calculateAsDolar(btcTurkTicker.last, currency))
                .build();
    }

    private static String calculateAsDolar(double tlValue, double oneDolarPriceAsTl){
        return PriceUtils.formatPrice(tlValue / oneDolarPriceAsTl);
    }
}
