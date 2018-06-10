package com.ilkayaktas.cryptowatchdogserver.controller.api.koinim.endpoint;

import com.ilkayaktas.cryptowatchdogserver.controller.api.koinim.model.KoinimTicker;
import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by aselsan on 16.12.2017 at 13:50.
 */

public interface KoinimService {
    @GET("ticker")
    Observable<KoinimTicker> getCurrentCurrency();

    @GET("ticker/{symbol}")
    Observable<KoinimTicker> getCurrentCurrency(@Path("symbol") String symbol);

}
