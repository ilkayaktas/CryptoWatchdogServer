package com.ilkayaktas.cryptowatchdogserver.controller.api.cexio.model;


import com.ilkayaktas.cryptowatchdogserver.model.app.Ticker;
import com.ilkayaktas.cryptowatchdogserver.model.utils.PriceUtils;

import java.util.*;

/**
 * Created by aselsan on 18.01.2018 at 09:34.
 */

public class CexioParser {
    public static List<Ticker> parse(CexioTicker ticker) {
        Map<String, Ticker> tickerMap = new HashMap();
        for (Datum datum : ticker.data) {
            if(datum.pair.endsWith("BTC")){
                String symbol = datum.pair.split(":")[0];
                Ticker l = tickerMap.get(symbol);
                if(l == null){
                    l = Ticker.builder()
                            .last(PriceUtils.formatPrice(datum.last))
                            .symbol(symbol)
                            .icon(symbol.toLowerCase(Locale.ENGLISH))
                            .percentChange("0")
                            .volume(datum.volume)
                            .exchangeType(Ticker.ExchangeType.BTC)
                            .build();
                } else{
                    l.otherCurrencyType = Ticker.ExchangeType.BTC;
                    l.otherCurrency = PriceUtils.formatPrice(datum.last);
                }
                tickerMap.put(symbol, l);
            } else{
                String symbol = datum.pair.split(":")[0];
                Ticker l = Ticker.builder()
                        .last(PriceUtils.formatPrice(datum.last))
                        .symbol(symbol)
                        .icon(symbol.toLowerCase(Locale.ENGLISH))
                        .percentChange("0")
                        .volume(datum.volume)
                        .exchangeType(Ticker.ExchangeType.DOLAR)
                        .build();

                tickerMap.put(symbol, l);
            }
        }
        List<Ticker> list = new ArrayList<>(tickerMap.values());
        Collections.sort(list, (firstTicker, secondTicker) ->
                Double.valueOf(firstTicker.last.replace(",", ".")) >
                        Double.valueOf(secondTicker.last.replace(",", ".")) ? -1 : 1);
        return list;
    }

    public static Ticker parse(CexioTicker ticker, String tickerSymbol) {
        for (Datum datum : ticker.data) {
            if(datum.pair.equals(tickerSymbol+":USD")) {
                return Ticker.builder()
                        .last(PriceUtils.formatPrice(datum.last))
                        .symbol(tickerSymbol)
                        .icon(tickerSymbol.toLowerCase(Locale.ENGLISH))
                        .percentChange("0")
                        .volume(datum.volume)
                        .exchangeType(Ticker.ExchangeType.DOLAR)
                        .build();
            }
        }

        return null;
    }
}
