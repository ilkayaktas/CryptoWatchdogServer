package com.ilkayaktas.cryptowatchdogserver.controller.api.coinmarketcap.model;


import com.ilkayaktas.cryptowatchdogserver.model.app.Ticker;
import com.ilkayaktas.cryptowatchdogserver.model.utils.PriceUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/**
 * Created by aselsan on 16.12.2017 at 14:00.
 */

public class CoinmarketcapParser {

    public static List<Ticker> parse(CoinmarketcapTicker[] tickerList){
        List<Ticker> localTickers = new ArrayList<>();

        for (CoinmarketcapTicker ticker : tickerList) {
            localTickers.add(Ticker.builder()
                    .id(ticker.id)
                    .name(ticker.name)
                    .last(PriceUtils.formatPrice(ticker.priceUsd))
                    .symbol(ticker.symbol)
                    .icon(ticker.symbol.toLowerCase(Locale.ENGLISH))
                    .percentChange(String.valueOf(ticker.percentChange24h))
                    .volume(String.valueOf(ticker._24hVolumeUsd))
                    .exchangeType(Ticker.ExchangeType.DOLAR)
                    .otherCurrency(PriceUtils.formatPrice(ticker.priceBtc))
                    .otherCurrencyType(Ticker.ExchangeType.BTC)
                    .marketCap(ticker.marketCapUsd)
                    .percent1Hour(ticker.percentChange1h)
                    .percent24Hour(ticker.percentChange24h)
                    .percent7Days(ticker.percentChange7d)
                    .build());
        }

        return localTickers;
    }

    public static Ticker parse(CoinmarketcapTicker[] tickerList, String id){
        for (CoinmarketcapTicker ticker : tickerList) {

            if(id.equals(ticker.id)){
                return Ticker.builder()
                        .id(ticker.id)
                        .name(ticker.name)
                        .last(PriceUtils.formatPrice(ticker.priceUsd))
                        .symbol(ticker.symbol)
                        .icon(ticker.symbol.toLowerCase(Locale.ENGLISH))
                        .percentChange(String.valueOf(ticker.percentChange24h))
                        .volume(String.valueOf(ticker._24hVolumeUsd))
                        .exchangeType(Ticker.ExchangeType.DOLAR)
                        .otherCurrency(PriceUtils.formatPrice(ticker.priceBtc))
                        .otherCurrencyType(Ticker.ExchangeType.BTC)
                        .marketCap(ticker.marketCapUsd)
                        .percent1Hour(ticker.percentChange1h)
                        .percent24Hour(ticker.percentChange24h)
                        .percent7Days(ticker.percentChange7d)
                        .build();

            }
        }
        return null;
    }

    public static Ticker parse(CoinmarketcapTicker ticker){

        return Ticker.builder()
                .id(ticker.id)
                .name(ticker.name)
                .last(PriceUtils.formatPrice(ticker.priceUsd))
                .symbol(ticker.symbol)
                .icon(ticker.symbol.toLowerCase(Locale.ENGLISH))
                .percentChange(String.valueOf(ticker.percentChange24h))
                .volume(String.valueOf(ticker._24hVolumeUsd))
                .exchangeType(Ticker.ExchangeType.DOLAR)
                .otherCurrency(PriceUtils.formatPrice(ticker.priceBtc))
                .otherCurrencyType(Ticker.ExchangeType.BTC)
                .marketCap(PriceUtils.formatPrice(ticker.marketCapUsd))
                .percent1Hour(PriceUtils.formatPrice(ticker.percentChange1h))
                .percent24Hour(PriceUtils.formatPrice(ticker.percentChange24h))
                .percent7Days(PriceUtils.formatPrice(ticker.percentChange7d))
                .build();

    }
}
