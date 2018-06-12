package com.ilkayaktas.cryptowatchdogserver.controller.services;

import com.ilkayaktas.cryptowatchdogserver.controller.IDataManager;
import com.ilkayaktas.cryptowatchdogserver.model.app.Ticker;
import com.ilkayaktas.cryptowatchdogserver.model.utils.AppConstants;
import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ilkayaktas on 12.06.2018 at 12:29.
 */

@Configuration
@EnableScheduling
public class ScheduledTask {
    @Autowired
    IDataManager dataManager;

    private List<Ticker> tickerList = new ArrayList<>();

    @Scheduled(fixedRateString = "${fixedRate.in.milliseconds}", initialDelay = 1000)
    void retrieveMarketData(){
//        manageTickers(dataManager.getParibuTicker(currency, AppConstants.ALLCOINS));
//        manageTickers(dataManager.getBTCTurkTicker(currency, AppConstants.ALLCOINS));
//        manageTickers(dataManager.getBTCTurkTicker(currency, AppConstants.ALLCOINS));
        manageTickers(dataManager.getPoloniexTicker(AppConstants.ALLCOINS));
        manageTickers(dataManager.getCoinmarketcapTicker(AppConstants.ALLCOINS));
        manageTickers(dataManager.getBitfinexTicker("btcusd"));
        manageTickers(dataManager.getBitfinexTicker("ltcusd"));
        manageTickers(dataManager.getBitfinexTicker("ltcbtc"));
        manageTickers(dataManager.getBitfinexTicker("ethusd"));
        manageTickers(dataManager.getBitfinexTicker("ethbtc"));
        manageTickers(dataManager.getBitfinexTicker("etcusd"));
        manageTickers(dataManager.getBitfinexTicker("etcbtc"));
        manageTickers(dataManager.getBitfinexTicker("rrtusd"));
        manageTickers(dataManager.getBitfinexTicker("rrtbtc"));
        manageTickers(dataManager.getBitfinexTicker("zecusd"));
        manageTickers(dataManager.getBitfinexTicker("xmrusd"));
        manageTickers(dataManager.getBitfinexTicker("dshusd"));
        manageTickers(dataManager.getBitfinexTicker("dshbtc"));
        manageTickers(dataManager.getBitfinexTicker("bccusd"));
        manageTickers(dataManager.getBitfinexTicker("bccbtc"));
        manageTickers(dataManager.getBitfinexTicker("bcuusd"));
        manageTickers(dataManager.getBitfinexTicker("xrpusd"));
        manageTickers(dataManager.getBitfinexTicker("xrpbtc"));
        manageTickers(dataManager.getBitfinexTicker("iotusd"));
        manageTickers(dataManager.getBitfinexTicker("eosusd"));
        manageTickers(dataManager.getBitfinexTicker("eosbtc"));
        manageTickers(dataManager.getBitfinexTicker("sanusd"));
        manageTickers(dataManager.getBitfinexTicker("sanbtc"));
        manageTickers(dataManager.getBitfinexTicker("omgusd"));
        manageTickers(dataManager.getBitfinexTicker("bchusd"));
        manageTickers(dataManager.getBitfinexTicker("bchbtc"));
        manageTickers(dataManager.getBitfinexTicker("neousd"));
        manageTickers(dataManager.getBitfinexTicker("etpusd"));
        manageTickers(dataManager.getBitfinexTicker("qtmusd"));
        manageTickers(dataManager.getBitfinexTicker("bt1usd"));
        manageTickers(dataManager.getBitfinexTicker("btgusd"));
        manageTickers(dataManager.getBithumbTicker(AppConstants.ALLCOINS));
        manageTickers(dataManager.getGdaxTicker("BTC-USD"));
        manageTickers(dataManager.getGdaxTicker("ETH-USD"));
        manageTickers(dataManager.getGdaxTicker("LTC-USD"));
        manageTickers(dataManager.getBTCCTicker(AppConstants.ALLCOINS));
        manageTickers(dataManager.getHitBTCTicker(AppConstants.ALLCOINS));
        manageTickers(dataManager.getBitstampTicker("btcusd"));
        manageTickers(dataManager.getBitstampTicker("xrpusd"));
        manageTickers(dataManager.getBitstampTicker("xrpbtc"));
        manageTickers(dataManager.getBitstampTicker("ltcusd"));
        manageTickers(dataManager.getBitstampTicker("ltcbtc"));
        manageTickers(dataManager.getBitstampTicker("ethusd"));
        manageTickers(dataManager.getBitstampTicker("ethbtc"));
        manageTickers(dataManager.getBitstampTicker("bchusd"));
        manageTickers(dataManager.getBitstampTicker("bchbtc"));
        manageTickers(dataManager.getBittrexTicker("usdt-btc"));
        manageTickers(dataManager.getBittrexTicker("usdt-eth"));
        manageTickers(dataManager.getBittrexTicker("usdt-etc"));
        manageTickers(dataManager.getBittrexTicker("usdt-ltc"));
        manageTickers(dataManager.getBittrexTicker("usdt-btg"));
        manageTickers(dataManager.getBittrexTicker("usdt-bcc"));
        manageTickers(dataManager.getBittrexTicker("usdt-zec"));
        manageTickers(dataManager.getBittrexTicker("usdt-xrp"));
        manageTickers(dataManager.getBittrexTicker("usdt-xmr"));
        manageTickers(dataManager.getBittrexTicker("usdt-dash"));
        manageTickers(dataManager.getBittrexTicker("usdt-neo"));
        manageTickers(dataManager.getBittrexTicker("usdt-omg"));
        manageTickers(dataManager.getBittrexTicker("usdt-ada"));
        manageTickers(dataManager.getBittrexTicker("usdt-xvg"));
        manageTickers(dataManager.getBittrexTicker("usdt-nxt"));
        manageTickers(dataManager.getBittrexTicker("btc-eth"));
        manageTickers(dataManager.getBittrexTicker("btc-etc"));
        manageTickers(dataManager.getBittrexTicker("btc-ltc"));
        manageTickers(dataManager.getBittrexTicker("btc-btg"));
        manageTickers(dataManager.getBittrexTicker("btc-bcc"));
        manageTickers(dataManager.getBittrexTicker("btc-zec"));
        manageTickers(dataManager.getBittrexTicker("btc-xrp"));
        manageTickers(dataManager.getBittrexTicker("btc-xmr"));
        manageTickers(dataManager.getBittrexTicker("btc-dash"));
        manageTickers(dataManager.getBittrexTicker("btc-neo"));
        manageTickers(dataManager.getBittrexTicker("btc-omg"));
        manageTickers(dataManager.getBittrexTicker("btc-ada"));
        manageTickers(dataManager.getBittrexTicker("btc-xvg"));
        manageTickers(dataManager.getBittrexTicker("btc-nxt"));
        manageTickers(dataManager.getBitflyerTicker(AppConstants.ALLCOINS));
        manageTickers(dataManager.getCoinbaseTicker("BTC"));
        manageTickers(dataManager.getCoinbaseTicker("ETH"));
        manageTickers(dataManager.getCoinbaseTicker("LTC"));
        manageTickers(dataManager.getBinanceTicker(AppConstants.ALLCOINS));
//        manageTickers(dataManager.getKoineksTicker(currency, AppConstants.ALLCOINS));
//        manageTickers(dataManager.getKoinimTicker(currency, "BTC"));
//        manageTickers(dataManager.getKoinimTicker(currency, "LTC"));
        manageTickers(dataManager.getCexioTicker("BTC"));
        manageTickers(dataManager.getCexioTicker("ETH"));
        manageTickers(dataManager.getCexioTicker("BCH"));
        manageTickers(dataManager.getCexioTicker("BTG"));
        manageTickers(dataManager.getCexioTicker("DASH"));
        manageTickers(dataManager.getCexioTicker("XRP"));
        manageTickers(dataManager.getCexioTicker("ZEC"));
        manageTickers(dataManager.getOkexTicker("btc_usdt"));
        manageTickers(dataManager.getOkexTicker("eth_usdt"));
        manageTickers(dataManager.getOkexTicker("ltc_usdt"));
        manageTickers(dataManager.getOkexTicker("etc_usdt"));
        manageTickers(dataManager.getOkexTicker("bch_usdt"));
        manageTickers(dataManager.getOkexTicker("qtum_usdt"));
        manageTickers(dataManager.getOkexTicker("hsr_usdt"));
        manageTickers(dataManager.getOkexTicker("neo_usdt"));
        manageTickers(dataManager.getOkexTicker("gas_usdt"));
        manageTickers(dataManager.getOkexTicker("ltc_btc"));
        manageTickers(dataManager.getOkexTicker("eth_btc"));
        manageTickers(dataManager.getOkexTicker("etc_btc"));
        manageTickers(dataManager.getOkexTicker("bch_btc"));
        manageTickers(dataManager.getOkexTicker("bt1_btc"));
        manageTickers(dataManager.getOkexTicker("bt2_btc"));
        manageTickers(dataManager.getOkexTicker("btg_btc"));
        manageTickers(dataManager.getOkexTicker("qtum_btc"));
        manageTickers(dataManager.getOkexTicker( "hsr_btc"));
        manageTickers(dataManager.getOkexTicker("neo_btc"));
        manageTickers(dataManager.getOkexTicker("gas_btc"));
        manageTickers(dataManager.getHuobiTicker("btc","usdt"));
        manageTickers(dataManager.getHuobiTicker("etc","usdt"));
        manageTickers(dataManager.getHuobiTicker("eth","usdt"));
        manageTickers(dataManager.getHuobiTicker("ltc","usdt"));
        manageTickers(dataManager.getHuobiTicker("xrp","usdt"));
        manageTickers(dataManager.getHuobiTicker("theta","usdt"));
        manageTickers(dataManager.getHuobiTicker("qtum","usdt"));
        manageTickers(dataManager.getHuobiTicker("neo","usdt"));
        manageTickers(dataManager.getHuobiTicker("nas","usdt"));
        manageTickers(dataManager.getHuobiTicker("storj","usdt"));
        manageTickers(dataManager.getHuobiTicker("zil","usdt"));
        manageTickers(dataManager.getHuobiTicker("ht","usdt"));
        manageTickers(dataManager.getHuobiTicker("bch","usdt"));
        manageTickers(dataManager.getHuobiTicker("gnt","usdt"));
        manageTickers(dataManager.getHuobiTicker("omg","usdt"));
        manageTickers(dataManager.getHuobiTicker("xem","usdt"));
        manageTickers(dataManager.getHuobiTicker("snt","usdt"));
        manageTickers(dataManager.getHuobiTicker("eos","usdt"));
        manageTickers(dataManager.getHuobiTicker("smt","usdt"));
        manageTickers(dataManager.getHuobiTicker("cvc","usdt"));
        manageTickers(dataManager.getHuobiTicker("let","usdt"));
        manageTickers(dataManager.getHuobiTicker("ruff","usdt"));
        manageTickers(dataManager.getHuobiTicker("iost","usdt"));
        manageTickers(dataManager.getHuobiTicker("dta","usdt"));
        manageTickers(dataManager.getHuobiTicker("dash","usdt"));
        manageTickers(dataManager.getHuobiTicker("ven","usdt"));
        manageTickers(dataManager.getHuobiTicker("hsr","usdt"));
        manageTickers(dataManager.getHuobiTicker("elf","usdt"));
        manageTickers(dataManager.getHuobiTicker("zec","usdt"));
        manageTickers(dataManager.getKrakenTicker("BCHUSD"));
        manageTickers(dataManager.getKrakenTicker("DASHUSD"));
        manageTickers(dataManager.getKrakenTicker("EOSUSD"));
        manageTickers(dataManager.getKrakenTicker("GNOUSD"));
    }

    private void manageTickers(Observable<Ticker> tickerObservable) {
        tickerObservable
                .subscribeOn(Schedulers.io())
                .observeOn(Schedulers.trampoline())
                .subscribe(ticker -> {
                            tickerList.add(ticker);
                            System.out.println(ticker.toString());
                        },
                        this::onError,
                        this::onComplete);
    }

    private void onError(Throwable throwable){

    }

    private void onComplete(){

    }
}
