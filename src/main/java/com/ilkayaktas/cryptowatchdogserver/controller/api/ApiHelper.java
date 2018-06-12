package com.ilkayaktas.cryptowatchdogserver.controller.api;

import com.google.gson.Gson;
import com.ilkayaktas.cryptowatchdogserver.controller.api.binance.endpoint.BinanceService;
import com.ilkayaktas.cryptowatchdogserver.controller.api.binance.model.BinanceParser;
import com.ilkayaktas.cryptowatchdogserver.controller.api.bitfinex.endpoint.BitfinexService;
import com.ilkayaktas.cryptowatchdogserver.controller.api.bitfinex.model.BitfinexParser;
import com.ilkayaktas.cryptowatchdogserver.controller.api.bitflyer.endpoint.BitflyerService;
import com.ilkayaktas.cryptowatchdogserver.controller.api.bitflyer.model.BitflyerParser;
import com.ilkayaktas.cryptowatchdogserver.controller.api.bithumb.endpoint.BithumbService;
import com.ilkayaktas.cryptowatchdogserver.controller.api.bithumb.model.BithumbParser;
import com.ilkayaktas.cryptowatchdogserver.controller.api.bitstamp.endpoint.BitstampService;
import com.ilkayaktas.cryptowatchdogserver.controller.api.bitstamp.model.BitstampParser;
import com.ilkayaktas.cryptowatchdogserver.controller.api.bittrex.endpoint.BittrexService;
import com.ilkayaktas.cryptowatchdogserver.controller.api.bittrex.model.BittrexParser;
import com.ilkayaktas.cryptowatchdogserver.controller.api.btcc.endpoint.BTCCService;
import com.ilkayaktas.cryptowatchdogserver.controller.api.btcc.model.BTCCParser;
import com.ilkayaktas.cryptowatchdogserver.controller.api.btcturk.endpoint.BTCTurkService;
import com.ilkayaktas.cryptowatchdogserver.controller.api.btcturk.model.BTCTurkParser;
import com.ilkayaktas.cryptowatchdogserver.controller.api.cexio.endpoint.CexioService;
import com.ilkayaktas.cryptowatchdogserver.controller.api.cexio.model.CexioParser;
import com.ilkayaktas.cryptowatchdogserver.controller.api.coinbase.endpoint.CoinbaseService;
import com.ilkayaktas.cryptowatchdogserver.controller.api.coinbase.model.CoinbaseParser;
import com.ilkayaktas.cryptowatchdogserver.controller.api.coinmarketcap.endpoint.CoinmarketcapService;
import com.ilkayaktas.cryptowatchdogserver.controller.api.coinmarketcap.model.CoinmarketcapParser;
import com.ilkayaktas.cryptowatchdogserver.controller.api.gdax.endpoint.GdaxService;
import com.ilkayaktas.cryptowatchdogserver.controller.api.gdax.model.GdaxParser;
import com.ilkayaktas.cryptowatchdogserver.controller.api.hitbtc.endpoint.HitBTCService;
import com.ilkayaktas.cryptowatchdogserver.controller.api.hitbtc.model.HitBTCParser;
import com.ilkayaktas.cryptowatchdogserver.controller.api.huobi.endpoint.HuobiService;
import com.ilkayaktas.cryptowatchdogserver.controller.api.huobi.model.HuobiParser;
import com.ilkayaktas.cryptowatchdogserver.controller.api.koineks.endpoint.KoineksService;
import com.ilkayaktas.cryptowatchdogserver.controller.api.koineks.model.KoineksParser;
import com.ilkayaktas.cryptowatchdogserver.controller.api.koinim.endpoint.KoinimService;
import com.ilkayaktas.cryptowatchdogserver.controller.api.koinim.model.KoinimParser;
import com.ilkayaktas.cryptowatchdogserver.controller.api.kraken.endpoint.KrakenService;
import com.ilkayaktas.cryptowatchdogserver.controller.api.okex.endpoint.OkexService;
import com.ilkayaktas.cryptowatchdogserver.controller.api.okex.model.OkexParser;
import com.ilkayaktas.cryptowatchdogserver.controller.api.paribu.endpoint.ParibuService;
import com.ilkayaktas.cryptowatchdogserver.controller.api.paribu.model.ParibuParser;
import com.ilkayaktas.cryptowatchdogserver.controller.api.paribu.model.ParibuTicker;
import com.ilkayaktas.cryptowatchdogserver.controller.api.poloniex.endpoint.PoloniexService;
import com.ilkayaktas.cryptowatchdogserver.controller.api.poloniex.model.PoloniexParser;
import com.ilkayaktas.cryptowatchdogserver.model.app.Ticker;
import com.ilkayaktas.cryptowatchdogserver.model.utils.AppConstants;
import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Locale;
import java.util.concurrent.TimeUnit;

/**
 * Created by ilkayaktas on 10.06.2018 at 12:18.
 */
@Component
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

        return Observable.create(e -> {
            Request request = new Request.Builder()
                    .url("https://www.paribu.com/ticker")
                    .build();

            HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
            // set your desired log level
            logging.setLevel(HttpLoggingInterceptor.Level.BODY);

            OkHttpClient client = new OkHttpClient.Builder()
                    .readTimeout(15, TimeUnit.SECONDS)
                    .connectTimeout(15, TimeUnit.SECONDS)
                    .addInterceptor(logging)
                    .build();

            Response  response = client.newCall(request).execute();

            ParibuTicker pt = new Gson().fromJson(response.body().charStream(), ParibuTicker.class);

            Ticker localTicker;
            if(symbol != null && symbol.equals(AppConstants.ALLCOINS)) { // retrieve all coins
                localTicker=  ParibuParser.parse(pt, currency);
                e.onNext(localTicker);
            } else { // looking for a specific coin
                localTicker = ParibuParser.parse(pt, currency, symbol);
                e.onNext(localTicker);
            }
            e.onComplete();
        });

    }

    @Override
    public Observable<Ticker> getBTCTurkTicker(Double currency, String symbol) {
        return Observable.create(e -> {
            btcTurkService.getCurrentCurrency("5747b202-4292-42ca-b937-e838b39c074e",String.valueOf(nonce++),"ee79dca9496bf209a854d6a82d1edfba06dc7430735e765e8608a2291faf5da5")
                    .subscribeOn(Schedulers.io())
                    .observeOn(Schedulers.trampoline())
                    .subscribe(ticker -> {
                                if(symbol != null && symbol.equals(AppConstants.ALLCOINS)) { // retrieve all coins
                                    for (Ticker localTicker : BTCTurkParser.parse(ticker, currency)) {
                                        e.onNext(localTicker);
                                    }
                                } else { // looking for a specific coin
                                    Ticker localTicker = BTCTurkParser.parse(ticker, currency, symbol);
                                    e.onNext(localTicker);
                                }
                            },
                            e::onError,
                            e::onComplete);
        });
    }

    @Override
    public Observable<Ticker> getPoloniexTicker(String symbol) {
        return Observable.create(e -> {
            poloniexService.getCurrentCurrency("returnTicker")
                    .subscribeOn(Schedulers.io())
                    .observeOn(Schedulers.trampoline())
                    .subscribe(ticker -> {
                                if (symbol != null && symbol.equals(AppConstants.ALLCOINS)) { // retrieve all coins
                                    for (Ticker localTicker : PoloniexParser.parse(ticker)) {
                                        e.onNext(localTicker);
                                    }
                                } else { // looking for a specific coin
                                    Ticker localTicker = PoloniexParser.parse(ticker, symbol);
                                    e.onNext(localTicker);
                                }
                            },
                            e::onError,
                            e::onComplete);
        });
    }

    @Override
    public Observable<Ticker> getCurrentCurrencyWithLimit(String limit) {
        return Observable.create(e -> {
            coinmarketcapService.getCurrentCurrencyWithLimit(limit)
                    .subscribeOn(Schedulers.io())
                    .observeOn(Schedulers.trampoline())
                    .subscribe(ticker -> {
                                for (Ticker localTicker : CoinmarketcapParser.parse(ticker)) {
                                    e.onNext(localTicker);
                                }
                            },
                            e::onError,
                            e::onComplete);
        });
    }

    @Override
    public Observable<Ticker> getCoinmarketcapTicker(String id) {
        return Observable.create(e -> {
            coinmarketcapService.getCurrentCurrency(id)
                    .subscribeOn(Schedulers.io())
                    .observeOn(Schedulers.trampoline())
                    .subscribe(ticker -> {
                                if(id != null && id.equals(AppConstants.ALLCOINS)) { // retrieve all coins
                                    for (Ticker localTicker : CoinmarketcapParser.parse(ticker)) {
                                        e.onNext(localTicker);
                                    }

                                } else { // looking for a specific coin
                                    Ticker localTicker = CoinmarketcapParser.parse(ticker, id);
                                    e.onNext(localTicker);
                                }
                            },
                            e::onError,
                            e::onComplete);
        });
    }

    @Override
    public Observable<Ticker> getBitstampTicker(String currency_pair) {
        return Observable.create(e -> {
            bitstampService.getCurrentCurrency(currency_pair)
                    .subscribeOn(Schedulers.io())
                    .observeOn(Schedulers.trampoline())
                    .subscribe(ticker -> e.onNext(BitstampParser.parse(ticker, currency_pair)),
                            e::onError,
                            e::onComplete);
        });
    }

    @Override
    public Observable<Ticker> getBithumbTicker(String symbol) {
        return Observable.create(e -> {
            bithumbService.getCurrentCurrency()
                    .subscribeOn(Schedulers.io())
                    .observeOn(Schedulers.trampoline())
                    .subscribe(ticker -> {
                                if(symbol != null && symbol.equals(AppConstants.ALLCOINS)) { // retrieve all coins
                                    for (Ticker localTicker : BithumbParser.parse(ticker)) {
                                        e.onNext(localTicker);
                                    }

                                } else { // looking for a specific coin
                                    Ticker localTicker = BithumbParser.parse(ticker, symbol);
                                    e.onNext(localTicker);
                                }
                            },
                            e::onError,
                            e::onComplete);
        });
    }

    @Override
    public Observable<Ticker> getBitflyerTicker(String symbol) {
        return Observable.create(e -> {
            bitflyerService.getCurrentCurrency()
                    .subscribeOn(Schedulers.io())
                    .observeOn(Schedulers.trampoline())
                    .subscribe(ticker -> {
                                if(symbol != null && symbol.equals(AppConstants.ALLCOINS)) { // retrieve all coins
                                    for (Ticker localTicker : BitflyerParser.parse(ticker)) {
                                        e.onNext(localTicker);
                                    }
                                } else { // looking for a specific coin
                                    Ticker localTicker = BitflyerParser.parse(ticker, symbol);
                                    e.onNext(localTicker);
                                }
                            },
                            e::onError,
                            e::onComplete);
        });
    }

    @Override
    public Observable<Ticker> getBTCCTicker(String tickerSymbol) {
        return Observable.create(e -> {
            btccService.getCurrentCurrency()
                    .subscribeOn(Schedulers.io())
                    .observeOn(Schedulers.trampoline())
                    .subscribe(ticker -> {
                                if(tickerSymbol != null && tickerSymbol.equals(AppConstants.ALLCOINS)) { // retrieve all coins
                                    for (Ticker localTicker : BTCCParser.parse(ticker)) {
                                        e.onNext(localTicker);
                                    }
                                } else { // looking for a specific coin
                                    Ticker localTicker = BTCCParser.parse(ticker, tickerSymbol);
                                    e.onNext(localTicker);
                                }
                            },
                            e::onError,
                            e::onComplete);
        });
    }

    @Override
    public Observable<Ticker> getBittrexTicker(String market) {
        return Observable.create(e -> {
            bittrexService.getCurrentCurrency(market)
                    .subscribeOn(Schedulers.io())
                    .observeOn(Schedulers.trampoline())
                    .subscribe(ticker -> e.onNext(BittrexParser.parse(ticker, market)),
                            e::onError,
                            e::onComplete);
        });
    }

    @Override
    public Observable<Ticker> getBitfinexTicker(String symbol) {
        return Observable.create(e -> {
            bitfinexService.getCurrentCurrency(symbol)
                    .subscribeOn(Schedulers.io())
                    .observeOn(Schedulers.trampoline())
                    .subscribe(ticker -> e.onNext(BitfinexParser.parse(ticker, symbol)),
                            e::onError,
                            e::onComplete);
        });
    }

    @Override
    public Observable<Ticker> getGdaxTicker(String productID) {
        return Observable.create(e -> {
            gdaxService.getCurrentCurrency(productID)
                    .subscribeOn(Schedulers.io())
                    .observeOn(Schedulers.trampoline())
                    .subscribe(ticker -> e.onNext(GdaxParser.parse(ticker, productID)),
                            e::onError,
                            e::onComplete);
        });
    }

    @Override
    public Observable<Ticker> getHitBTCTicker(String tickerSymbol) {
        return Observable.create(e -> {
            hitBTCService.getCurrentCurrency()
                    .subscribeOn(Schedulers.io())
                    .observeOn(Schedulers.trampoline())
                    .subscribe(ticker -> {
                                if(tickerSymbol != null && tickerSymbol.equals(AppConstants.ALLCOINS)) { // retrieve all coins
                                    for (Ticker localTicker : HitBTCParser.parse(ticker)) {
                                        e.onNext(localTicker);
                                    }

                                } else { // looking for a specific coin
                                    for (Ticker localTicker : HitBTCParser.parse(ticker)) {
                                        if(tickerSymbol.equals(localTicker.symbol)) {
                                            e.onNext(localTicker);
                                            return;
                                        }
                                    }
                                    e.onError(new Throwable("Coin couldn't be found!"));
                                }
                            },
                            e::onError,
                            e::onComplete);
        });
    }

    @Override
    public Observable<Ticker> getCoinbaseTicker(String currency) {
        return Observable.create(e -> {
            coinbaseService.getCurrentCurrency(currency)
                    .subscribeOn(Schedulers.io())
                    .observeOn(Schedulers.trampoline())
                    .subscribe(ticker -> e.onNext(CoinbaseParser.parse(ticker)),
                            e::onError,
                            e::onComplete);
        });
    }

    @Override
    public Observable<Ticker> getBinanceTicker(String tickerSymbol) {
        return Observable.create(e -> {
            binanceService.getCurrentCurrency()
                    .subscribeOn(Schedulers.io())
                    .observeOn(Schedulers.trampoline())
                    .subscribe(ticker ->  {
                                if(tickerSymbol != null && tickerSymbol.equals(AppConstants.ALLCOINS)) { // retrieve all coins
                                    for (Ticker localTicker : BinanceParser.parse(ticker)) {
                                        e.onNext(localTicker);
                                    }

                                } else { // looking for a specific coin
                                    for (Ticker localTicker : BinanceParser.parse(ticker)) {
                                        if(tickerSymbol.equals(localTicker.symbol)) {
                                            e.onNext(localTicker);
                                            return;
                                        }
                                    }
                                    e.onError(new Throwable("Coin couldn't be found!"));
                                }

                            },
                            e::onError,
                            e::onComplete);
        });
    }

    @Override
    public Observable<Ticker> getKoineksTicker(Double currency, String tickerSymbol) {
        return Observable.create(e -> {
            koineksService.getCurrentCurrency()
                    .subscribeOn(Schedulers.io())
                    .observeOn(Schedulers.trampoline())
                    .subscribe(ticker ->  {
                                if(tickerSymbol != null && tickerSymbol.equals(AppConstants.ALLCOINS)) { // retrieve all coins
                                    for (Ticker localTicker : KoineksParser.parse(ticker, currency)) {
                                        e.onNext(localTicker);
                                    }

                                } else { // looking for a specific coin
                                    for (Ticker localTicker : KoineksParser.parse(ticker, currency)) {
                                        if(tickerSymbol.equals(localTicker.symbol)) {
                                            e.onNext(localTicker);
                                            return;
                                        }
                                    }
                                    e.onError(new Throwable("Coin couldn't be found!"));
                                }
                            },
                            e::onError,
                            e::onComplete);
        });
    }

    @Override
    public Observable<Ticker> getKoinimTicker(Double currency, String tickerSymbol) {
        return Observable.create(e -> {
            if(tickerSymbol.equals("BTC")){
                koinimService.getCurrentCurrency()
                        .subscribeOn(Schedulers.io())
                        .observeOn(Schedulers.trampoline())
                        .subscribe(ticker -> e.onNext(KoinimParser.parse(ticker, currency, tickerSymbol)),
                                e::onError,
                                e::onComplete);
            } else{
                koinimService.getCurrentCurrency(tickerSymbol.toLowerCase(Locale.ENGLISH))
                        .subscribeOn(Schedulers.io())
                        .observeOn(Schedulers.trampoline())
                        .subscribe(ticker -> e.onNext(KoinimParser.parse(ticker, currency, tickerSymbol)),
                                e::onError,
                                e::onComplete);
            }
        });
    }

    @Override
    public Observable<Ticker> getCexioTicker(String tickerSymbol) {
        return Observable.create(e -> {
            cexioService.getCurrentCurrency(tickerSymbol, "USD")
                    .subscribeOn(Schedulers.io())
                    .observeOn(Schedulers.trampoline())
                    .subscribe(ticker ->  e.onNext(CexioParser.parse(ticker, tickerSymbol)),
                            e::onError,
                            e::onComplete);
        });
    }

    @Override
    public Observable<Ticker> getOkexTicker(String symbolPair) {
        return Observable.create(e -> {
            String symbol = symbolPair.split("_")[0].toUpperCase(Locale.ENGLISH);
            String pair = symbolPair.split("_")[1].toUpperCase(Locale.ENGLISH).substring(0,3);
            okexService.getCurrentCurrency(symbolPair)
                    .subscribeOn(Schedulers.io())
                    .observeOn(Schedulers.trampoline())
                    .subscribe(ticker ->  e.onNext(OkexParser.parse(ticker, symbol, pair)),
                            e::onError,
                            e::onComplete);

        });
    }

    @Override
    public Observable<Ticker> getHuobiTicker(String baseSymbol, String quotaSymbol) {
        return Observable.create(e -> {
            huobiService.getCurrentCurrency(baseSymbol+quotaSymbol)
                    .subscribeOn(Schedulers.io())
                    .observeOn(Schedulers.trampoline())
                    .subscribe(ticker -> {
                                e.onNext(HuobiParser.parse(ticker, baseSymbol, quotaSymbol));
                            },
                            e::onError,
                            e::onComplete);

        });
    }

    @Override
    public Observable<Ticker> getKrakenTicker(String symbolPair) {
        return Observable.create(e -> {
            krakenService.getCurrentCurrency(symbolPair)
                    .subscribeOn(Schedulers.io())
                    .observeOn(Schedulers.trampoline())
                    .subscribe(ticker -> {
                                System.out.println(ticker);
                            },
                            e::onError,
                            e::onComplete);

        });
    }
}
