package com.ilkayaktas.cryptowatchdogserver.controller.api;

import com.ilkayaktas.cryptowatchdogserver.controller.api.binance.endpoint.BinanceService;
import com.ilkayaktas.cryptowatchdogserver.controller.api.bitfinex.endpoint.BitfinexService;
import com.ilkayaktas.cryptowatchdogserver.controller.api.bitflyer.endpoint.BitflyerService;
import com.ilkayaktas.cryptowatchdogserver.controller.api.bithumb.endpoint.BithumbService;
import com.ilkayaktas.cryptowatchdogserver.controller.api.bitstamp.endpoint.BitstampService;
import com.ilkayaktas.cryptowatchdogserver.controller.api.bittrex.endpoint.BittrexService;
import com.ilkayaktas.cryptowatchdogserver.controller.api.btcc.endpoint.BTCCService;
import com.ilkayaktas.cryptowatchdogserver.controller.api.btcturk.endpoint.BTCTurkService;
import com.ilkayaktas.cryptowatchdogserver.controller.api.centralbank.endpoint.CentralBankService;
import com.ilkayaktas.cryptowatchdogserver.controller.api.cexio.endpoint.CexioService;
import com.ilkayaktas.cryptowatchdogserver.controller.api.coinbase.endpoint.CoinbaseService;
import com.ilkayaktas.cryptowatchdogserver.controller.api.coinmarketcap.endpoint.CoinmarketcapService;
import com.ilkayaktas.cryptowatchdogserver.controller.api.gdax.endpoint.GdaxService;
import com.ilkayaktas.cryptowatchdogserver.controller.api.hitbtc.endpoint.HitBTCService;
import com.ilkayaktas.cryptowatchdogserver.controller.api.huobi.endpoint.HuobiService;
import com.ilkayaktas.cryptowatchdogserver.controller.api.koineks.endpoint.KoineksService;
import com.ilkayaktas.cryptowatchdogserver.controller.api.koinim.endpoint.KoinimService;
import com.ilkayaktas.cryptowatchdogserver.controller.api.kraken.endpoint.KrakenService;
import com.ilkayaktas.cryptowatchdogserver.controller.api.okex.endpoint.OkexService;
import com.ilkayaktas.cryptowatchdogserver.controller.api.paribu.endpoint.ParibuService;
import com.ilkayaktas.cryptowatchdogserver.controller.api.poloniex.endpoint.PoloniexService;
import com.ilkayaktas.cryptowatchdogserver.model.app.Ticker;
import io.reactivex.Observable;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by ilkayaktas on 10.06.2018 at 12:18.
 */

public class ApiHelper implements IApiHelper {
    private int nonce = 1;
    @Autowired
    ParibuService paribuService;

    @Autowired
    BTCTurkService btcTurkService;

    @Autowired
    PoloniexService poloniexService;

    @Autowired
    CoinmarketcapService coinmarketcapService;

    @Autowired
    BitstampService bitstampService;

    @Autowired
    BithumbService bithumbService;

    @Autowired
    BitflyerService bitflyerService;

    @Autowired
    BTCCService btccService;

    @Autowired
    BittrexService bittrexService;

    @Autowired
    BitfinexService bitfinexService;

    @Autowired
    GdaxService gdaxService;

    @Autowired
    HitBTCService hitBTCService;

    @Autowired
    CoinbaseService coinbaseService;

    @Autowired
    BinanceService binanceService;

    @Autowired
    CentralBankService centralBankService;

    @Autowired
    KoineksService koineksService;

    @Autowired
    KoinimService koinimService;

    @Autowired
    CexioService cexioService;

    @Autowired
    OkexService okexService;

    @Autowired
    HuobiService huobiService;

    @Autowired
    KrakenService krakenService;
    
    @Override
    public Observable<Ticker> getParibuTicker(Double currency, String symbol) {
        return null;
    }

    @Override
    public Observable<Ticker> getBTCTurkTicker(Double currency, String symbol) {
        return null;
    }

    @Override
    public Observable<Ticker> getPoloniexTicker(String symbol) {
        return null;
    }

    @Override
    public Observable<Ticker> getCoinmarketcapTicker(String id) {
        return null;
    }

    @Override
    public Observable<Ticker> getCurrentCurrencyWithLimit(String limit) {
        return null;
    }

    @Override
    public Observable<Ticker> getBitstampTicker(String currency_pair) {
        return null;
    }

    @Override
    public Observable<Ticker> getBithumbTicker(String symbol) {
        return null;
    }

    @Override
    public Observable<Ticker> getBitflyerTicker(String symbol) {
        return null;
    }

    @Override
    public Observable<Ticker> getBTCCTicker(String symbol) {
        return null;
    }

    @Override
    public Observable<Ticker> getBittrexTicker(String market) {
        return null;
    }

    @Override
    public Observable<Ticker> getBitfinexTicker(String symbol) {
        return null;
    }

    @Override
    public Observable<Ticker> getGdaxTicker(String productID) {
        return null;
    }

    @Override
    public Observable<Ticker> getHitBTCTicker(String tickerSymbol) {
        return null;
    }

    @Override
    public Observable<Ticker> getCoinbaseTicker(String currency) {
        return null;
    }

    @Override
    public Observable<Ticker> getBinanceTicker(String tickerSymbol) {
        return null;
    }

    @Override
    public Observable<Ticker> getKoineksTicker(Double currency, String tickerSymbol) {
        return null;
    }

    @Override
    public Observable<Ticker> getKoinimTicker(Double currency, String tickerSymbol) {
        return null;
    }

    @Override
    public Observable<Ticker> getCexioTicker(String tickerSymbol) {
        return null;
    }

    @Override
    public Observable<Ticker> getOkexTicker(String symbolPair) {
        return null;
    }

    @Override
    public Observable<Ticker> getHuobiTicker(String baseSymbol, String quotaSymbol) {
        return null;
    }

    @Override
    public Observable<Ticker> getKrakenTicker(String symbolPair) {
        return null;
    }
}
