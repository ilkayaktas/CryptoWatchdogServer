package com.ilkayaktas.cryptowatchdogserver.controller;

import com.ilkayaktas.cryptowatchdogserver.controller.api.IApiHelper;
import com.ilkayaktas.cryptowatchdogserver.controller.db.IDbHelper;
import com.ilkayaktas.cryptowatchdogserver.model.app.Ticker;
import io.reactivex.Observable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by ilkayaktas on 10.06.2018 at 12:18.
 */

@Component
public class DataManager implements IDataManager {

    @Autowired
    @Qualifier(value = "DB")
    private IDbHelper dbHelper;

    @Autowired
    private IApiHelper apiHelper;

    @Override
    public Observable<Ticker> getParibuTicker(Double currency, String symbol) {
        return apiHelper.getParibuTicker(currency, symbol);
    }

    @Override
    public Observable<Ticker> getBTCTurkTicker(Double currency, String symbol) {
        return apiHelper.getBTCTurkTicker(currency, symbol);
    }

    @Override
    public Observable<Ticker> getPoloniexTicker(String symbol) {
        return apiHelper.getPoloniexTicker(symbol);
    }

    @Override
    public Observable<Ticker> getCurrentCurrencyWithLimit(String limit) {
        return apiHelper.getCurrentCurrencyWithLimit(limit);
    }

    @Override
    public Observable<Ticker> getCoinmarketcapTicker(String id) {
        return apiHelper.getCoinmarketcapTicker(id);
    }

    @Override
    public Observable<Ticker> getBitstampTicker(String currency_pair) {
        return apiHelper.getBitstampTicker(currency_pair);
    }

    @Override
    public Observable<Ticker> getBithumbTicker(String symbol) {
        return apiHelper.getBithumbTicker(symbol);
    }

    @Override
    public Observable<Ticker> getBitflyerTicker(String symbol) {
        return apiHelper.getBitflyerTicker(symbol);
    }

    @Override
    public Observable<Ticker> getBTCCTicker(String symbol) {
        return apiHelper.getBTCCTicker(symbol);
    }

    @Override
    public Observable<Ticker> getBittrexTicker(String market) {
        return apiHelper.getBittrexTicker(market);
    }

    @Override
    public Observable<Ticker> getBitfinexTicker(String symbol) {
        return apiHelper.getBitfinexTicker(symbol);
    }

    @Override
    public Observable<Ticker> getGdaxTicker(String productID) {
        return apiHelper.getGdaxTicker(productID);
    }

    @Override
    public Observable<Ticker> getHitBTCTicker(String tickerSymbol) {
        return apiHelper.getHitBTCTicker(tickerSymbol);
    }

    @Override
    public Observable<Ticker> getCoinbaseTicker(String currency) {
        return apiHelper.getCoinbaseTicker(currency);
    }

    @Override
    public Observable<Ticker> getBinanceTicker(String tickerSymbol) {
        return apiHelper.getBinanceTicker(tickerSymbol);
    }

    @Override
    public Observable<Ticker> getKoineksTicker(Double currency, String tickerSymbol) {
        return apiHelper.getKoineksTicker(currency, tickerSymbol);
    }

    @Override
    public Observable<Ticker> getKoinimTicker(Double currency, String tickerSymbol) {
        return apiHelper.getKoinimTicker(currency, tickerSymbol);
    }

    @Override
    public Observable<Ticker> getCexioTicker(String tickerSymbol) {
        return apiHelper.getCexioTicker(tickerSymbol);
    }

    @Override
    public Observable<Ticker> getOkexTicker(String symbolPair) {
        return apiHelper.getOkexTicker(symbolPair);
    }

    @Override
    public Observable<Ticker> getHuobiTicker(String baseSymbol, String quotaSymbol) {
        return apiHelper.getHuobiTicker(baseSymbol, quotaSymbol);
    }

    @Override
    public Observable<Ticker> getKrakenTicker(String symbolPair) {
        return apiHelper.getKrakenTicker(symbolPair);
    }


}
