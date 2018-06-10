package com.ilkayaktas.cryptowatchdogserver.controller.api.binance.endpoint;

import com.ilkayaktas.cryptowatchdogserver.controller.api.binance.model.BinanceTicker;
import io.reactivex.Observable;
import retrofit2.http.GET;

/**
 * Created by aselsan on 16.12.2017 at 13:50.
 */

public interface BinanceService {
    @GET("api/v1/ticker/allPrices")
    Observable<BinanceTicker[]> getCurrentCurrency();

}
