package com.ilkayaktas.cryptowatchdogserver.controller.api.koineks.model;


import com.ilkayaktas.cryptowatchdogserver.model.app.Ticker;
import com.ilkayaktas.cryptowatchdogserver.model.utils.PriceUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/**
 * Created by aselsan on 3.01.2018 at 12:38.
 */

public class KoineksParser {
    public static List<Ticker> parse(KoineksTicker ticker, Double currency) {
        List<Ticker> tickerList = new ArrayList<>();
        tickerList.add(parseBTC(ticker, currency));

        tickerList.add(parseETH(ticker, currency));

        tickerList.add(parseLTC(ticker, currency));

        tickerList.add(parseDASH(ticker, currency));

        tickerList.add(parseDOGE(ticker, currency));

        return tickerList;
    }

    private static String calculateAsDolar(double tlValue, double oneDolarPriceAsTl){
        return PriceUtils.formatPrice(tlValue / oneDolarPriceAsTl);
    }

    private static Ticker parseDOGE(KoineksTicker ticker, Double currency) {
        return Ticker.builder()
                .last(PriceUtils.formatPrice(ticker.dOGE.current))
                .symbol(ticker.dOGE.shortCode)
                .icon(ticker.dOGE.shortCode.toLowerCase(Locale.ENGLISH))
                .percentChange(ticker.dOGE.changePercentage)
                .volume(String.valueOf(ticker.dOGE.volume))
                .exchangeType(Ticker.ExchangeType.TL)
                .otherCurrencyType(Ticker.ExchangeType.DOLAR)
                .otherCurrency(calculateAsDolar(Double.valueOf(ticker.dOGE.current), currency))
                .build();
    }

    private static Ticker parseDASH(KoineksTicker ticker, Double currency) {
        return Ticker.builder()
                .last(PriceUtils.formatPrice(ticker.dASH.current))
                .symbol(ticker.dASH.shortCode)
                .icon(ticker.dASH.shortCode.toLowerCase(Locale.ENGLISH))
                .percentChange(ticker.dASH.changePercentage)
                .volume(String.valueOf(ticker.dASH.volume))
                .exchangeType(Ticker.ExchangeType.TL)
                .otherCurrencyType(Ticker.ExchangeType.DOLAR)
                .otherCurrency(calculateAsDolar(Double.valueOf(ticker.dASH.current), currency))
                .build();
    }

    private static Ticker parseLTC(KoineksTicker ticker, Double currency) {
        return Ticker.builder()
                .last(PriceUtils.formatPrice(ticker.lTC.current))
                .symbol(ticker.lTC.shortCode)
                .icon(ticker.lTC.shortCode.toLowerCase(Locale.ENGLISH))
                .percentChange(ticker.lTC.changePercentage)
                .volume(String.valueOf(ticker.lTC.volume))
                .exchangeType(Ticker.ExchangeType.TL)
                .otherCurrencyType(Ticker.ExchangeType.DOLAR)
                .otherCurrency(calculateAsDolar(Double.valueOf(ticker.lTC.current), currency))
                .build();
    }

    private static Ticker parseETH(KoineksTicker ticker, Double currency) {
        return Ticker.builder()
                .last(PriceUtils.formatPrice(ticker.eTH.current))
                .symbol(ticker.eTH.shortCode)
                .icon(ticker.eTH.shortCode.toLowerCase(Locale.ENGLISH))
                .percentChange(ticker.eTH.changePercentage)
                .volume(String.valueOf(ticker.eTH.volume))
                .exchangeType(Ticker.ExchangeType.TL)
                .otherCurrencyType(Ticker.ExchangeType.DOLAR)
                .otherCurrency(calculateAsDolar(Double.valueOf(ticker.eTH.current), currency))
                .build();
    }

    private static Ticker parseBTC(KoineksTicker ticker, Double currency) {
        return Ticker.builder()
                .last(PriceUtils.formatPrice(ticker.bTC.current))
                .symbol(ticker.bTC.shortCode)
                .icon(ticker.bTC.shortCode.toLowerCase(Locale.ENGLISH))
                .percentChange(ticker.bTC.changePercentage)
                .volume(String.valueOf(ticker.bTC.volume))
                .exchangeType(Ticker.ExchangeType.TL)
                .otherCurrencyType(Ticker.ExchangeType.DOLAR)
                .otherCurrency(calculateAsDolar(Double.valueOf(ticker.bTC.current), currency))
                .build();
    }
}
