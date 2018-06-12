package com.ilkayaktas.cryptowatchdogserver.controller.api.binance.model;


import com.ilkayaktas.cryptowatchdogserver.model.app.Ticker;
import com.ilkayaktas.cryptowatchdogserver.model.utils.PriceUtils;

import java.util.*;

/**
 * Created by aselsan on 20.12.2017 at 00:29.
 */

public class BinanceParser {
    public static List<Ticker> parse(BinanceTicker[] tickerList) {
        Map<String, Ticker> localTickerMap = new HashMap<>();

        // find usb value
        for (BinanceTicker ticker : tickerList) {
            if(ticker.symbol.endsWith("USDT")){
                Ticker l = Ticker.builder()
                        .last(PriceUtils.formatPrice(ticker.price))
                        .symbol(ticker.symbol.split("USDT")[0])
                        .icon(ticker.symbol.split("USDT")[0].toLowerCase(Locale.ENGLISH))
                        .percentChange("0")
                        .volume("0")
                        .exchangeType(Ticker.ExchangeType.DOLAR)
                        .build();

                localTickerMap.put(l.symbol, l);
            }
        }

        for (BinanceTicker ticker : tickerList) {
            if (ticker.symbol.endsWith("BTC")) {
                String symbol = ticker.symbol.split("BTC")[0];

                if(localTickerMap.containsKey(symbol)){
                    Ticker localTicker = localTickerMap.get(symbol);
                    localTicker.otherCurrencyType = Ticker.ExchangeType.BTC;
                    localTicker.otherCurrency = PriceUtils.formatPrice(ticker.price);
                    localTickerMap.put(symbol, localTicker);
                } else{
                    Ticker l = Ticker.builder()
                            .last(PriceUtils.formatPrice(ticker.price))
                            .symbol(symbol)
                            .icon(symbol.toLowerCase())
                            .percentChange("0")
                            .volume("0")
                            .exchangeType(Ticker.ExchangeType.BTC)
                            .build();

                    localTickerMap.put(symbol, l);
                }

            }
        }
        List<Ticker> list = new ArrayList<>(localTickerMap.values());
        Collections.sort(list, (firstTicker, secondTicker) ->
                Double.valueOf(firstTicker.last.replace(",", ".")) >
                        Double.valueOf(secondTicker.last.replace(",", ".")) ? -1 : 1);
        return list;
    }

    public static Ticker parse(BinanceTicker[] tickerList, String symbol){
        List<Ticker> tickers = parse(tickerList);

        for (Ticker ticker : tickers) {
            if(ticker.symbol.equals(symbol)){
                return ticker;
            }
        }
        return null;
    }
}
