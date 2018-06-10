package com.ilkayaktas.cryptowatchdogserver.controller.api.coinmarketcap.endpoint;

import com.ilkayaktas.cryptowatchdogserver.controller.api.coinmarketcap.model.CoinmarketcapTicker;
import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by aselsan on 16.12.2017 at 13:50.
 */

public interface CoinmarketcapService {
    @GET("ticker/")
    Observable<CoinmarketcapTicker[]> getCurrentCurrency();

    @GET("ticker/")
    Observable<CoinmarketcapTicker[]> getCurrentCurrencyWithLimit(@Query("limit") String limit);

    @GET("ticker/{id}")
    Observable<CoinmarketcapTicker[]> getCurrentCurrency(@Path("id") String id);

}
