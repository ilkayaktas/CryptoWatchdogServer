package com.ilkayaktas.cryptowatchdogserver.controller.api.poloniex.model;


import com.ilkayaktas.cryptowatchdogserver.controller.api.poloniex.model.ticker.PoloniexTicker;
import com.ilkayaktas.cryptowatchdogserver.model.app.Ticker;
import com.ilkayaktas.cryptowatchdogserver.model.utils.PriceUtils;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by aselsan on 16.12.2017 at 01:23.
 */

public class PoloniexParser {
    public static List<Ticker> parse(PoloniexTicker ticker){
        List<Ticker> localTickers = new ArrayList<>();

        localTickers.add(parseBTC(ticker));

        localTickers.add(parseBCH(ticker));

        localTickers.add(parseETH(ticker));

        localTickers.add(parseETC(ticker));

        localTickers.add(parseLTC(ticker));

        localTickers.add(parseDASH(ticker));

        localTickers.add(parseNXT(ticker));

        localTickers.add(parseREP(ticker));

        localTickers.add(parseSTR(ticker));

        localTickers.add(parseXMR(ticker));

        localTickers.add(parseXRP(ticker));

        localTickers.add(parseZEC(ticker));

        return localTickers;
    }

    public static Ticker parse(PoloniexTicker ticker, String tickerSymbol){
        if(tickerSymbol.equals("ZEC")){
            return parseZEC(ticker);
        }

        if(tickerSymbol.equals("XRP")){
            return parseXRP(ticker);
        }

        if(tickerSymbol.equals("XMR")){
            return parseXMR(ticker);
        }

        if(tickerSymbol.equals("STR")){
            return parseSTR(ticker);
        }

        if(tickerSymbol.equals("REP")){
            return parseREP(ticker);
        }

        if(tickerSymbol.equals("NXT")){
            return parseNXT(ticker);
        }

        if(tickerSymbol.equals("DASH")){
            return parseDASH(ticker);
        }

        if(tickerSymbol.equals("LTC")){
            return parseLTC(ticker);
        }

        if(tickerSymbol.equals("ETC")){
            return parseETC(ticker);
        }

        if(tickerSymbol.equals("ETH")){
            return parseETH(ticker);
        }

        if(tickerSymbol.equals("BCH")){
            return parseBCH(ticker);
        }

        if(tickerSymbol.equals("BTC")){
            return parseBTC(ticker);
        }

        return null;
    }

    private static Ticker parseZEC(PoloniexTicker ticker) {
        return Ticker.builder()
                .last(PriceUtils.formatPrice(ticker.uSDTZEC.last))
                .symbol("ZEC")
                .icon("zec")
                .percentChange(new DecimalFormat("#.##").format(Double.valueOf(ticker.uSDTZEC.percentChange)*100))
                .high24hr(ticker.uSDTZEC.high24hr)
                .volume(ticker.uSDTZEC.baseVolume)
                .exchangeType(Ticker.ExchangeType.DOLAR)
                .otherCurrency(PriceUtils.formatPrice(ticker.bTCZEC.last))
                .otherCurrencyType(Ticker.ExchangeType.BTC)
                .build();
    }

    private static Ticker parseXRP(PoloniexTicker ticker) {
        return Ticker.builder()
                .last(PriceUtils.formatPrice(ticker.uSDTXRP.last))
                .symbol("XRP")
                .icon("xrp")
                .percentChange(new DecimalFormat("#.##").format(Double.valueOf(ticker.uSDTXRP.percentChange)*100))
                .high24hr(ticker.uSDTXRP.high24hr)
                .volume(ticker.uSDTXRP.baseVolume)
                .exchangeType(Ticker.ExchangeType.DOLAR)
                .otherCurrency(PriceUtils.formatPrice(ticker.bTCXRP.last))
                .otherCurrencyType(Ticker.ExchangeType.BTC)
                .build();
    }

    private static Ticker parseXMR(PoloniexTicker ticker) {
        return Ticker.builder()
                .last(PriceUtils.formatPrice(ticker.uSDTXMR.last))
                .symbol("XMR")
                .icon("xmr")
                .percentChange(new DecimalFormat("#.##").format(Double.valueOf(ticker.uSDTXMR.percentChange)*100))
                .high24hr(ticker.uSDTXMR.high24hr)
                .volume(ticker.uSDTXMR.baseVolume)
                .exchangeType(Ticker.ExchangeType.DOLAR)
                .otherCurrency(PriceUtils.formatPrice(ticker.bTCXMR.last))
                .otherCurrencyType(Ticker.ExchangeType.BTC)
                .build();
    }

    private static Ticker parseSTR(PoloniexTicker ticker) {
        return Ticker.builder()
                .last(PriceUtils.formatPrice(ticker.uSDTSTR.last))
                .symbol("XLM")
                .icon("xlm")
                .percentChange(new DecimalFormat("#.##").format(Double.valueOf(ticker.uSDTSTR.percentChange)*100))
                .high24hr(ticker.uSDTSTR.high24hr)
                .volume(ticker.uSDTSTR.baseVolume)
                .exchangeType(Ticker.ExchangeType.DOLAR)
                .otherCurrency(PriceUtils.formatPrice(ticker.bTCSTR.last))
                .otherCurrencyType(Ticker.ExchangeType.BTC)
                .build();
    }

    private static Ticker parseREP(PoloniexTicker ticker) {
        return Ticker.builder()
                .last(PriceUtils.formatPrice(ticker.uSDTREP.last))
                .symbol("REP")
                .icon("rep")
                .percentChange(new DecimalFormat("#.##").format(Double.valueOf(ticker.uSDTREP.percentChange)*100))
                .high24hr(ticker.uSDTREP.high24hr)
                .volume(ticker.uSDTREP.baseVolume)
                .exchangeType(Ticker.ExchangeType.DOLAR)
                .otherCurrency(PriceUtils.formatPrice(ticker.bTCREP.last))
                .otherCurrencyType(Ticker.ExchangeType.BTC)
                .build();
    }

    private static Ticker parseNXT(PoloniexTicker ticker) {
        return Ticker.builder()
                .last(PriceUtils.formatPrice(ticker.uSDTNXT.last))
                .symbol("NXT")
                .icon("nxt")
                .percentChange(new DecimalFormat("#.##").format(Double.valueOf(ticker.uSDTNXT.percentChange)*100))
                .high24hr(ticker.uSDTNXT.high24hr)
                .volume(ticker.uSDTNXT.baseVolume)
                .exchangeType(Ticker.ExchangeType.DOLAR)
                .otherCurrency(PriceUtils.formatPrice(ticker.bTCNXT.last))
                .otherCurrencyType(Ticker.ExchangeType.BTC)
                .build();
    }

    private static Ticker parseDASH(PoloniexTicker ticker) {
        return Ticker.builder()
                .last(PriceUtils.formatPrice(ticker.uSDTDASH.last))
                .symbol("DASH")
                .icon("dash")
                .percentChange(new DecimalFormat("#.##").format(Double.valueOf(ticker.uSDTDASH.percentChange)*100))
                .high24hr(ticker.uSDTDASH.high24hr)
                .volume(ticker.uSDTDASH.baseVolume)
                .exchangeType(Ticker.ExchangeType.DOLAR)
                .otherCurrency(PriceUtils.formatPrice(ticker.bTCDASH.last))
                .otherCurrencyType(Ticker.ExchangeType.BTC)
                .build();
    }

    private static Ticker parseLTC(PoloniexTicker ticker) {
        return Ticker.builder()
                .last(PriceUtils.formatPrice(ticker.uSDTLTC.last))
                .symbol("LTC")
                .icon("ltc")
                .percentChange(new DecimalFormat("#.##").format(Double.valueOf(ticker.uSDTLTC.percentChange)*100))
                .high24hr(ticker.uSDTLTC.high24hr)
                .volume(ticker.uSDTLTC.baseVolume)
                .exchangeType(Ticker.ExchangeType.DOLAR)
                .otherCurrency(PriceUtils.formatPrice(ticker.bTCLTC.last))
                .otherCurrencyType(Ticker.ExchangeType.BTC)
                .build();
    }

    private static Ticker parseETC(PoloniexTicker ticker) {
        return Ticker.builder()
                .last(PriceUtils.formatPrice(ticker.uSDTETC.last))
                .symbol("ETC")
                .icon("etc")
                .percentChange(new DecimalFormat("#.##").format(Double.valueOf(ticker.uSDTETC.percentChange)*100))
                .high24hr(ticker.uSDTETC.high24hr)
                .volume(ticker.uSDTETC.baseVolume)
                .exchangeType(Ticker.ExchangeType.DOLAR)
                .otherCurrency(PriceUtils.formatPrice(ticker.bTCETC.last))
                .otherCurrencyType(Ticker.ExchangeType.BTC)
                .build();
    }

    private static Ticker parseETH(PoloniexTicker ticker) {
        return Ticker.builder()
                .last(PriceUtils.formatPrice(ticker.uSDTETH.last))
                .symbol("ETH")
                .icon("eth")
                .percentChange(new DecimalFormat("#.##").format(Double.valueOf(ticker.uSDTETH.percentChange)*100))
                .high24hr(ticker.uSDTETH.high24hr)
                .volume(ticker.uSDTETH.baseVolume)
                .exchangeType(Ticker.ExchangeType.DOLAR)
                .otherCurrency(PriceUtils.formatPrice(ticker.bTCETH.last))
                .otherCurrencyType(Ticker.ExchangeType.BTC)
                .build();
    }

    private static Ticker parseBCH(PoloniexTicker ticker) {
        return Ticker.builder()
                .last(PriceUtils.formatPrice(ticker.uSDTBCH.last))
                .symbol("BCH")
                .icon("bch")
                .percentChange(new DecimalFormat("#.##").format(Double.valueOf(ticker.uSDTBCH.percentChange)*100))
                .high24hr(ticker.uSDTBCH.high24hr)
                .volume(ticker.uSDTBCH.baseVolume)
                .exchangeType(Ticker.ExchangeType.DOLAR)
                .otherCurrency(PriceUtils.formatPrice(ticker.bTCBCH.last))
                .otherCurrencyType(Ticker.ExchangeType.BTC)
                .build();
    }

    private static Ticker parseBTC(PoloniexTicker ticker){
        return Ticker.builder()
                .last(PriceUtils.formatPrice(ticker.uSDTBTC.last))
                .symbol("BTC")
                .icon("btc")
                .percentChange(new DecimalFormat("#.##").format(Double.valueOf(ticker.uSDTBTC.percentChange)*100))
                .high24hr(ticker.uSDTBTC.high24hr)
                .volume(ticker.uSDTBTC.baseVolume)
                .exchangeType(Ticker.ExchangeType.DOLAR)
                .build();
    }
}
