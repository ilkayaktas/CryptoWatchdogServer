package com.ilkayaktas.cryptowatchdogserver.controller.api.bitfinex.endpoint;

import com.ilkayaktas.cryptowatchdogserver.controller.api.bitfinex.model.BitfinexTicker;
import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by aselsan on 16.12.2017 at 13:50.
 */

public interface BitfinexService {
    @GET("pubticker/{symbol}")
    Observable<BitfinexTicker> getCurrentCurrency(@Path("symbol") String symbol);

}
