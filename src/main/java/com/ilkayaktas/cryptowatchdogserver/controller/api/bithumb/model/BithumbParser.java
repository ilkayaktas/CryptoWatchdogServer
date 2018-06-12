package com.ilkayaktas.cryptowatchdogserver.controller.api.bithumb.model;


import com.ilkayaktas.cryptowatchdogserver.model.app.Ticker;
import com.ilkayaktas.cryptowatchdogserver.model.utils.PriceUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by aselsan on 16.12.2017 at 19:46.
 */

public class BithumbParser {
    public static List<Ticker> parse(BithumbTicker ticker) {
        List<Ticker> localTickers = new ArrayList<>();

        localTickers.add(parseBTC(ticker));

        localTickers.add(parseETH(ticker));

        localTickers.add(parseETC(ticker));

        localTickers.add(parseDASH(ticker));

        localTickers.add(parseLTC(ticker));

        localTickers.add(parseXRP(ticker));

        localTickers.add(parseBCH(ticker));

        localTickers.add(parseQTUM(ticker));

        localTickers.add(parseBTG(ticker));

        localTickers.add(parseEOS(ticker));

        return localTickers;
    }

    public static Ticker parse(BithumbTicker ticker, String tickerSymbol) {

        if (tickerSymbol.equals("BTC")) {
            return parseBTC(ticker);
        }

        if (tickerSymbol.equals("ETC")) {
            return parseETC(ticker);
        }

        if (tickerSymbol.equals("ETH")) {
            return parseETH(ticker);
        }

        if (tickerSymbol.equals("DASH")) {
            return parseDASH(ticker);
        }

        if (tickerSymbol.equals("LTC")) {
            return parseLTC(ticker);
        }

        if (tickerSymbol.equals("XRP")) {
            return parseXRP(ticker);
        }

        if (tickerSymbol.equals("BCH")) {
            return parseBCH(ticker);
        }

        if (tickerSymbol.equals("QTUM")) {
            return parseQTUM(ticker);
        }

        if (tickerSymbol.equals("BTG")) {
            return parseBTG(ticker);
        }

        if (tickerSymbol.equals("EOS")) {
            return parseEOS(ticker);
        }

        return null;

    }

    private static Ticker parseEOS(BithumbTicker ticker) {
        return Ticker.builder()
                .last((PriceUtils.formatPrice(Double.valueOf(ticker.data.eOS.buyPrice) / 1000)))
                .symbol("EOS")
                .icon("eos")
                .percentChange("0")
                .high24hr(ticker.data.eOS.maxPrice)
                .highestBid(ticker.data.eOS.sellPrice)
                .volume(ticker.data.eOS.volume1day)
                .exchangeType(Ticker.ExchangeType.DOLAR)
                .build();
    }

    private static Ticker parseBTG(BithumbTicker ticker) {
        return Ticker.builder()
                .last((PriceUtils.formatPrice(Double.valueOf(ticker.data.bTG.buyPrice) / 1000)))
                .symbol("BTG")
                .icon("btg")
                .percentChange("0")
                .high24hr(ticker.data.bTG.maxPrice)
                .highestBid(ticker.data.bTG.sellPrice)
                .volume(ticker.data.bTG.volume1day)
                .exchangeType(Ticker.ExchangeType.DOLAR)
                .build();
    }

    private static Ticker parseQTUM(BithumbTicker ticker) {
        return Ticker.builder()
                .last((PriceUtils.formatPrice(Double.valueOf(ticker.data.qTUM.buyPrice) / 1000)))
                .symbol("QTUM")
                .icon("qtum")
                .percentChange("0")
                .high24hr(ticker.data.qTUM.maxPrice)
                .highestBid(ticker.data.qTUM.sellPrice)
                .volume(ticker.data.qTUM.volume1day)
                .exchangeType(Ticker.ExchangeType.DOLAR)
                .build();
    }

    private static Ticker parseBCH(BithumbTicker ticker) {
        return Ticker.builder()
                .last((PriceUtils.formatPrice(Double.valueOf(ticker.data.bCH.buyPrice) / 1000)))
                .symbol("BCH")
                .icon("bch")
                .percentChange("0")
                .high24hr(ticker.data.bCH.maxPrice)
                .highestBid(ticker.data.bCH.sellPrice)
                .volume(ticker.data.bCH.volume1day)
                .exchangeType(Ticker.ExchangeType.DOLAR)
                .build();
    }

    private static Ticker parseXRP(BithumbTicker ticker) {
        return Ticker.builder()
                .last((PriceUtils.formatPrice(Double.valueOf(ticker.data.xRP.buyPrice) / 1000)))
                .symbol("XRP")
                .icon("xrp")
                .percentChange("0")
                .high24hr(ticker.data.xRP.maxPrice)
                .highestBid(ticker.data.xRP.sellPrice)
                .volume(ticker.data.xRP.volume1day)
                .exchangeType(Ticker.ExchangeType.DOLAR)
                .build();
    }

    private static Ticker parseLTC(BithumbTicker ticker) {
        return Ticker.builder()
                .last((PriceUtils.formatPrice(Double.valueOf(ticker.data.lTC.buyPrice) / 1000)))
                .symbol("LTC")
                .icon("ltc")
                .percentChange("0")
                .high24hr(ticker.data.lTC.maxPrice)
                .highestBid(ticker.data.lTC.sellPrice)
                .volume(ticker.data.lTC.volume1day)
                .exchangeType(Ticker.ExchangeType.DOLAR)
                .build();
    }

    private static Ticker parseDASH(BithumbTicker ticker) {
        return Ticker.builder()
                .last((PriceUtils.formatPrice(Double.valueOf(ticker.data.dASH.buyPrice) / 1000)))
                .symbol("DASH")
                .icon("dash")
                .percentChange("0")
                .high24hr(ticker.data.dASH.maxPrice)
                .highestBid(ticker.data.dASH.sellPrice)
                .volume(ticker.data.dASH.volume1day)
                .exchangeType(Ticker.ExchangeType.DOLAR)
                .build();
    }

    private static Ticker parseETC(BithumbTicker ticker) {
        return Ticker.builder()
                .last((PriceUtils.formatPrice(Double.valueOf(ticker.data.eTC.buyPrice) / 1000)))
                .symbol("ETC")
                .icon("etc")
                .percentChange("0")
                .high24hr(ticker.data.eTC.maxPrice)
                .highestBid(ticker.data.eTC.sellPrice)
                .volume(ticker.data.eTC.volume1day)
                .exchangeType(Ticker.ExchangeType.DOLAR)
                .build();
    }

    private static Ticker parseETH(BithumbTicker ticker) {
        return Ticker.builder()
                .last((PriceUtils.formatPrice(Double.valueOf(ticker.data.eTH.buyPrice) / 1000)))
                .symbol("ETH")
                .icon("eth")
                .percentChange("0")
                .high24hr(ticker.data.eTH.maxPrice)
                .highestBid(ticker.data.eTH.sellPrice)
                .volume(ticker.data.eTH.volume1day)
                .exchangeType(Ticker.ExchangeType.DOLAR)
                .build();
    }

    private static Ticker parseBTC(BithumbTicker ticker) {
        return Ticker.builder()
                .last((PriceUtils.formatPrice(Double.valueOf(ticker.data.bTC.buyPrice) / 1000)))
                .symbol("BTC")
                .icon("btc")
                .percentChange("0")
                .high24hr(ticker.data.bTC.maxPrice)
                .highestBid(ticker.data.bTC.sellPrice)
                .volume(ticker.data.bTC.volume1day)
                .exchangeType(Ticker.ExchangeType.DOLAR)
                .build();
    }
}
