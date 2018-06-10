package com.ilkayaktas.cryptowatchdogserver.controller.api;

import com.ilkayaktas.cryptowatchdogserver.model.app.Ticker;
import io.reactivex.Observable;

/**
 * Created by ilkayaktas on 10.06.2018 at 12:16.
 */

public interface IApiHelper {
    Observable<Ticker> getParibuTicker(Double currency, String symbol);
    Observable<Ticker>  getBTCTurkTicker(Double currency, String symbol);
    Observable<Ticker> getPoloniexTicker(String symbol);
    Observable<Ticker> getCoinmarketcapTicker(String id);
    Observable<Ticker> getCurrentCurrencyWithLimit(String limit);
    Observable<Ticker> getBitstampTicker(String currency_pair);
    Observable<Ticker> getBithumbTicker(String symbol);
    Observable<Ticker> getBitflyerTicker(String symbol);
    Observable<Ticker> getBTCCTicker(String symbol);
    Observable<Ticker> getBittrexTicker(String market);
    Observable<Ticker> getBitfinexTicker(String symbol);
    Observable<Ticker> getGdaxTicker(String productID);
    Observable<Ticker> getHitBTCTicker(String tickerSymbol);
    Observable<Ticker> getCoinbaseTicker(String currency);
    Observable<Ticker> getBinanceTicker(String tickerSymbol);
    Observable<Ticker> getKoineksTicker(Double currency, String tickerSymbol);
    Observable<Ticker> getKoinimTicker(Double currency, String tickerSymbol);
    Observable<Ticker> getCexioTicker(String tickerSymbol);
    Observable<Ticker> getOkexTicker(String symbolPair);
    Observable<Ticker> getHuobiTicker(String baseSymbol, String quotaSymbol);
    Observable<Ticker> getKrakenTicker(String symbolPair);
}
