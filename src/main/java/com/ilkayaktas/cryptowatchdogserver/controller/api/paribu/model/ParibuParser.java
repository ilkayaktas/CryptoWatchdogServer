package com.ilkayaktas.cryptowatchdogserver.controller.api.paribu.model;


import com.ilkayaktas.cryptowatchdogserver.controller.api.paribu.model.ParibuTicker;
import com.ilkayaktas.cryptowatchdogserver.model.app.Ticker;
import com.ilkayaktas.cryptowatchdogserver.model.utils.PriceUtils;

/**
 * Created by aselsan on 20.12.2017 at 17:43.
 */

public class ParibuParser {
    public static Ticker parse(ParibuTicker ticker, Double currency) {
        return Ticker.builder()
                .last(PriceUtils.formatPrice(ticker.bTCTL.last))
                .symbol("BTC")
                .icon("btc")
                .percentChange(PriceUtils.formatPrice(ticker.bTCTL.percentChange))
                .high24hr(PriceUtils.formatPrice((double)ticker.bTCTL.high24hr))
                .volume(PriceUtils.formatPrice(ticker.bTCTL.volume))
                .exchangeType(Ticker.ExchangeType.TL)
                .otherCurrencyType(Ticker.ExchangeType.DOLAR)
                .otherCurrency(calculateAsDolar(ticker.bTCTL.last, currency))
                .build();
    }

    public static Ticker parse(ParibuTicker ticker, Double currency, String symbol) {
        if(symbol.equals("BTC")){
            return parse(ticker, currency);
        }
        return null;
    }


    private static String calculateAsDolar(double tlValue, double oneDolarPriceAsTl){
        return PriceUtils.formatPrice(tlValue / oneDolarPriceAsTl);
    }
}
